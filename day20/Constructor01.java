public class Constructor01{
	public static void main(String[] args){
		//当我们new一个对象时，直接通过构造器指定名字和年龄
		Person p1 = new Person("yzz",22);
		System.out.println("p1的信息如下");
		System.out.println("p1的name = "+ p1.name);
		System.out.println("p1的age = "+ p1.age);

	}
}

class Person{
	String name;
	int age;
	//构造器没有返回值，也不能写void
	//构造器的名称和类Person 一样
	//（String pName, int pAge）是构造器形参列表，规则和成员方法一样
	public Person(String pName, int pAge){
		System.out.println("构造器被调用,完成对象的初始化");
		name = pName;
		age = pAge;
	}
}