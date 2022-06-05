
public class twodimensional{
		public static void main(String[] args){
			int arr[][] = new int[15][];//每个一维数组都还没有开空间
			for(int i = 0; i < arr.length;i++){
				//必须先开空间，上面没有给空间
				//如果没有给一堆数组new，那么arr【i】就是null，空的
				arr[i] = new int[i + 1];
				for(int j = 0;j < arr[i].length;j++){
					arr[i][j] = i + 1;
					System.out.print(arr[i][j] + " ");
				}System.out.print("\n");
			}
			}
		}