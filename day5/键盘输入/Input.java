import java.util.Scanner;//��ʾ��java.util�µ�Scanner�ർ��
public class Input{

	public static void main(String[] args){
//��ʾ�����û�������
//����
//Scanner�� ��ʾ ���ı�ɨ��������java.unit��
//1.����/����Scanner�����ڵİ�
//2.����Scanner ����
// myScannerʱScanner��Ķ���
		Scanner myScanner = new Scanner(System.in);
//3.�����û����룬ʹ�� ��صķ���
		System.out.println("����������");
		String name = myScanner.next();//�����û�����
		System.out.println("����������");
		int age = myScanner.nextInt();//�����û�����int
		System.out.println("������нˮ");
		double sal = myScanner.nextDouble();//�����û�����double
		System.out.println("�˵���Ϣ���£�");
		System.out.println("����=" + name
			+"����=" + age + "нˮ=" + sal);
	}
 
}