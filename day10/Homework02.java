import java.util.Scanner;
public class Homework02{
		public static void main(String[] args){
			double num1 = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("����������");
			num1 = sc.nextDouble();
			if(num1 > 0){
				System.out.println("���������Ϊ����");
			}
			else if(num1 < 0){
				System.out.println("���������Ϊ����");
			}
			else {
				System.out.println("���������Ϊ0");
			}

		}}