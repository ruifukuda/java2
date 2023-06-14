public class EmptyApp{
	public static void main(String[] args){
		Empty e = new Empty();
		String s = e.toString();
		System.out.println(s);
		Object[] data = new Object[3];
		data[0] = e;
		data[1] = new Hero();
		data[2] = new Matango('A');
		for(Object o : data){
			System.out.println(o.toString());
		}

		Hero hero = new Hero();
		System.out.println(hero);
		if(hero.equals(data[1])){
			System.out.println("同価です");
		}

		hero.setName("ゼシカ");
		if(hero.equals(data[1])){
			System.out.println("同価です");
		}else{
			System.out.println("同価ではありません");
		}
	}
}
class Empty{
}
