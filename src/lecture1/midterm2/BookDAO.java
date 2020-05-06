package lecture1.midterm2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import lecture1.DB;
	
public class BookDAO {
	

	    public static List<Book> findAll() throws Exception {
	        String sql = "SELECT s.*, d.departmentName " +
	                     "FROM student s LEFT JOIN department d ON s.departmentId = d.id";
	        try (Connection connection = DB.getConnection("book");
	             PreparedStatement statement = connection.prepareStatement(sql);
	             ResultSet resultSet = statement.executeQuery()) {
	            ArrayList<Book> list = new ArrayList<Book>();
	            while (resultSet.next()) {
	                Book.student = new Student();
	                Book.setId(resultSet.getInt("id"));
	                Book.setStudentNumber(resultSet.getString("studentNumber"));
	                Book.setName(resultSet.getString("name"));
	                Book.setDepartmentId(resultSet.getInt("departmentId"));
	                Book.setYear(resultSet.getInt("year"));
	                Book.setDepartmentName(resultSet.getString("departmentName"));
	                list.add(student);
	            }
	            return list;
	        }
	    }
	}



}
