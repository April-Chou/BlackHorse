package exception;
/*
 * throws  用在方法声明后面，跟的是异常类名，可以跟多个异常类名，用逗号隔开
 *        biao 表示抛出异常，由该方法调用者来处理。
 * throw  用在方法体内，跟的是异常对象名
 *        zhi 只能抛出一个异常对象名
 *        biao 表示抛出异常，由方法体内的语句处理
 */

public class Demo6_Exception {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Person p = new Person();
		p.setAge(-17);
		
	

	}

}

class Person{
	private String name;
	private int age;
	/**
	 * 
	 */
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age){
		
		if(age > 0 && age <= 150 ) {
			this.age = age;
		}
			
		else {
			throw new RuntimeException("Illegal Age");
		}
	}
	
}
