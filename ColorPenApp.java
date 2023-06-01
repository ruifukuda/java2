import java.util.*;
public class ColorPenApp{
	public static void main(String[] args){
		//ColorPenインスタンスの生成
		ColorPen cp1 = new ColorPen("赤",5);
		//インスタンスメソッドの実行
		cp1.showStatus();
		cp1.write();
		cp1.showStatus();
		
		ColorPen cp2 = new ColorPen();
		cp2.write() ;
		cp2.showStatus() ;

		ColorPen cp3 = new ColorPen("黄");
		cp3.len = 7;
		cp3.showStatus();
	}
}
