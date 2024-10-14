package MethodJava;

public class addMethod {
	int n=10;
	int j=20;
	public void add(){
		System.out.println("Addition of "+n+"+"+j+" = "+(n+j));
	}
	public static void main(String args[]) {
		addMethod addition=new addMethod();
		addition.add();
	}

}
