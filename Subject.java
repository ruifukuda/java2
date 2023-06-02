public class Subject{
	String name;
	int score;

	public Subject(String name, int score){
		this.name = name;
		this.score = score;
	}
	public void showGraph(){
		System.out.print(this.name + ":");
		for(int i = 0; i<this.score; i++){
			System.out.print("*");
			if((i + 1)% 10 == 0){
				System.out.print("|");
			}
		}
		System.out.println();
	}
}
