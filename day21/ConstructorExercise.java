public class ConstructorExercise{
	public static void main(String[] args){
		Person p1 = new Person();//�޲ι�����
		//�������nameΪnull������Ϊ18
		System.out.println("p1��name = "+ p1.name +"\n" + "p1��age = "+ p1.age);

		Person p2 = new Person("yzz",22);
		System.out.println("p2��name = "+ p2.name +"\n" + "p2��age = "+ p2.age);
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
