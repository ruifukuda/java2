public class FoolApp{
	public static void main(String[] args){
		Fool f = new Fool(30, "ロト");
		f.run();
		f.talk();
		f.watch();
		f.hear();
		f.attack();
	}
}


interface Creature{
	void run();
}


interface Human extends Creature{
	void talk();
	void watch();
	void hear();
}


abstract class Character{
	int hp;
	String name;

	public Character(int hp, String name){
		this.hp = hp;
		this.name = name;
	}

	public abstract void run();
	public abstract void attack();
}


class Fool extends Character implements Human{
	public Fool(int hp,String name){
		super(hp, name);
	}

	@Override
	public void run(){
		System.out.println("逃げ出した");
	}
	@Override
	public void talk(){
		System.out.println("話した");
	}
	@Override
	public void watch(){
		System.out.println("見た");
	}
	@Override
	public void hear(){
		System.out.println("聞いた");
	}
	@Override
	public void attack(){
		System.out.println("戦った");
	}
}
