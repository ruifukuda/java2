public class PersonApp{
	public static void main(String[] args){
		Person p = new Person("山田", 23);
		System.out.println(p.getName());
		System.out.println(p.getAge());

		p.setName("鈴木");
		p.setAge(p.getAge() + 1);
		System.out.printf("名前:%s,年齢:%d%n",p.getName(), p.getAge());
		//p.setName("あ");実行時に例外スロー
		//p.setAge(200);実行時に例外スロー
	}
}
