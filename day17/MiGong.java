public class MiGong{

	public static void main(String[] args){

		int[][] map = new int[8][7];
		for(int i = 0 ; i < 7 ; i++){
			map[0][i] = 1;
			map[7][i] = 1;
		}
		for(int i = 0 ; i < 8 ; i++){
			map[i][0] = 1;
			map[i][6] = 1;
		}
		 	map[2][1] = 1;
		 	map[2][2] = 1;

		//输出当前地图
		System.out.println("=====当前地图情况====="+"\n");
		for(int i = 0 ; i < map.length ; i++){
			for(int j = 0 ; j < map[i].length ; j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println("");
		}
			T t1 = new T();
			t1.findway(map,1,1);
			System.out.println("=====找到的路径如下====="+"\n");

		for(int i = 0 ; i < map.length ; i++){
			for(int j = 0 ; j < map[i].length ; j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println("");
		}
		}
	}


	class T{
		//使用递归解决迷宫问题
		//findwat方法专门来找出迷宫的路径
		//如果找到返回true，没找到返回false
		//map就是一个二维数组，表示迷宫
		//i，j是老鼠的位置，初始位置为(1,1)
		//因为是递归照例，所一我先规定map数组的各个值的含义： 0表示可以走，1表示障碍物，2表示可以走，3表示走过，但是走不通，是死路
		//当（6，5）=2时，就可以退出了
		//要先决定走路的策略
		public boolean findway(int[][] map , int i, int j){
			if(map[6][5] == 2){
				return true;
			}else{
				if(map[i][j] == 0){
					//此时假定他可以走通
					map[i][j] =2;
					//现在要开始执行策略,来确定改位置是否真的能走通
					if(findway(map,i + 1,j)){
						return true;
					}else if(findway(map,i ,j + 1)){
						return true;
					}else if(findway(map,i - 1 ,j)){
						return true;
					}else if(findway(map,i ,j - 1)){
						return true;
					}else{map[i][j] = 3;
						return false;}
				}else{//只能是1，2，3，所以直接结束，不用测试
					return false;
				}
			}

		}
	}