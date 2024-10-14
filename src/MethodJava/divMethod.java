package MethodJava;

public class divMethod {
	int n=400;
	int j=20;
	public void div() {
		System.out.println("Division of "+n+" / "+j+" = "+(n/j));
	}
	public static void main(String args[]) {
		divMethod Division =new divMethod();
		Division.div();
	}

}
