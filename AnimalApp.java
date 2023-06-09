public class AnimalApp{
	public static void main(String[] args){
		/*
		Dog d = new Dog("ポチ");
		d.introduce();
		d.makeNoise();
		Cat c = new Cat("タマ");
		c.introduce();
		c.makeNoise();
		c.sleep();
		Bird b = new Bird("タロウ");
		b.introduce();
		b.makeNoise();
		b.fly();
		*/
		Animal[] animals = {
			new Dog("ポチ"),
			new Cat("タマ"),
			new Bird("タロウ"),
			new Gorilla("ごりきち"),
		};
		for(Animal a : animals){
			a.introduce();
			a.makeNoise();
			if(a instanceof Cat){
				((Cat)a).sleep();
			}
			if(a instanceof Bird){
				((Bird)a).fly();
			}
			if(a instanceof Gorilla){
				((Gorilla)a).drumming();
			}
		}
	}
}

abstract class Animal{
	String name;

	public Animal(String name){
		this.name = name;
	}

	public void introduce(){
		System.out.printf("名前は%sだよ%n",this.name);
	}
	public abstract void makeNoise();
}

class Dog extends Animal{
	public Dog(String name){
		super(name);
	}
	@Override
	public void makeNoise(){
		System.out.println("ワン!");
	}
}

class Cat extends Animal{
	public Cat(String name){
		super(name);
	}
	@Override
	public void makeNoise(){
		System.out.println("にゃー");
	}
	public void sleep(){
		System.out.println("zzz...");
	}
}

class Bird extends Animal{
	public Bird(String name){
		super(name);
	}
	@Override
	public void makeNoise(){
		System.out.println("ちゅんちゅん");
	}
	public void fly(){
		System.out.println(this.name + "は大空に向かって飛び立った");
	}
}

class Gorilla extends Animal{
	public Gorilla(String name){
		super(name);
	}
	@Override
	public void makeNoise(){
		System.out.println("ウホウホ");
	}
	public void drumming(){
		System.out.println(this.name + "は胸を叩いている");
	}
}
