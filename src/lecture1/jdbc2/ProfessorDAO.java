package lecture1.jdbc2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import lecture1.DB;

public class ProfessorDAO {


	private static Professor getProfessorFrom(ResultSet resultSet) throws SQLException {
		Professor professor = new Professor();
		professor.setId(resultSet.getInt("id"));
		professor.setProfessorName(resultSet.getString("ProfessorName"));
		professor.setDepartmentId(resultSet.getInt("departmentId"));
		professor.setDepartmentName(resultSet.getString("departmentName"));
		return professor;
	}

	public static List<Professor> findAll() throws Exception {
		String sql = "SELECT s.*, d.departmentName" +
				" FROM professor s LEFT JOIN department d ON s.departmentId = d.id";
		try (Connection connection = DB.getConnection("student1");
				PreparedStatement statement = connection.prepareStatement(sql);
				ResultSet resultSet = statement.executeQuery()) {
			ArrayList<Professor> list = new ArrayList<Professor>();
			while (resultSet.next())
				list.add(getProfessorFrom(resultSet));
			return list;
		}
	}

	public static Professor findByProfessorName(String professorName) throws Exception {
		String sql = "SELECT s.*, d.departmentName" +
				" FROM professor s LEFT JOIN department d ON s.departmentId = d.id" +
				" WHERE s.professorName = ?";
		try (Connection connection = DB.getConnection("professor1");
				PreparedStatement statement = connection.prepareStatement(sql)) {
			statement.setString(1, professorName);
			try (ResultSet resultSet = statement.executeQuery()) {
				if (resultSet.next())
					return getProfessorFrom(resultSet);
				else
					return null;
			}
		}
	}

	public static Professor findById(int id) throws Exception {
		String sql = "SELECT s.*, d.departmentName " +
				" FROM professor s LEFT JOIN department d ON s.departmentId = d.id" +
				" WHERE s.id = ?";
		try (Connection connection = DB.getConnection("professor1");
				PreparedStatement statement = connection.prepareStatement(sql)) {
			statement.setInt(1, id);
			try (ResultSet resultSet = statement.executeQuery()) {
				if (resultSet.next())
					return getProfessorFrom(resultSet);
				else
					return null;
			}
		}
	}

	public static void insert(Professor professor) throws Exception {
		String sql = "INSERT professor (id, name, departmentId, departmentName)" +
				" VALUES (?, ?, ?, ?)";
		try (Connection connection = DB.getConnection("student1");
				PreparedStatement statement = connection.prepareStatement(sql)) {
			statement.setInt(1, professor.getId());
			statement.setString(2, professor.getProfessorName());
			statement.setInt(3, professor.getDepartmentId());
			statement.setString(4, professor.getDepartmentName());
			statement.executeUpdate();
		}
	}


	public static void update(Professor professor) throws Exception {
		String sql = "UPDATE professor SET professorName=?, name=?, departmentId=?, departmentName=? " +
				" WHERE id = ?";
		try (Connection connection = DB.getConnection("student1");
				PreparedStatement statement = connection.prepareStatement(sql)) {
			statement.setInt(1, professor.getId());
			statement.setString(2, professor.getProfessorName());
			statement.setInt(3, professor.getDepartmentId());
			statement.setString(4, professor.getDepartmentName());
			statement.executeUpdate();
		}
	}
}



