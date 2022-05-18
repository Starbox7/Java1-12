
public class infoTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}

}

class TV {
	String a;
	int b;
	int c;
	public TV(String a, int b, int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	void show(){
		System.out.println(a+"에서 만든 "+b+"년형 "+c+"인치 TV");
	}
}