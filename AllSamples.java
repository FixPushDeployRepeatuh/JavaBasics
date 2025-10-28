package java_new_practice;

public class AllSamples {

	Integer value = null;
	
	AllSamples(){
		
	}
	
	AllSamples(int value){
//		value = value;
		this.value = value;
	}
	
	
	public static void main(String[] args) {
		System.out.println("sample project");
		AllSamples obj = new AllSamples();
		System.out.println(obj.value);
		obj = new AllSamples(22);
		System.out.println(obj.value);
		
	}

}
