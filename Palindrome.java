package epam_lambdas.ht10;

import java.util.*;
import java.util.function.Consumer;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] str1 = str.split(" ");
		List<String> arraylist = Arrays.asList(str1);
		forEach(arraylist, (String res)->System.out.print(res+" "));

	}
	public static void forEach(List<String> al, Consumer<String> con) {
		for(String str:al) {
			if(isPalindrome(str)) {
				con.accept(str);
			}
		}
	}
	public static boolean isPalindrome(String str) {
		int len = str.length();
		for(int i = 0; i < len/2; i++) {
			if(str.charAt(i) != str.charAt(len - i -1)) return false;
		}
		return true;
	}
}
