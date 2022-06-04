public class Aexercise02{
		public static void main(String[] args){
			int[] arr1 = {11,22,33,44,55,66};
			
			int n1 = arr1.length;

			int temp = 0 ;
			for(int i = 0; i < n1/2; i++){
				temp = arr1[n1-1-i];
				arr1[n1-1-i] = arr1[i];
				arr1[i] = temp;
			}
			for(int i = 0; i < n1; i++){
     		System.out.print(arr1[i] + " " );}
		}
	}