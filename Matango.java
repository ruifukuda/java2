public class Matango{
	int hp = 50;
	final int LEVEL = 10;
	char suffix;

	public Matango(char suffix){
		this.suffix = suffix;
	}

	public void run(){
		System.out.println("おばけキノコ" + this.suffix + "は逃げ出した");
	}
	public void appear(){
		System.out.printf("おばけキノコ%s(%d)があらわれた!%n",this.suffix,this.hp);
	}
	public void attack(Hero h){
		System.out.println("おばけキノコ" + this.suffix + "攻撃");
		System.out.println("10のダメージ");
		h.hp -= 10;
	}
}

class PoisonMatango extends Matango{
	int poisonCount = 5;
	public PoisonMatango(char suffix){
		super(suffix);
	}

	@Override
	public void attack(Hero h){
		super.attack(h);
		if(this.poisonCount > 0){
			System.out.println("さらに毒の胞子をばらまいた!");
			int damage = h.hp / 5;
			h.hp -= damage;
			System.out.println(damage + "ポイントのダメージ!");
			this.poisonCount--;
		}
	}
}
