public class Homework01{
		public static void main(String[] args){
			double num1 = 100000;
			int i = 0;//��ʼ����
			while(num1 > 0){
			if(num1 > 50000){
				num1 = num1 * 0.95;
				i++;
			}

				 else if(num1 <= 50000){
				num1 = num1 - 1000;
				i++;
			}
}
			int n = i - 1;
			System.out.println("�ܹ�����ͨ��"+ n +"��");
		}
	}