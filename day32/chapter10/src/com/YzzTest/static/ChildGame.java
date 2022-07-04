public class ChildGame {

    public static void main(String[] args) {
        //定义一个count,统计有多少人加入了
        int count = 0;
        Child ch01 = new Child("白骨精");
        ch01.join();
//        count++;
        ch01.count++;
        Child ch02 = new Child("蜘蛛精");
        ch02.join();
//        count++;
        ch02.count++;
        Child ch03 = new Child("狐狸精");
        ch03.join();
//        count++;
        ch03.count++;
//类变量可以通过类名访问
        System.out.println("共有"+Child.count+"小孩加入了游戏");

    }
}


class Child{
    private String name;
//定义一个变量count，是一个类变量（静态变量）static
    //该变量最大的特点就是会被child所有对象共享
    public static int count = 0;
    public Child(String name) {
        this.name = name;
    }
    public void join(){
        System.out.println(name + "加入了游戏");
    }
}