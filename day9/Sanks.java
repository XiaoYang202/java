import java.util.Scanner;

public class Sanks{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
	System.out.println("请输入行数");
	int hangNum = sc.nextInt();
		for(int a = 1;a <= hangNum;a++){//a表示第几行
			for(int c=1;c <= hangNum-a;c++){
				System.out.print(" ");
			}
			for(int b = 1;b <= 2*a-1;b++){//b表示第几个
				if( b == 1 || b == 2*a-1 || a == hangNum  ){
				System.out.print("*");}
				else {
					System.out.print(" ");
				}
				//每行输入对应星号
			}System.out.println("");
		}
	}
}