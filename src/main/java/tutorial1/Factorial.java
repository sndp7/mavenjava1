package tutorial1;
import java.util.*;
public class Factorial {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = Fact(n);
		sc.close();
		System.out.println(result);
	}
	static int Fact(int n) {
		if(n==0)return 1;
		return n*Fact(n-1);
	}
}
