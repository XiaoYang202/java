// //演示关系运算符的使用
// //
// public class RelationalOperator {
// //编写一个 main 方法
// public static void main(String[] args) {
// int a = 9; //老韩提示: 开发中，不可以使用 a, b
// int b = 8;
// System.out.println(a > b); //T
// System.out.println(a >= b); //T
// System.out.println(a <= b); //F
// System.out.println(a < b);//F
// System.out.println(a == b); //F
// System.out.println(a != b); //T
// boolean flag = a > b; //T
// System.out.println("flag=" + flag);
// }
// }
// 
// 
/**
* 演示逻辑运算符的使用
*/
public class LogicOperator {
//编写一个 main 方法
public static void main(String[] args) {
//&&短路与 和 & 案例演示
int age = 50;
if(age > 20 && age < 90) {
	System.out.println("ok100");
}
//&逻辑与使用
if(age > 20 & age < 90) {
System.out.println("ok200");
}
//区别
int a = 4;
int b = 9;
//对于&&短路与而言，如果第一个条件为 false ,后面的条件不再判断
//对于&逻辑与而言，如果第一个条件为 false ,后面的条件仍然会判断
if(a > 1 & b++ < 50) {
System.out.println("ok300");
}
System.out.println("a=" + a + " b=" + b);// 4 10
}
}
