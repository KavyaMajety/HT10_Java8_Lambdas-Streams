package epam_lambdas.ht10;

import java.util.*;
import java.util.function.Consumer;

public class Average {
	
	public static void  findAverage(List<Integer> list, Consumer<Integer> con) {
		int s = 0;
		for(int i : list) {
			s += i;
		}
		con.accept(s);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the list:");
		int num = sc.nextInt();
		System.out.println("Enter the list elements seperated by space. Enter any character to terminate the input.");
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		for(int i = 0; i < num; i++) {
			arraylist.add(sc.nextInt());
		}
		findAverage(arraylist, (Integer n) -> System.out.println("The Average of given integers is "+ (n / (float)num)));
	}
}
