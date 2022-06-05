import java.util.Scanner;
public class homeWork01{
		public static void main(String[] args){
			int[] arr1 ={10 , 12 , 45 , 90};
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入一个数");
			int num = sc.nextInt();
			//先扩容
			int[] arr2 = new int[arr1.length + 1];
			for(int i = 0 ; i <= arr1.length-1; i++){
				arr2[i] = arr1[i];
			}
			arr2[arr2.length-1] = num;
			for(int i = 0 ; i <= arr2.length-1; i++){
				if(num < arr2[i]){
					int temp = num;
					num = arr2[i];
					arr2[i] = temp;
				}
			}
			for(int i = 0 ; i <= arr2.length-1; i++){
				System.out.print(arr2[i] + " ");
			}
			}
		}