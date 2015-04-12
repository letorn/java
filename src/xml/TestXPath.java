package xml;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class TestXPath {

	public static void main(String[] args) throws Exception {
		SAXReader reader = new SAXReader();
		Document doc = reader.read(new File("src/xml/books.xml"));
		/*
		 * /books/book[1]/name <==> /book-list/book[position()=1]/name
		 * /books/book[position()>1 and position()<5]/name
		 * /books/book[last()]/name
		 * /books/book[price > 10]/name
		 */
		List<Element> list = doc.selectNodes("/books/book/price");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for (Element e : list) {
			System.out.println("price: " + e.getText());
		}
	}

}
