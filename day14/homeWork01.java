public class homeWork01{
	public  static void main(String[] args){
		AA a = new AA();
		if(a.isOdd(1)){
			System.out.println("������");}
			else{
				System.out.println("��ż��");
			}

		}
	}


class AA{
		public boolean isOdd(int num){
			// if(num % 2 != 0){
			// 	return true;
			// }
			// 	else{return false};
			// return num % 2 != 0 ? true ; false ;
				return num % 2 != 0;		
		}
}
