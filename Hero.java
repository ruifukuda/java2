public class Hero{
	String name = "ミナト";
	int hp = 100;

	public Hero(){
		System.out.println("Heroクラスのコンストラクタ");
	}
	
	public void attack(Matango m){
		System.out.println(this.name + "の攻撃!");
		m.hp -= 5;
		System.out.println("5ポイントのダメージを与えた!");
	}
	public void run(){
		System.out.println(this.name + "は逃げ出した!");
	}
	@Override
	public String toString(){
		return String.format("名前:%s/HP:%d",this.name, this.hp);
	}
	@Override
	public boolean equals(Object o){
		if(this == o){
			return true;
		}
		if(o instanceof Hero){
			Hero h = (Hero)o;
			if(this.name.equals(h.name){
				return true;
			}
		}
		return false;
	}
}
