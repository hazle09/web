package lecture1.midterm2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import lecture1.DB;
import lecture1.midterm2.Book;
	
public class BookDAO {
	

	    public static List<Book> findAll() throws Exception {
	        String sql = "SELECT b.*, c.categoryName " +
	                     "FROM book b LEFT JOIN category c ON b.categoryId = c.id";
	        try (Connection connection = DB.getConnection("book");
	             PreparedStatement statement = connection.prepareStatement(sql);
	             ResultSet resultSet = statement.executeQuery()) {
	            ArrayList<Book> list = new ArrayList<Book>();
	            while (resultSet.next()) {
	                Book book = new Book();
	                book.setId(resultSet.getInt("id"));
	                book.setTitle(resultSet.getString("Title"));
	                book.setCategoryId(resultSet.getInt("categoryId"));
	                book.setPrice(resultSet.getInt("price"));
	                book.setAuthor(resultSet.getString("author"));
	                book.setPublisher(resultSet.getString("publisher"));
	                book.setCategoryName(resultSet.getString("categoryName"));
	                list.add(book);
	            }
	            return list;
	        }
	    }
	    public static List<Book> findByName(String author) throws Exception {
	        String sql = "SELECT b.*, c.categoryName " +
                    "FROM book b LEFT JOIN category c ON b.categoryId = c.id"+
	                     "WHERE b.author LIKE ?";
	        try (Connection connection = DB.getConnection("book");
	             PreparedStatement statement = connection.prepareStatement(sql)) {
	            statement.setString(1, author + "%");
	            try (ResultSet resultSet = statement.executeQuery()) {
	                ArrayList<Book> list = new ArrayList<Book>();
	                while (resultSet.next()) {
	                	Book book = new Book();
		                book.setId(resultSet.getInt("id"));
		                book.setTitle(resultSet.getString("Title"));
		                book.setCategoryId(resultSet.getInt("categoryId"));
		                book.setPrice(resultSet.getInt("price"));
		                book.setAuthor(resultSet.getString("author"));
		                book.setPublisher(resultSet.getString("publisher"));
		                book.setCategoryName(resultSet.getString("categoryName"));
		                list.add(book);
	                }
	                return list;
	            }
	        }
	    
	    }}




