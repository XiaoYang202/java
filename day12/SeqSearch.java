import java.util.Scanner;
public class SeqSearch{
		public static void main(String[] args){
			String[] names = {"yzz","yyb","cln"};
			Scanner sc = new Scanner(System.in);
			System.out.println("��������������������");
			String findName = sc.next();
			boolean flag = false;
			for(int i = 0; i < names.length ; i++){
				if(names[i].equals(findName)){
					System.out.println("��ϲ���Ҵ���");
					flag = true;
				}
			}
			if(flag == false){
				System.out.println("sorry,û�ҵ�");
			}

			}
		}