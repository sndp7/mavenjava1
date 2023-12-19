package tutorial1;
import java.util.*;
public class GCD {
	public static void main(String args[]) {
		
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	if(a==0||b==0) {
		System.out.print(0);
	}
	sc.close();
//	int result=(a>b)?gcd(b,a):gcd(a,b);
	}
	static int gcd(int a,int b) {
		if(a==b || a==0)
			return b;
		return gcd(b%a,a);
	}
}
