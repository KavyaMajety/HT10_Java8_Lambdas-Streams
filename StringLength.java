package epam_lambdas.ht10;

import java.util.*;
import java.util.function.Consumer;

public class StringLength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str =  sc.nextLine();
		String str1[] = str.split(" ");
		List<String> arraylist = Arrays.asList(str1);
		forEach(arraylist, (String ret)-> System.out.print(ret+" "));
		
	}
	public static void forEach(List<String> list1, Consumer<String> con) {
		for(String i : list1) {
			if(i.charAt(0) == 'a' && i.length()==3) {
				con.accept(i);
			}
		}

	}

}
