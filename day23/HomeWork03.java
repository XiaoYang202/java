public class HomeWork03{
	public static void main(String[] args){
		Book book01 = new Book("人间失格",32);
		book01.info();
		book01.updatePrice();
		book01.info();
		}
	}

class Book{
	String name;
	double price;
	//提供一个构造器
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

	//显示书籍的情况
	public void info(){
		System.out.println("书名=" +this.name + " 价格=" + this.price);
	}
}