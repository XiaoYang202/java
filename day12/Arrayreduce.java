import java.util.Scanner;
public class Arrayreduce{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int[] Array01 = {1,2,3,4,5};
			do{int num1 = Array01.length - 1;
			int[] Array02 = new int[num1];
			for(int i = 0; i < num1 ; i++){
				Array02[i] = Array01[i];
			}
			Array01 = Array02;
			System.out.println("===array01ɾ����Ԫ���������===");
			for( int i = 0; i < num1 ; i++ ){
			System.out.print(Array01[i] + " ");}
			System.out.println("�Ƿ����ɾ������y/n");
			char choose = sc.next().charAt(0);
			if(num1 == 1 || choose == 'n'){break;}
			}while(true); 
			System.out.println("���˳���ɾ��");
		}
	}