public class HomeWork03{
	public static void main(String[] args){
		Book book01 = new Book("�˼�ʧ��",32);
		book01.info();
		book01.updatePrice();
		book01.info();
		}
	}

class Book{
	String name;
	double price;
	//�ṩһ��������
	public Book(String name , double price){
		this.name = name;
		this.price  = price;
	}
	public void updatePrice(){
		if(this.price > 150){
			this.price = 150;
		}else if(this.price > 100){
			this.price = 100;
		}
	}

	//��ʾ�鼮�����
	public void info(){
		System.out.println("����=" +this.name + " �۸�=" + this.price);
	}
}