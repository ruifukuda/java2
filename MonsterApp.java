import java.util.*;
public class MonsterApp{
	public static void main(String[] args){
		Goblin g1 = new Goblin(100, 10);
		g1.attack();
		g1.run();
		g1.showInfo();
		Werewolf w1 = new Werewolf(70, 15);
		w1.attack();
		w1.run();
		w1.showInfo();
		DeathBat d1 = new DeathBat(50, 20);
		d1.attack();
		d1.run();
		d1.showInfo();
	}
}

//抽象クラス
abstract class Monster{
	int hp;
	int mp;

	//コンストラクタ
	public Monster(int hp, int mp){
		this.hp = hp;
		this.mp = mp;
	}

	//抽象メソッド
	public abstract void attack();
	public abstract void run();
	public void showInfo(){
		System.out.println(this.hp + " " + this.mp);
	}
}

abstract class WalkingMonster extends Monster{
	public WalkingMonster(int hp, int mp){
		super(hp, mp);
	}
	//runメソッドの実装
	@Override
	public void run(){
		System.out.println("トコトコ走って逃げる");
	}
}

abstract class FlyingMonster extends Monster{
	public FlyingMonster(int hp, int mp){
		super(hp, mp);
	}
	//runメソッドの実装
	@Override
	public void run(){
		System.out.println("バサバサ飛んで逃げる");
	}
}

//具象クラス
class Goblin extends WalkingMonster{
	public Goblin(int hp, int mp){
		super(hp, mp);
	}
	//attackメソッドの実装
	@Override
	public void attack(){
		System.out.println("ナイフで斬りつける");
	}
}

class Werewolf extends WalkingMonster{
	public Werewolf(int hp, int mp){
		super(hp, mp);
	}
	//attackメソッドの実装
	@Override
	public void attack(){
		System.out.println("かみつく");
	}
}

class DeathBat extends FlyingMonster{
	public DeathBat(int hp, int mp){
		super(hp, mp);
	}
	//attackメソッドの実装
	@Override
	public void attack(){
		System.out.println("突っつく");
	}
}
