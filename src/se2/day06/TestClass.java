package se2.day06;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * java反射
 *   Class类应用
 */
public class TestClass {
	public static void main(String[] args) {
//		reflect("");//传入一个String类实例
//		reflect(new Card(Card.SPADE,Card.ACE));
//		ArrayList al = new ArrayList();
//		reflect(al);
		
//		Object obj = create("java.util.ArrayList");
//		System.out.println(obj);
//		reflect(obj);
		
//		Card card = new Card();
//		Object i = getFieldValue(card,"FIVE");
//		System.out.println(i);
		
		Person person = new Person();
		String name = person.name;
		System.out.println("名字:" + name);
		person.sayName();
		int c = person.add(1, 2);
		System.out.println(c);
//		
		Object object = create("se2.day06.Person");
		Object name1 = getFieldValue(object, "name");
		System.out.println("名字:" + name1);
		
		call(object,"sayName",new Class[]{},new Object[]{});
		Object returnValue = call(object,"add",new Class[]{int.class,int.class},new Object[]{1,2});
		System.out.println(returnValue);
	}
	
	/**
	 * 给定对象,方法名,参数列表以及实际参数,利用反射机制调用方法
	 * @param obj  给定的对象
	 * @param methodName  给定的方法名
	 * @param paramType  参数列表
	 * @param paramValue  实际参数
	 * @return  调用方法后返回的结果,若该方法定义的返回值类型为void,那么反射调用方法后返回值为null
	 */
	public static Object call(Object obj,String methodName,Class[] paramType,Object[] paramValue){
		try{
			//获取用于描述obj所属类的Class的实例
			Class cls = obj.getClass();
			//根据方法名获取用于描述该方法的Method实例
			Method method = cls.getDeclaredMethod(methodName, paramType);	
			/*
			 * 使用Method的invoke()方法,就相当于调用了Method所描述的那个方法,invoke()方法的返回值就是调
			 *  用了实际方法后该方法的返回值
			 */
			Object returnValue = method.invoke(obj, paramValue);
			/*
			 * 将方法的返回值返回
			 * 注意,若当前调用的方法定义的返回值为void时,invoke()返回的结果为null
			 */
			return returnValue;
		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException("出错了");
		}
	}
	
	/**
	 * 
	 * @param obj
	 * @param fieldName
	 * @return
	 */
	public static Object getFieldValue(Object obj,String fieldName){
		try {
			/*
			 * 获取obj所属类的描述类Class的实例
			 */
			Class cls = obj.getClass();
			/*
			 * 根据Class实例获取指定名字的属性定义Field实例
			 */
//			Field field = cls.getField(fieldName);//无法检索私有的
			Field field = cls.getDeclaredField(fieldName);
			/*
			 * 根据属性定义Field实例获取此类的具体对象的这个属性的值
			 */
			Object value = field.get(obj);
			//返回值
			return value;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("出错了");
		}
	}
	
	/**
	 * 根据类的[完整名称(包路径.类名)],创建该类实例
	 * 1:根据类名创建用于描述此类的Class实例
	 * 2:通过Class实例newInstance()方法创建类的实例
	 * 3:返回这个实例
	 * @param pack
	 * @return
	 */
	public static Object create(String className){
		try {
			//1
			/*
			 * java加载类使用"懒惰加载方式"
			 * 内部加载过程:
			 * 1:根据className从环境变量classpath中寻找类
			 * 2:找到后读取此类的.class文件并转变为Class一个实例
			 * 3:将Class实例载入内存
			 * 
			 * 懒惰方式加载:即检查内存中是否存在此类的Class实例,若有就直接使用,若没有则去读取.class文件
			 *            Class类的实例,对于描述的类来讲,是唯一的
			 * 
			 */
			Class cls = Class.forName(className);
			System.out.println("准备创建" + cls.getName() + "的实例");
			
			//2
			Object obj = cls.newInstance();//等同于new xxx();
			
			//3
			return obj;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("加载出错了!",e);
		}
	}
	
	/**
	 * 根据给定的对象,打印这个对象所属类都定义了那些属性方法和构造器
	 * 1:获取用于描述obj所属类的Class的实例
	 * 2:通过Class的实例,获取obj所属类定义的属性
	 * 3:通过Class的实例,获取obj所属类定义的方法
	 * 4:通过Class的实例,获取obj所属类定义的构造器
	 * 
	 * @param obj
	 */
	public static void reflect(Object obj){
		//1
		Class cls = obj.getClass();
		//打印obj所属类的名字
		System.out.println("类:" + cls.getName());
		
		//2
		Field[] fields = cls.getFields();
		System.out.println("属性:");
		for(Field field:fields){
			System.out.println(field.getType() +  //属性的类型 
					         ":" +
					         field.getName()    //属性的名字
					         );
		}
		
		//3
		Method[] methods = cls.getMethods();
		System.out.println("方法:");
		for(Method method:methods){
			System.out.println(method.getReturnType() +
					           "  " +
					           method.getName() +
					           "  " +
					           Arrays.toString(method.getParameterTypes())
			);
			
		}
		
		//4
		Constructor[] constructors = cls.getConstructors();
		System.out.println("构造器:");
		for(Constructor constructor:constructors){
			System.out.println(constructor.getName() + 
							  "  " +
							  Arrays.toString(constructor.getParameterTypes())
			);
		
		}
	}
}

class Person{
	String name ="李伟棠";
	public void sayName(){
		System.out.println("我的名字是:" + name);
	}
	public int add(int a,int b){
		return a+b;
	}
}
