/*
 Q..What will be the output of following program 
 
 for(int i=1 ; ; )
 {
 SOP(i);
 }

 */
package javaPrograms;

public class q7 {
	public static void main(String args[]) {
		for(int i=1 ; ; )
		 {
		 System.out.println(i);
		 }
	}

}

/*
 The program runs an infinite loop, continuously printing 1 because i
 is never updated.
 */

