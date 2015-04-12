package xml;

import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;

public class BookUtils {

	/**
	 * XML转换为Object
	 * 
	 * @param xmlFile
	 * @return
	 * @throws Exception
	 */
	public static List<Book> toList(File xmlFile) throws Exception {
		SAXReader reader = new SAXReader();
		Document doc = reader.read(xmlFile);
		Element root = doc.getRootElement();
		List<Element> bookElementList = root.elements("book");

		List<Book> bookList = new ArrayList<Book>();
		for (Element bookElement : bookElementList) {
			Book book = new Book();
			book.setName(bookElement.elementText("name"));
			book.setAuthor(bookElement.elementText("author"));
			book.setPrice(Double.parseDouble(bookElement.elementText("price")));
			bookList.add(book);
		}
		return bookList;
	}

	/**
	 * 追加一本书
	 * 
	 * @param xmlFile
	 * @param book
	 * @throws Exception
	 */
	public static void append(File xmlFile, Book book) throws Exception {
		SAXReader reader = new SAXReader();
		Document doc = reader.read(xmlFile);
		Element root = doc.getRootElement();

		Element bookElement = root.addElement("book");
		bookElement.addElement("name").setText(book.getName());
		bookElement.addElement("author").setText(book.getAuthor());
		bookElement.addElement("price").setText(String.valueOf(book.getPrice()));

		OutputFormat format = OutputFormat.createPrettyPrint();
		XMLWriter writer = new XMLWriter(new FileWriter(xmlFile), format);
		writer.write(doc);
		writer.close();
	}

	/**
	 * Object转换为XML
	 * 
	 * @param xmlFile
	 * @param bookList
	 * @throws Exception
	 */
	public static void toFile(List<Book> bookList, File xmlFile) throws Exception {
		Document doc = DocumentHelper.createDocument();
		Element root = doc.addElement("books");

		for (Book book : bookList) {
			Element bookElement = root.addElement("book");
			bookElement.addElement("name").setText(book.getName());
			bookElement.addElement("author").setText(book.getAuthor());
			bookElement.addElement("price").setText(String.valueOf(book.getPrice()));
		}

		OutputFormat format = OutputFormat.createPrettyPrint();
		XMLWriter writer = new XMLWriter(new FileWriter(xmlFile), format);
		writer.write(doc);
		writer.close();
	}

	public static void toDB(File xmlFile, Connection con) throws Exception {
		SAXReader reader = new SAXReader();
		Document doc = reader.read(xmlFile);

		Element root = doc.getRootElement();
		List<Element> bookElementList = root.elements("book");

		PreparedStatement stmt = con.prepareStatement("insert into books(name, author, price) values(?, ?, ?)");
		int i = 0;
		for (Element bookElement : bookElementList) {
			stmt.setString(1, bookElement.elementText("name"));
			stmt.setString(2, bookElement.elementText("author"));
			stmt.setDouble(3, Double.parseDouble(bookElement.elementText("price")));
			stmt.addBatch();
			if (i++ % 2000 == 0) {
				stmt.executeBatch();
			}
		}
		stmt.executeBatch();
		stmt.close();
	}

	@Test
	public void toListTest() throws Exception {
		List<Book> bookList = toList(new File("src/xml/books.xml"));

		System.out.println(bookList);
	}

	@Test
	public void appendTest() throws Exception {
		// new book
		Book book = new Book();
		book.setName("Ruby");
		book.setAuthor("Kate");
		book.setPrice(10);

		append(new File("src/xml/books.xml"), book);
	}

	@Test
	public void toFileTest() throws Exception {
		// new list
		List<Book> bookList = new ArrayList<Book>();
		Book book1 = new Book();
		book1.setName("JAVA");
		book1.setAuthor("Lily");
		book1.setPrice(10);
		Book book2 = new Book();
		book2.setName("C++");
		book2.setAuthor("Mario");
		book2.setPrice(11);
		Book book3 = new Book();
		book3.setName("C#");
		book3.setAuthor("Tom");
		book3.setPrice(12);
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);

		toFile(bookList, new File("src/xml/books.xml"));
	}

	@Test
	public void toDBTest() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://mysql:3306/xml", "admin", "123456");
		toDB(new File("src/xml/books.xml"), con);
	}
}
