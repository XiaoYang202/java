public class RecursionExercise {
	public static void main(String[] args){

		T t1 = new T();
		int n = 7;
		int res = t1.FBNQ(n);

		System.out.println("当n=7 对应的斐波那契数=" + res);
	}
}

class 	T{

	//1 1 2 3 5 8 13 21 ......
	//N= 1 ----1
	//N= 2-----1
	//N= 3 ----前两数字之和
	
	public int FBNQ(int n){
		if(n >= 1){
		if( n == 1 || n == 2){
			return 1;
		}else{
			return FBNQ(n-1) + FBNQ(n-2);
		}
	}else {
		System.out.println("要求输入的n>=1");
		return -1;
	}
	//斐波那契数
	}
}