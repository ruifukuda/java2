public class WeaponApp{
	public static void main(String[] args){
		Weapon w1 = new Weapon("Laser");
		Weapon w2 = new Weapon("鋼のつるぎ", 100);
	}
}

class Item{
	String name;
	int price;

	public Item(){}
	public Item(String name){
		this.name = name;
		this.price = 0;
	}
	public Item(String name, int price){
		this.name = name;
		this.price = price;
	}
}

class Weapon extends Item{
	public Weapon(String name){
		super(name);
	}
	public Weapon(String name, int price){
		super(name, price);
	}
}
