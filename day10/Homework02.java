import java.util.Scanner;
public class Homework02{
		public static void main(String[] args){
			double num1 = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入数字");
			num1 = sc.nextDouble();
			if(num1 > 0){
				System.out.println("输入的数字为正数");
			}
			else if(num1 < 0){
				System.out.println("输入的数字为负数");
			}
			else {
				System.out.println("输入的数字为0");
			}

		}}