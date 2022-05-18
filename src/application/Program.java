package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int students;
		char ch = 'A';
		
		Set<Integer> set = new HashSet<>();
		
		for(int i = 0; i < 3; i++) {
			System.out.print("How many students for course " + ch++ + "? ");
			students = sc.nextInt(); sc.nextLine();
			
			for(int j = 0; j < students; j++) {
				int studentNumber = sc.nextInt(); sc.nextLine();
				set.add(studentNumber);
			}
		}
		
		System.out.print("Total students: " + set.size());
		
		
		sc.close();
	}

}
