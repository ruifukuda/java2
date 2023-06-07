import java.util.*;
public class FruitsApp{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("野菜をいくつ購入しますか>>");
		int num = sc.nextInt();
		Fruits[] fruits = new Fruits[num];
		for(int i = 0; i<fruits.length; i++){
			System.out.print(i + 1 + "つめ野菜>>");
			String name = sc.next();
			System.out.print(name + "の価格>>");
			int price = sc.nextInt();
			fruits[i] = new Fruits(name, price);
		}
		int sum = 0;
		for(int i = 0; i<fruits.length; i++){
			fruits[i].status();
			sum += fruits[i].price;
		}
		System.out.println("合計は" + sum + "円です。");
	}
}

class Fruits{
	String name;
	int price;

	public Fruits(String name, int price){
		this.name = name;
		this.price = price;
	}

	public void status(){
			System.out.printf("%s(%d円)%n",this.name, this.price);
	}
}
