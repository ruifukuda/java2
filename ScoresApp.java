import java.util.*;
public class ScoresApp{
	public static void main(String[] args){
		Score[] arr = {
			new Score("山田", 70), 
			new Score("長野", 99),
			new Score("山本", 65),
			new Score("森本", 100)
		};
		//for文の条件2つとも普段と違うところある
		for(int i = 0; i<arr.length-1; i++){
			for(int j = i+1; j<arr.length; j++){
				//if文の条件式危ない、後半j
				if(arr[i].getScore() < arr[j].getScore()){
					//Score型のtempじゃないとダメ、int型じゃない
					Score temp;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(Score s : arr){
			System.out.printf("名前:%s, 点数%d%n",s.getName(), s.getScore());
		}
	}
}

class Score{
	private String name;
	private int score;

	public Score(String name, int score){
		this.setName(name);
		this.setScore(score);
	}

	public String getName(){
		return this.name;
	}
	public int getScore(){
		return this.score;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setScore(int score){
		this.score = score;
	}
}
