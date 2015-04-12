package xml;

import java.io.FileReader;
import java.io.FileWriter;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class TestDom4jAdd {

	public static void main(String[] args) throws Exception {
		SAXReader reader = new SAXReader();
		Document doc = reader.read(new FileReader("src/xml/books.xml"));
		Element root = doc.getRootElement();

		Element book = root.addElement("book");
		book.addElement("name").setText("C#");
		book.addElement("author").setText("k1nman");
		book.addElement("price").setText("12");

		OutputFormat format = OutputFormat.createPrettyPrint();
		XMLWriter writer = new XMLWriter(new FileWriter("src/xml/books.xml"), format);
		writer.write(doc);
		writer.close();
	}

}
