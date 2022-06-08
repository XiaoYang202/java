public class homeWork01{
	public  static void main(String[] args){
		AA a = new AA();
		if(a.isOdd(1)){
			System.out.println("是奇数");}
			else{
				System.out.println("是偶数");
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
