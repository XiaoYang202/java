public class HomeWork01{
	public static void main(String[] args){
		A01 a01 = new A01();
		//double[] arr = {1.2, 1.1, 1, 3}; 	
		double[] arr = {}; 	
		Double res = a01.max(arr);
		if(arr != null && res != null){
		System.out.println("arr的最大值 = " + a01.max(arr));
		}else{
			System.out.println("arr不能为空或者输入有误 " );
		}
	}
}
//先完成正常业务，在考虑代码的健壮性
class A01{
	public Double max(double[] arr){//需要保证输入的数组数大于0
		if(arr.length > 0){
				double max = arr[0];
				for(int i = 0;i < arr.length; i++){
					if(max < arr[i]){
						max = arr[i];
					}
				}
				return max;
			}else{return null;}
		}
	}