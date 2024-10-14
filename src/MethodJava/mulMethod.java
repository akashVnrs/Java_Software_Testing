package MethodJava;

public class mulMethod {
	int n=20;
	int j=20;
	public void mul() {
		System.out.println("Multiplication of "+j+" x "+n+" = "+(n*j));
	}
	public static void main(String args[]) {
		mulMethod Multiplication =new mulMethod();
		Multiplication.mul();
	}

}
