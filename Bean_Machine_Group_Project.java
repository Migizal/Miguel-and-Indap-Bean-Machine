
public class Bean_Machine_Group_Project {

	public static void main(String[] args) {
		System.out.println("Hello World");
		// Outline the code for the Bean Machine and divide up work evenly.

		//System.out.println("Hello World");
		Scanner input = new Scanner(System.in);

		//call the run method:

		//call the test method:

		/*Method 1: greet user: Indap
		 * write a description to greet user
		 * explain the game
		 * tell the user the options
		 */
		System.out.println("Welcome to the Bean Machine Game.\n");
		/*Method 2: get user input: Indap1
		 * ask user for # of bins
		 * ask user for # of balls(limit # of balls)
		 */
		System.out.println("Enter the number of bins: ");
		int bins = input.nextInt();

		System.out.println("Enter the number of balls between 20 to 100: ");
		int balls = input.nextInt();

		/*Method 3: Execute game:
		 * Setup array for bins
		 * setup for loop 
		 * inside for loop call custom method to return which bin get a bean.
		 */
		int[] anArray;
		int i;
		int j;
		for(i = 0; i <bins; i++)
		{ 
			j = 0;
			while (j<i)
			{
				System.out.print(balls);
				j++;
			}
			System.out.println(" ");

		}
		
		/*Method 3b: bean dropping:
		 * return if it goes right or left.
		 */

		//Method 4: Print out results


		//Method 5: Tell the user the game is over
		System.out.println("\nThank you for playing!");
		 

	}

}
