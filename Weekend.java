 import java.util.Scanner; 


class Weekend				
{
	public static void main(String args[]) {
		int dayname;
		System.out.println("enter week day");
		Scanner Scan = new Scanner(System.in);     
		dayname = Scan.nextInt();

		switch(dayname)
		{
		case 1:
			System.out.println(" Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		}

	}
}
