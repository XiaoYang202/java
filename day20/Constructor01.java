public class Constructor01{
	public static void main(String[] args){
		//������newһ������ʱ��ֱ��ͨ��������ָ�����ֺ�����
		Person p1 = new Person("yzz",22);
		System.out.println("p1����Ϣ����");
		System.out.println("p1��name = "+ p1.name);
		System.out.println("p1��age = "+ p1.age);

	}
}

class Person{
	String name;
	int age;
	//������û�з���ֵ��Ҳ����дvoid
	//�����������ƺ���Person һ��
	//��String pName, int pAge���ǹ������β��б�����ͳ�Ա����һ��
	public Person(String pName, int pAge){
		System.out.println("������������,��ɶ���ĳ�ʼ��");
		name = pName;
		age = pAge;
	}
}