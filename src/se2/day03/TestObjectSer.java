package se2.day03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 对象序列化
 * 1:创建一个文件输出流FileOutputStream
 * 2:创建一个用于对象序列化的ObjectOutputStream
 * 3:创建一个类的实例(对象)
 * 4:将这个对象序列化后写入文件 
 * 5:关闭流
 * 
 * 对象反序列化
 * 1:创建一个文件的输入流FileInputStream
 * 2:创建一个用于反序列化的ObjectInputStream
 * 3:反序列化操作:ois.readObject()
 * 4:关闭流
 */
public class TestObjectSer {
	public static void main(String[] args) throws Exception {
		//1
		FileOutputStream fos = new FileOutputStream("obj.dat");
		//2
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//3
		Foo foo = new Foo();
		//4 对象持久化
		oos.writeObject(foo);//将foo对象序列化并写入到文件中
		//5
		oos.flush();
		oos.close();
		fos.close();
		
		/**************************************************************/
		
		//反序列化
		//1
		FileInputStream fis = new FileInputStream("obj.dat");
		//2
		ObjectInputStream ois =  new ObjectInputStream(fis);
		//3
		Foo nfoo = (Foo)ois.readObject();//反序列化对象,需造型
		//4
		ois.close();
		fis.close();
		
		System.out.println(foo.age + "," + nfoo.age);
		System.out.println(foo == nfoo);
		
	}
}

class Foo implements Serializable{
	private static final long serialVersionUID = 1L;
	int age = 1;
}