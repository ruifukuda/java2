public class Hero{
	private String name = "ミナト";
	private int hp = 100;

	public Hero(){
		//System.out.println("Heroクラスのコンストラクタ");
	}
	
	public void attack(Matango m){
		System.out.println(this.name + "の攻撃!");
		m.hp -= 5;
		System.out.println("5ポイントのダメージを与えた!");
	}
	public void run(){
		System.out.println(this.name + "は逃げ出した!");
	}

	public String getName(){
		return this.name;
	}
	public int getHp(){
		return this.hp;
	}
	public void setName(String name){
		if(name.length() < 3){
			throw new IllegalArgumentException("名前は3文字以上");
		}
		this.name = name;
	}
	public void setHp(int hp){
		if(hp < 0 ){
			this.hp = 0;
		}else{
			this.hp = hp;
		}
	}
	public String toString(){
		return String.format("名前:%s,hp:%d",this.getName(), this.getHp());
	}
	@Override
	public boolean equals(Object o){
		if(this == o){
			return true;
		}
		if(o instanceof Hero){
			Hero h = (Hero)o;
			if(this.name.equals(h.name)){
				return true;
			}
		}
		return false;
	}
}
