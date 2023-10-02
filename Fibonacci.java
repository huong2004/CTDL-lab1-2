
public class Fibonacci {
	public static int getFibonacci (int n) {
		int result=0;
		if (n<=1)
			return n;
		else 
		result= getFibonacci(n-1) + getFibonacci(n-2);
		return result;
	}
	public static void printFibonacci (int n) {
		for (int i = 0; i < n; i++) {
			 
            System.out.print(getFibonacci(i) + " ");
		}
	}
	public static void main(String[] args) {
		int n=4;
		System.out.println(getFibonacci(n));
		printFibonacci(n);
	}

}
