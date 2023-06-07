import java.util.*;
public class BookApp{
	public static void main(String[] args){
		Book b1 = new Book("週刊少年ジャンプ2023年27号",290,"集英社");
		Book b2 = new Book("ドラえもん1巻",495,"小学館");
		b1.showInfo();
		b2.showInfo();
	}
}

class Book{
	String name;
	int price;
	String publisher;

	public Book(String name, int price, String publisher){
		this.name = name;
		this.price = price;
		this.publisher = publisher;
	}

	public void showInfo(){
		System.out.printf("%s:%s(%d円)%n",this.name, this.publisher, this.price);
	}
}
