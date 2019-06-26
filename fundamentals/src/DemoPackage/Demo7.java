package DemoPackage;
import java.util.*;
public class Demo7 {
	public static void main(String args[]) {
		String a;
		String b;
		Scanner sc=new Scanner(System.in);
		a=sc.next();
		b=sc.next();
		if(a.charAt(0)>b.charAt(0)) {
			System.out.println(a+","+b);
		}
		else {
			System.out.println(b+","+a);
		}
	}

}
