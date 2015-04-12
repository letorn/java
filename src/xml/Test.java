package xml;

import java.io.FileWriter;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.XMLWriter;

public class Test {

	public static void main(String[] args) throws Exception {
		Document doc = DocumentHelper.createDocument();
		Element root = doc.addElement("books");
		for (int i = 0; i < 3; i++) {
			Element bookElement = root.addElement("book");
			bookElement.addElement("name").setText("name" + i);
			bookElement.addElement("author").setText("author" + i);
			bookElement.addElement("price").setText("" + i);
		}
		XMLWriter writer = new XMLWriter(new FileWriter("src/xml/books.xml"));
		writer.write(doc);
		writer.close();
	}

}
