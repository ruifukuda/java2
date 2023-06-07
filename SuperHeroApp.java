public class SuperHeroApp{
	public static void main(String[] args){
		SuperHero sh = new SuperHero();
		Matango m = new Matango();
		m.suffix = 'A';
		m.hp = 10;
		sh.fly();
		sh.attack(m);
		sh.run();
	}
}
