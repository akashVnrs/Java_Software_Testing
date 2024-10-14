/*
 Q..What will be the output of following program and why ?(explanation)
 for(int i=1; i<10; i++)
 {
 if(i==5)
 {
 break;
 }
 SOP(i);
 }

 */
package javaPrograms;

public class q10 {
	public static void main(String args[]) {
		 for(int i=1; i<10; i++)
		 {
		 if(i==5)
		 {
		 break;
		 }
		 System.out.println(i);
		 }
	}

}

/*
The program prints the numbers 1, 2, 3, and 4, then stops when i
reaches 5 due to the break statement.
 */
