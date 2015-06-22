package test;

public class Cal {

	public static void main(String[] agrs){
		
		double a=5,b=40,c=-102;
		
		double sqrt=Math.sqrt(b*b-4*a*c);
		System.out.println("b平方-4ac等于"+sqrt);
		
		double result1=(-b+sqrt)/(2*a);
		double result2=(-b-sqrt)/(2*a);
		
		System.out.println("result1="+result1);
		System.out.println("result2="+result2);
	}
}
