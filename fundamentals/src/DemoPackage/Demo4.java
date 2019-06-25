package DemoPackage;

public class Demo4 {
	public static void main(String args[]) {
		if(Integer.parseInt(args[0])>0) {
			System.out.println("Positive");
		}
		else if(Integer.parseInt(args[0])<0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Zero");
		}
	}

}
