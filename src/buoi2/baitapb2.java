package buoi2;
//import java.math.;
import java.util.Scanner;

public class baitapb2 {

	public static void main(String[] args) {
		int a,b,c,d;
		   
		Scanner socuoi = new Scanner(System.in);
		System.out.println("nhap a:");
		a = socuoi.nextInt();
		
		System.out.println("nhap b:");
		b = socuoi.nextInt();
	
		System.out.println("nhap c:");
		c = socuoi.nextInt();
		 
		System.out.println("nhap d:");
		d = socuoi.nextInt();
		System.out.println("so lon nhat la:");{
			if ((a>b)&&(a>c)&&(a>d)) {
				System.out.println( a  );
			}
			else if((b>a)&&(b>c)&&(b>d)){
				System.out.println( b  );
			}
			else if ((c>a)&&(c>b)&&(c>d)) {
				System.out.println( c );
			}
			else {
				System.out.println( d );
			}
			
		}
		System.out.println("so nho nhat la:");{
			if ((a<b)&&(a<c)&&(a<d)) {
				System.out.println( a  );
			}
			else if((b<a)&&(b<c)&&(b<d)){
				System.out.println( b  );
			}
			else if ((c<a)&&(c<b)&&(c<d)) {
				System.out.println( c );
			}
			else {
				System.out.println( d );
			}
		}
		

//		if ((a>b)&&(a>c)&&(a>d)) {
//			System.out.println( a + " la so lon nhat" );
//		}
//		else if((b>a)&&(b>c)&&(b>d)){
//			System.out.println( b + " la so lon nhat" );
//		}
//		else if ((c>a)&&(c>b)&&(c>d)) {
//			System.out.println( c + " la so lon nhat");
//		}
//		else {
//			System.out.println( d + " la so lon nhat");
//		}
		
}
}
	