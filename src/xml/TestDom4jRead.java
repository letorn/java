package xml;

import java.io.InputStream;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class TestDom4jRead {

	public static void main(String[] args) throws Exception {
		// SAXReader用于读取XML文档
		SAXReader reader = new SAXReader();
		ClassLoader cl = TestDom4jRead.class.getClassLoader();
		InputStream is = cl.getResourceAsStream("xml/books.xml");
		
		// 用于封装解析后的XML数据
		Document doc = reader.read(is);
		
		// Element用于封装元素
		Element root = doc.getRootElement();
		System.out.println("rootName: " + root.getName());
		int i = root.elements().size();
		System.out.println("rootSize: " + i);
		
		// 获取所有的book
		List books = root.elements();
		Element book = (Element) books.get(0);
		
		// 获取book下所有的属性
		List infos = book.elements();
		Element info = (Element) infos.get(0);
		System.out.println("book[" + info.getName() + ": " + info.getText() + "]");
	}

}
