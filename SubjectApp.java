import java.util.*;
public class SubjectApp{
	public static void main(String[] args){
		//スキャナーインスタンス作成
		Scanner sc = new Scanner(System.in);
		System.out.print("何科目ありますか>>");
		int n = sc.nextInt();
		//Subject配列作成
		Subject[] sbs = new Subject[n];
		for(int i = 0; i<n; i++){
			System.out.print(i + 1 + "科目の名前>>");
			String name = sc.next();
			System.out.print(i + 1 + "科目の点数>>");
			int score = sc.nextInt();
			//Subjectインスタンス作成
			Subject sb = new Subject(name, score); 
			//インスタンスを配列に格納
			sbs[i] = sb;
		}

		//for文でそれぞれのインスタンスにアクセス
		for(int i = 0; i<sbs.length; i++){
			//グラフを描画するインスタンスメソッドの実行
			sbs[i].showGraph(); 
		}
	}
}
