class Fibonacci_Series{
	public static void main(String[] args){
			int a = 0, b =1;
			int c;
			

			for(int i=1;i<10;i++)
			{
				
				System.out.println(a);
				c = a+b;
				a = b;
				b = c;
			}


		

	}
}