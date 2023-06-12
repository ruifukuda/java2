public class WizardApp{
	public static void main(String[] args){
		Hero h = new Hero();
		h.setHp(100);
		Wand w = new Wand();
		w.setName("魔法の杖");
		w.setPower(20.0);
		Wizard wiz = new Wizard();
		wiz.setName("ゼシカ");
		wiz.setHp(100);
		wiz.setMp(100);
		wiz.setWand(w);
		wiz.heal(h);
		System.out.println(h);
		System.out.println(wiz);
	}
}
