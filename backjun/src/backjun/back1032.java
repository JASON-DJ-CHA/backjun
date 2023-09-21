package backjun;

import java.util.Scanner;

public class back1032 {
	public static void main(String[] args) {


	 	Scanner sc = new Scanner(System.in);
	 	
	 	int n = sc.nextInt();
	 	
	 	char[] findFile = sc.next().toCharArray();
	 	
	 	for(int i = 0; i < n-1; i++) {
	 		char[] s = sc.next().toCharArray();
	 		for(int j =0; j<findFile.length; j++) {
	 			if(findFile[j] != s[j]) {
	 				findFile[j] = '?';
	 			}
	 		}
	 	}	
	 	
	 	System.out.print(findFile);

	 }
}
