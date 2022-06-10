
public class MethodExercise01{

	public static void main(String[] args){
		Person p = new Person();
			p.name = "milan";
			p.age = 100;
			//创建 tools
			MyTools tools = new MyTools();
			Person p2 = tools.copyPerson(p);
			//到此 p 和 p2 是 Person 对象，但是是两个独立的对象，属性相同
			System.out.println("p 的属性 age=" + p.age + " 名字=" + p.name);
			System.out.println("p2 的属性 age=" + p2.age + " 名字=" + p2.name);
			//这里老师提示： 可以同 对象比较看看是否为同一个对象
			System.out.println(p == p2);//false

	}

}
class Person{
	String name;
	int age;
}

class MyTools {
	public Person copyPerson(Person p) {
//创建一个新的对象
		Person p2 = new Person();
		p2.name = p.name; //把原来对象的名字赋给 p2.name
		p2.age = p.age; //把原来对象的年龄赋给 p2.age
		return p2;
		}
	}


