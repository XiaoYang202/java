// //��ʾ��ϵ�������ʹ��
// //
// public class RelationalOperator {
// //��дһ�� main ����
// public static void main(String[] args) {
// int a = 9; //�Ϻ���ʾ: �����У�������ʹ�� a, b
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
* ��ʾ�߼��������ʹ��
*/
public class LogicOperator {
//��дһ�� main ����
public static void main(String[] args) {
//&&��·�� �� & ������ʾ
int age = 50;
if(age > 20 && age < 90) {
	System.out.println("ok100");
}
//&�߼���ʹ��
if(age > 20 & age < 90) {
System.out.println("ok200");
}
//����
int a = 4;
int b = 9;
//����&&��·����ԣ������һ������Ϊ false ,��������������ж�
//����&�߼�����ԣ������һ������Ϊ false ,�����������Ȼ���ж�
if(a > 1 & b++ < 50) {
System.out.println("ok300");
}
System.out.println("a=" + a + " b=" + b);// 4 10
}
}
