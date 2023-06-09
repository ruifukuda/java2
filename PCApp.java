public class PCApp{
	public static void main(String[] args){
		PC pc = new PC("apple");
		pc.executeUSB();
		USBFan fan = new USBFan();
		pc.setUSB(fan);
		pc.executeUSB();
		USBMemory memory = new USBMemory();
		pc.setUSB(memory);
		pc.executeUSB();
		USBMouse mouse = new USBMouse();
		pc.setUSB(mouse);
		pc.executeUSB();

		Excel exl = new Excel("エクセル");
		pc.setApp(exl);
		pc.executeApp();
	}
}

interface USBIF{
	void execute();
}

class USBFan implements USBIF{
	@Override
	public void execute(){
		System.out.println("ファンを回して風を送ります");
	}
}

class USBMemory implements USBIF{
	@Override
	public void execute(){
		System.out.println("データをメモリに書き込みます");
	}
}

class USBMouse implements USBIF{
	@Override
	public void execute(){
		System.out.println("画面上のカーソルを動かします。");
	}
}

class PC{
	String makerName;
	//has a の関係
	App app;
	USBIF usbDevice;

	public PC(String makerName){
		this.makerName = makerName;
	}
	public void executeApp(){
		if(this.app == null){
			System.out.println("アプリはインストールされていません!");
		}
		this.app.exe();
	}
	public void executeUSB(){
		if(this.usbDevice == null){
			System.out.println("USB機器は接続されていません! ");
			return;
		}
		this.usbDevice.execute();
	}
	public void setApp(App app){
		this.app = app;
	}
	public void setUSB(USBIF device){
		this.usbDevice = device;
	}
}

abstract class App{
	String appName;

	public App(String appName){
		this.appName = appName;
	}

	public abstract void exe();
}

class Excel extends App{
	public Excel(String appName){
		super(appName);
	}

	@Override
	public void exe(){
		System.out.println(this.appName + ":実行中");
	}
}
