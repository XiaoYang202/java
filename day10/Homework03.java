public class Homework03{
		public static void main(String[] args){
			int count = 0;
			for(int i = 1;i <= 100;i++){//����1-100
				
				if(i %  5 != 0){
					count++;
				System.out.print(i+"\t");
			
				if(count % 5 == 0){
					System.out.print("\n");
				}
				
			}
			}
		}

	}