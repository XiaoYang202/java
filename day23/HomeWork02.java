public class HomeWork02{
	public static void main(String[] args){
		String[] arr = {"jack", "tom", "mary", "milan"};
		A02 a02 = new A02();
		int index = a02.find("tom",arr);
		if(index == -1){
			System.out.println("û�ҵ�");

		}else{
			System.out.println("index = " + index);

		}
		}
	}


class A02{
	public int find(String findname, String[] arr){
		for(int i = 0; i < arr.length; i++){
			if(findname.equals(arr[i])){
				return i;
			}
		}
		//���û�з���-1
		return -1;

	}

}