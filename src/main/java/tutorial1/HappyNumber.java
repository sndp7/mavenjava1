package tutorial1;
import java.util.*;
public class HappyNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean result=Happy(n);
		sc.close();
		System.out.println(result);
	}
	static boolean Happy(int n){
		int k=n;
		int r=0;
		while(k>0){
			int a =k%10;
			r+=a*a;
			k=k/10;
		}
		if(n==1)
			return true;
		if(n==4)
			return false;
		n=r;
		return Happy(n);
	}
}
