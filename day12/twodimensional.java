
public class twodimensional{
		public static void main(String[] args){
			int arr[][] = new int[15][];//ÿ��һά���鶼��û�п��ռ�
			for(int i = 0; i < arr.length;i++){
				//�����ȿ��ռ䣬����û�и��ռ�
				//���û�и�һ������new����ôarr��i������null���յ�
				arr[i] = new int[i + 1];
				for(int j = 0;j < arr[i].length;j++){
					arr[i][j] = i + 1;
					System.out.print(arr[i][j] + " ");
				}System.out.print("\n");
			}
			}
		}