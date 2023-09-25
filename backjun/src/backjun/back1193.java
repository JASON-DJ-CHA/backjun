package backjun;


import java.util.Scanner;


public class back1193 {
	 public static void main(String[] args) {
		 
		 //1193น้มุ

	 	Scanner sc = new Scanner(System.in);
	 	
	 	int X = sc.nextInt();
	 	
	 	int n=0;
	 	int cnt=0;
	 	
	 	while(cnt<X){
	 		n++;
	 	    cnt=n*(n+1)/2; 
	 	}
	 	
	 	int top = 0;
	 	int bottom = 0;
	 			
	 	if(n%2 == 0 ) 
	 	{
	 		top = 1+(X-(n-1)*n/2-1);
	 		bottom = n-(X-(n-1)*n/2-1);
	 	}
	 	else
	 	{
	 		top = n-(X-(n-1)*n/2-1);
	 		bottom = 1+(X-(n-1)*n/2-1);
	 	}
	 	
	 	System.out.println(top+"/"+bottom);
	 	System.out.println(X-(n-1)*n/2);	 	
	 	
	 }
	       
}
