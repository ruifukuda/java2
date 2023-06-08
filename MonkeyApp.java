import java.util.*;
public class MonkeyApp{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("おさるの名前を決めてください:>");
		String name = sc.next();
		System.out.print("おさるの歳を決めてください:>");
		int age = sc.nextInt();
		Monkey m = new Monkey(name, age);

		while(true){
		System.out.println("おさるに何をさせますか?1…挨拶、2…竹馬、3…逆立ち、4…終了 >");
		int input = sc.nextInt();
		switch(input){
			case 1:
				m.hello();
				break;
			case 2:
				m.takeuma();
				break;
			case 3:
				m.sakadachi();
				break;
			case 4:
				System.out.println("アプリケーションを終了します。");
				return;
		}
		}
	}
}

class Monkey{
	String name;
	int age;

	public Monkey(String name, int age){
		this.name = name;
		this.age = age;
	}

	public void hello(){
		System.out.printf("こんにちは%s(%d才)です。よろしく!%n", this.name, this.age);
	}

	public void takeuma(){
		System.out.println(this.name + "は竹馬にのった!");
	}
	public void sakadachi(){
		System.out.println(this.name + "はひょいと逆立ちをした!");
	}
}
