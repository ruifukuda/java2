public class Person{
	private String name;
	private int age;

	public Person(String name, int age){
		//コンストラクタの時点でsetter経由しないと例外処理働かない。
		this.setName(name);
		this.setAge(age);
	}

	//getter(最重要)
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	//setter(最重要)
	public void setName(String name){
		if(name == null){
			throw new IllegalArgumentException("名前がnullである。err");
		}
		if(name.length() <= 1){
			throw new IllegalArgumentException("名前が短すぎる。err");
		}
		if(name.length() >= 8){
			throw new IllegalArgumentException("名前が長すぎる。err");
		}
		this.name = name;
	}

	public void setAge(int age){
		if(age < 0){
			throw new IllegalArgumentException("年齢は正の値。err");
		}
		if(age > 150){
			throw new IllegalArgumentException("年齢の値が大きすぎる。err");
		}
		this.age = age;
	}
}
