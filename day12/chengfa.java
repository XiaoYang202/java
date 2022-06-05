public class chengfa{
		public static void main(String[] args){
			for(int i = 1 ; i <= 9;i++){
				for(int j = 1;j <= i;j++){
					int num = i * j;
					System.out.print(j + "x" + i +"=" + num + "\t");
				}System.out.println("");
			}
		}
	}