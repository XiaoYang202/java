import java.util.Scanner;

public class Sanks{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
	System.out.println("����������");
	int hangNum = sc.nextInt();
		for(int a = 1;a <= hangNum;a++){//a��ʾ�ڼ���
			for(int c=1;c <= hangNum-a;c++){
				System.out.print(" ");
			}
			for(int b = 1;b <= 2*a-1;b++){//b��ʾ�ڼ���
				if( b == 1 || b == 2*a-1 || a == hangNum  ){
				System.out.print("*");}
				else {
					System.out.print(" ");
				}
				//ÿ�������Ӧ�Ǻ�
			}System.out.println("");
		}
	}
}