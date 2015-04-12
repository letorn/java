package se1.day05;
/*
 * 自定义异常
 */
public class MyExceptionDemo {
	public static void main(String[] args) {
		Person person = new Person();
		
		try {
			person.setAge(555);
		} catch (AgeValueException e) {
			System.out.println("年龄设置失败");
			e.printStackTrace();
		}
		
		person.sayAge();
	}
}

class Person{
	private int age;
	public void setAge(int age) throws AgeValueException {
		if(age<=0 || age>=100){
			throw new AgeValueException("不属于人类的年龄范畴!!!");
		}
		this.age = age;
	}
	public void sayAge() {
		System.out.println("我的年龄是:" + age);
	}
}

/*
 * 自定义异常
 */
class AgeValueException extends Exception{

	public AgeValueException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AgeValueException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public AgeValueException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public AgeValueException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}