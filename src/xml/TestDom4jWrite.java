package xml;

import java.io.FileWriter;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class TestDom4jWrite {

	public static void main(String[] args) throws Exception {
		Document doc = DocumentHelper.createDocument();
		// 添加一个元素,返回值是刚刚添加的元素
		Element root = doc.addElement("books");
		Element book = root.addElement("book");
		book.addElement("name").setText("C++");
		book.addElement("author").setText("k1nman");
		book.addElement("price").setText("10");

		OutputFormat format = OutputFormat.createPrettyPrint();// 默认: OutputFormat.createCompactFormat()
		XMLWriter writer = new XMLWriter(new FileWriter("src/xml/book.xml"), format);
		writer.write(doc);
		writer.close();
	}

}
