public class DmvSimulator
{
	private static int num;
	private static final int LINE_NUM = 100;
	public static void main(String[] args)
	{
		System.out.println("Welcome to the DMV.");
		num = (int) (Math.random() * 100);
		System.out.println("Your number is " + num);
		for(int i = num + 1; i != num; i = (i + 1)% LINE_NUM)
		{
			System.out.println("Next up: " +  i);
		}
		System.out.println("Next up: " + num);
		System.out.println("You don't have the required paperwork.  NEXT!");
	}

}
