public class ConstructorExercise{
	public static void main(String[] args){
		Person p1 = new Person();//无参构造器
		//下面输出name为null，年龄为18
		System.out.println("p1的name = "+ p1.name +"\n" + "p1的age = "+ p1.age);

		Person p2 = new Person("yzz",22);
		System.out.println("p2的name = "+ p2.name +"\n" + "p2的age = "+ p2.age);
	}
}

class Person{
	String name;
	int age;

	public Person(){
		age = 18;
	}

	public Person(String pName,int pAge){
		name = pName;
		age = pAge;
	}
	}
