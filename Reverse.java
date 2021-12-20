import java.util.Scanner;
class Reverse{
	public static void main(String[] args)
	{
		int n, num;
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		while(n>0)
		{
			num=n%10;
			System.out.print(num);
			n=n/10;

		}
	}
}