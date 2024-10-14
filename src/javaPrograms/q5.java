/*
Q..What will be the output of following program 
 
 for(int i=1; ; i++)
 {
 SOP(i);
 }
*/

package javaPrograms;

public class q5 {
	public static void main(String args[]) {
		for(int i=1; ; i++)
		 {
		 System.out.println(i);
		 }
	}

}
/*
 The program runs an infinite loop, continuously printing incrementing
 values of i starting from 1, without any termination condition.
 */