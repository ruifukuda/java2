import java.util.*;
public class IcecreamApp{
	public static void main(String[] args){
		Icecream i1 = new Icecream("ピノ",160);
		Icecream i2 = new Icecream("スーパーカップ");
		i1.showInfo();
		i2.showInfo();
	}
}

class Icecream{
	String name;
	int price;

	public Icecream(String name, int price){
		this.name = name;
		this.price = price;
	}
	public Icecream(String name){
		//this(name, 120); こっちなら1行、同じ文繰り返さない
		this.name = name;
		this.price = 120;
	}

	public void showInfo(){
		System.out.printf("%s(%d円)%n",this.name, this.price);
	}
}
