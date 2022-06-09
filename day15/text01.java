public class text01{
		public static void main(String[] args){
			B b = new B();
			int[] arr = {0 , 1 , 2};
			b.text200(arr);
				System.out.print("text200µÄ" );
				for(int i = 0 ; i < arr.length ; i++){
				System.out.print(arr[i] + "\t");
			}
			System.out.println();
		}
	}

	class 	B {
		public void text200(int[] arr){
			System.out.print("text200µÄ" );
			arr[0] = 200;
			for(int i = 0 ; i < arr.length ; i++){
				System.out.print(arr[i] + "\t");
			}
			System.out.println();
		}
	}