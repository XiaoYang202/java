
public class MethodExercise01{

	public static void main(String[] args){
		Person p = new Person();
			p.name = "milan";
			p.age = 100;
			//���� tools
			MyTools tools = new MyTools();
			Person p2 = tools.copyPerson(p);
			//���� p �� p2 �� Person ���󣬵��������������Ķ���������ͬ
			System.out.println("p ������ age=" + p.age + " ����=" + p.name);
			System.out.println("p2 ������ age=" + p2.age + " ����=" + p2.name);
			//������ʦ��ʾ�� ����ͬ ����ȽϿ����Ƿ�Ϊͬһ������
			System.out.println(p == p2);//false

	}

}
class Person{
	String name;
	int age;
}

class MyTools {
	public Person copyPerson(Person p) {
//����һ���µĶ���
		Person p2 = new Person();
		p2.name = p.name; //��ԭ����������ָ��� p2.name
		p2.age = p.age; //��ԭ����������丳�� p2.age
		return p2;
		}
	}


