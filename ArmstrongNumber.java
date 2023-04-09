import java.util.Scanner;
class  ArmstrongNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();


		int arm = 0;
		int org = num;

		while(num > 0)
		{
			int rem = num % 10;
				arm = rem*rem*rem + arm ;
				num = num/10;
		}

		if(org == arm)
		{
			System.out.println("It's an armstrong number");
		}
		else
		{
			System.out.println("It's not an armstrong number");
		}
	}
}
