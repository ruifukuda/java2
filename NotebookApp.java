import java.util.*;
public class NotebookApp{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("本のページ数を入力して下さい >");
		int pageB = sc.nextInt();
		System.out.print("本の価格を入力して下さい >");
		int priceB = sc.nextInt();
		Book b = new Book(pageB, priceB);

		System.out.print("ノートのページ数を入力して下さい >");
		int pageN = sc.nextInt();
		System.out.print("ノートの価格を入力して下さい >");
		int priceN = sc.nextInt();
		Notebook n = new Notebook(pageN, priceN);

		while(true){
			System.out.print("1.本の情報表示 / 2.ノートの情報表示 / 3.ノートに追加書き込み / 4.終了 >");
			int input = sc.nextInt();
			switch(input){
				case 1:
					b.showInfo();
					break;
				case 2:
					n.showInfo();
					break;
				case 3:
					System.out.print("書き込む内容を入力して下さい >");
					String str = sc.next();
					n.apend(str);
					break;
				case 4:
					System.out.println("アプリケーションを終了します。");
					return;
			}
		}
	}
}
class Book{
	int page;
	int price;

	public Book(int page, int price){
		this.page = page;
		this.price = price;
	}

	public void showInfo(){
		System.out.println("ページ数:" + this.page);
		System.out.println("価格:" + this.price);
	}
}

class Notebook extends Book{
	String content = "";

	public Notebook(int page, int price){
		super(page, price);
	}

	public void apend(String str){
		this.content += str;
	}
	@Override
	public void showInfo(){
		super.showInfo();
		System.out.println("内容:" + this.content);
	}
}
