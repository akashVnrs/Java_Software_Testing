/*
 Q..What will be the output of following program and why ?(explanation)
 for(int i=1; i<10; i++)
 {
 if(i==5)
 {
 continue;
 }
 SOP(i);
 }
 */
package javaPrograms;

public class q11 {
	public static void main(String args[]) {
		for(int i=1; i<10; i++)
		 {
		 if(i==5)
		 {
		 continue;
		 }
		 System.out.println(i);
		 }
	}

}

/*
The program prints the numbers 1, 2, 3, 4, 6, 7, 8, and 9, 
skipping 5 due to the continue statement
 */
 
