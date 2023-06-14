public class Wand{
	private String name;
	private double power;

	public String getName(){
		return this.name;
	}
	public double getPower(){
		return this.power;
	}
	public void setName(String name){
		if(name.length() < 3){
			throw new IllegalArgumentException("名前は3文字以上");
		}
		this.name = name;
	}
	public void setPower(double power){
		if(power < 0.5 || power > 100){
			throw new IllegalArgumentException("杖による増幅率は0.5以上100以下");
		}
		this.power = power;
	}
}
