import java.util.Scanner;
public class Exercise{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入月份");
		int month = sc.nextInt();
		if(month >= 4 && month <= 10)
		{
			System.out.println("请输入年龄");
			int age = sc.nextInt();
			if(age > 0) {
			if(age >= 18 && age < 60)
			{
				System.out.println("成人票价60");}
				else if(age < 18){
					System.out.println("儿童票半价");}
					else if(age >=60){System.out.println("老人票1/3");}}
				else {System.out.println("年龄有误，请重新输入");}

				}
		else{
			System.out.println("请输入年龄");
			int age = sc.nextInt();
			if(age > 0) {
			if(age > 18 && age < 60){
				System.out.println("成人票价40");}
					else {System.out.println("票价二十");}}
				else {System.out.println("年龄有误，请重新输入");}

				}

	}
}