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

		//�����ǰ��ͼ
		System.out.println("=====��ǰ��ͼ���====="+"\n");
		for(int i = 0 ; i < map.length ; i++){
			for(int j = 0 ; j < map[i].length ; j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println("");
		}
			T t1 = new T();
			t1.findway(map,1,1);
			System.out.println("=====�ҵ���·������====="+"\n");

		for(int i = 0 ; i < map.length ; i++){
			for(int j = 0 ; j < map[i].length ; j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println("");
		}
		}
	}


	class T{
		//ʹ�õݹ����Թ�����
		//findwat����ר�����ҳ��Թ���·��
		//����ҵ�����true��û�ҵ�����false
		//map����һ����ά���飬��ʾ�Թ�
		//i��j�������λ�ã���ʼλ��Ϊ(1,1)
		//��Ϊ�ǵݹ���������һ���ȹ涨map����ĸ���ֵ�ĺ��壺 0��ʾ�����ߣ�1��ʾ�ϰ��2��ʾ�����ߣ�3��ʾ�߹��������߲�ͨ������·
		//����6��5��=2ʱ���Ϳ����˳���
		//Ҫ�Ⱦ�����·�Ĳ���
		public boolean findway(int[][] map , int i, int j){
			if(map[6][5] == 2){
				return true;
			}else{
				if(map[i][j] == 0){
					//��ʱ�ٶ���������ͨ
					map[i][j] =2;
					//����Ҫ��ʼִ�в���,��ȷ����λ���Ƿ��������ͨ
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
				}else{//ֻ����1��2��3������ֱ�ӽ��������ò���
					return false;
				}
			}

		}
	}