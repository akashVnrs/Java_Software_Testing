package MethodJava;

public class subMethod {
	int n=20;
	int j=50;
	public void sub() {
		System.out.println("Subtraction of "+j+" - "+n+" = "+(j-n));
	}
	public static void main(String args[]) {
		subMethod subtraction =new subMethod();
		subtraction.sub();
	}

}
