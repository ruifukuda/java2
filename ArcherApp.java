import java.util.*;
public class ArcherApp{
	public static void main(String[] args){
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		Archer[] archers = new Archer[10];
		for(int i = 0; i<archers.length; i++){
			int power = rand.nextInt(51) + 50;
			archers[i] = new Archer(power);
		}
		Castle c = new Castle(750);
		for(Archer a : archers){
			System.out.println("enter key");
			sc.nextLine();
			int power = a.attack();
			if(c.isDestroyed(power)){
				return;
			}
		}
		System.out.println("城の攻略に失敗した...");
	}
}

class Archer{
	static char alph = 'A';
	char suffix;
	int power;

	public Archer(int power){
		this.suffix = alph++;
		this.power = power;
		System.out.printf("アーチャー%s(%d)が戦闘に加わった!%n",this.suffix, this.power);
	}

	public int attack(){
		System.out.printf("アーチャー%sは弓をはなった!%n",this.suffix);
		return this.power;
	}
}

class Castle{
	int hp;

	public Castle(int hp){
		this.hp = hp;
	}

	public boolean isDestroyed(int power){
		System.out.printf("城は攻撃をうけた。%sのダメージ(残:%d)%n",power, this.hp);
		this.hp -= power;
		if(this.hp <= 0){
			System.out.println("城は崩壊した!!");
			return true;
		}
		return false;
	}
}
