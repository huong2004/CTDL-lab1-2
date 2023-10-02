
public class Task1 {
	public static int getSn1(int n) {
		int sum=0;
		if (n==1) {
			return 1;
		}
		else
			sum= (int) Math.pow(-1, n+1)*n + getSn1( n-1);
		return sum;}
		public static int getSn2 (int n) {
			if (n==1)
				return 1;
			else
				return getSn2(n-1) + factorial (n);
		}

	private static int factorial(int n) {
		int result=1;
		for (int i=1; i<=n;i++)
			
		 result*=i;
		return result;
		}
	public static int getSn3 (int n) {
		if (n==1)
			return 1;
		else 
			return (int) Math.pow (n,2)+ getSn3(n-1);
	}
	public static double getSn4 (int n) {
		if (n==0)
			return 1.0;
		else 
			return getSn4(n-1)+1.0/(divide(n));
	}
	private static int divide(int n) {
		if (n==0)
			return 1;
		else 
			return 2*n*divide(n-1);
	}

	public static void main(String[] args) {
		int n=2;
		System.out.println(getSn1(n));
		System.out.println(getSn2(n));
		System.out.println(getSn3(n));
		System.out.println(getSn4(n));
	}
}
