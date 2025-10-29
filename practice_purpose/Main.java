package practice_purpose;
public class Main {Integer value = null;
	
	Main(){
		
	}
	
	Main(int value){
//		value = value;
		this.value = value;
	}
	
	
	public static void main(String[] args) {
		System.out.println("sample project");
		Main obj = new Main();
		System.out.println(obj.value);
		obj = new Main(22);
		System.out.println(obj.value);
		
	}
}
