public class ArrTest {
    //使用模板
    public static void main(String[] args){
        MyTools mt = new MyTools();
        int[] arr = {10 , -1 , 8 , 9};
        mt.bubble(arr);
        //输出排序后的arr，引用传
        System.out.println("====排序后的arr====");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + "\t");
            //当我们在idea运行一个文件时，会先编译成class在运行
        }
    }
}
//创建一个类做冒泡排序
class MyTools{
    public void bubble(int[] arr) {
        //冒泡排序
        int temp = 0;
        for (int i = 0; i < arr.length; i ++){
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
    }
}