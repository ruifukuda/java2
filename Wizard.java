public class Wizard{
	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	public void heal(Hero h){
		int basePoint = 10;
		//this.wand.getPower()注意
		int recovPoint = (int)(basePoint * this.wand.getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した!");
	}
	public int getHp(){
		return this.hp;
	}
	public int getMp(){
		return this.mp;
	}
	public String getName(){
		return this.name;
	}
	public Wand getWand(){
		return this.wand;
	}

	public void setHp(int hp){
		/*先生の答え
		if(hp < 0){
			this.hp = 0;
			return;
		}
		this.hp = hp;
		*/
		if(hp < 0 ){
			this.hp = 0;
		}else{
			this.hp = hp;
		}
	}
	public void setMp(int mp){
		if(mp < 0){
			throw new IllegalArgumentException("MPは0以上");
		}
		this.mp = mp;
	}
	public void setName(String name){
		if(name.length() < 3){
			throw new IllegalArgumentException("名前は3文字以上");
		}
		this.name = name;
	}
	public void setWand(Wand wand){
		if(wand == null){
			throw new IllegalArgumentException("設定されようとしている杖がnullです");
		}
		this.wand = wand;
	}

	/*toStringメソッドのオーバーライド
	 *戻り値String注意、String.format()使うと書きやすい
	 *呼び出しがprintlnでformatの中に%nあると改行2回なるから注意
	 */
	public String toString(){
		return String.format("名前:%s, hp:%d, mp:%d, 杖:%s",this.getName(), this.getHp(), this.getMp(), this.wand.getName());
	}
}
