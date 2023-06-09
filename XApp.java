public class XApp{
	public static void main(String[] args){
		new A().a();//Aa
		Y y = new A();
		y.b();//Ab
					
		/*コンパイルエラー(AとBは継承関係にない)
		B b = new A();
		b.c();
		*/

		/*コンパイルエラー(抽象クラスはnewできない)
		X x = new Y();
		x.a();
		*/

		Y y1 = new A();
		//キャストは優先順位低いから()で先にする
		((A)y1).c();//Ac
		//y1.c();  コンパイルエラー、ダウンキャストの効果範囲は1行のみ

		//実行時エラー(BインスタンスをAにすることはできない)
		Y y2 = new B();
		//((A)y2).a();

		X x = new B();
		x.a();

		Y[] data = {new A(), new B()};
		for(Y obj : data){
			obj.a();
			if(obj instanceof A){
				((A)obj).c();
			}
		}//AaAcBa
	}
}

interface X{
	void a();
}

abstract class Y implements X{
	public abstract void a();
	public abstract void b();
}

class A extends Y{
	public void a(){
		System.out.print("Aa");
	}
	public void b(){
		System.out.print("Ab");
	}
	public void c(){
		System.out.print("Ac");
	}
}
class B extends Y{
	public void a(){
		System.out.print("Ba");
	}
	public void b(){
		System.out.print("Bb");
	}
	public void c(){
		System.out.print("Bc");
	}
}
