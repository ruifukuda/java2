public class ColorPen{
	//フィールド
	String color;
	int len;

	//コンストラクタ
	public ColorPen(){
	}

	public ColorPen(String color, int len){
		//自クラスのコンストラクタの呼び出し
		//this()は必ず1行目にある必要がある
		this(color);
		this.len = len;
	}

	public ColorPen(String color){
		this.color = color;
	}
	 
	//メソッド
	public void write(){
		if(this.len == 0){
			System.out.println("もう描けません");
			return;
		}
		System.out.printf("%sで描いた%n",this.color);
		this.len--;
	}
	public void showStatus(){
		String str = "";
		for(int i = 0; i<this.len; i++){
			str += "=";
		}
		str += ">";
		System.out.println(str);
	}
}
