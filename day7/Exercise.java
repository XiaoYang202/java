import java.util.Scanner;
public class Exercise{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�������·�");
		int month = sc.nextInt();
		if(month >= 4 && month <= 10)
		{
			System.out.println("����������");
			int age = sc.nextInt();
			if(age > 0) {
			if(age >= 18 && age < 60)
			{
				System.out.println("����Ʊ��60");}
				else if(age < 18){
					System.out.println("��ͯƱ���");}
					else if(age >=60){System.out.println("����Ʊ1/3");}}
				else {System.out.println("������������������");}

				}
		else{
			System.out.println("����������");
			int age = sc.nextInt();
			if(age > 0) {
			if(age > 18 && age < 60){
				System.out.println("����Ʊ��40");}
					else {System.out.println("Ʊ�۶�ʮ");}}
				else {System.out.println("������������������");}

				}

	}
}