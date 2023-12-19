package tutorial1;
import java.util.*;
public class StringReverse {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		String str=sc.next();
		String reversed =reverse(str);
		System.out.print(reversed);
	}
	static String reverse(String str) {
		if(str.isEmpty()) {
			return "";
		}
		return reverse(str.substring(1))+str.charAt(0);
	}
}
