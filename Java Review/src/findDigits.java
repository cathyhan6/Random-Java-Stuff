import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;



public class findDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int numTests = sc.nextInt();
			for (int n=0; n<numTests; n++) {
				int num = sc.nextInt();
				String numString = Integer.toString(num);
				List<Character> list = new ArrayList<>();
				for (int i=0; i<numString.length(); i++) {
					char c = numString.charAt(i);
					if (num % Character.getNumericValue(c) == 0) {
						list.add(c);
					}
				}
				int size = list.size();
				System.out.format ("%d \n", size);
			}


	}
}
