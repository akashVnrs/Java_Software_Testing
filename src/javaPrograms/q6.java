/*
 Q..What will be the output of following program 
 
 for(int i=1; i<=10;)
 {
 SOP(i);
 }

 */
package javaPrograms;

public class q6 {
	public static void main(String args[]) {
		for(int i=1; i<=10;)
		 {
		 System.out.println(i);
		 }
	}

}
/*
The program enters an infinite loop, continuously printing 1
because i is never incremented. 
 */

