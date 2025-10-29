package practice_purpose.exercise.src;

public class App {

    Integer value = null;
	
	App(){
		
	}
	
	App(int value){
//		value = value;
		this.value = value;
	}
    public static void main(String[] args) throws Exception {
        System.out.println("sample project");
		App obj = new App();
		System.out.println(obj.value);
		obj = new App(22);
		System.out.println(obj.value);
    }
}
