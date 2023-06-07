import java.util.*;
public class SlimeApp{
	public static void main(String[] args){
		Slime s1 = new Slime("スラキチ", 25);
		Slime s2 = new Slime(20);
		s1.appear();
		s2.appear();
		System.out.println(Slime.getCount()+"体のスライムが襲ってきた");
	}
}

class Slime{
	static int count = 0;
	String name;
	int hp;

	public Slime(String name, int hp){
		this.name = name;
		this.hp = hp;
		count++;
	}
	public Slime(int hp){
		this("スライム", hp);
	}

	public void appear(){
		System.out.printf("%s(%d)があらわれた!%n",name, hp);
	}

	public static int getCount(){
		return count;
	}
}

