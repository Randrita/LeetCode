import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-- > 0){
	        int A = sc.nextInt();
	        int B = sc.nextInt();
	        int C = sc.nextInt();
	        int n = sc.nextInt();
	        
	        System.out.println(geek(A , B , C , n));
	    }
	    
	 }
	 
	 static int geek(int A , int B , int C , int n){
	     
	    if(n==1)
            return A;
        if(n==2)
            return B;
        if(n==3)
            return C;
	       
	     int geek = geek(A , B , C ,n-1) + geek(A , B , C , n-2) + geek(A , B , C , n-3);
	     return geek;
	 }

}