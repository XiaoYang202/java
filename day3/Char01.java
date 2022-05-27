public class Char01{

	public static void main(String[] args){
		char c1 = 'a';
		char c2 = '\t';
		char c3 = '杨';
		char c4 = 97;
		char c5 = 38889;

		System.out.println((int)c1);//输出‘a’对应的数字 
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println('a' + 10);

		//测试
		char c6 = 'b' + 1;
		System.out.println((int)c6);
		System.out.println(c6);
	}
}