import java.util.Scanner;
public class Project1_CSI {


	/*Method 3: Execute game: Miguel
	 * Setup array for bins
	 * setup for loop 
	 * inside for loop call custom method to return which bin gets a bean.
	 */
	public static int binCount;
	public static int ballCount;

	public static void topRun(){

		int[] binArray = new int[binCount];

		binArray = FillBinArray(binCount, ballCount, binArray);

		for (int i = 0; i < binCount; i++){
			System.out.println("The Amount of balls in bin number " + (i+1) + " is " + binArray[i] + "." );
		}
	}
	public static int[] FillBinArray (int binCount, int ballCount, int[]binArray){



		for (int ballNumber = 1; ballNumber <= ballCount; ballNumber = ballNumber + 1){

			int left = 0;
			int binOfInterest = 0;

			for (int layerCount = 1; layerCount < binCount; layerCount = layerCount + 1){

				double randomNumber = Math.random();
				if (randomNumber < 0.5){
					left = left + 1;
				}
			}
			binOfInterest = binCount - left - 1;


			binArray[binOfInterest] = binArray[binOfInterest] + 1;
		}
		return binArray;

	}


	public static void main(String[] args) {
		// System.out.println("Hello World");
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
		
			
		System.out.println("Welcome to the Bean Machine Game.");
		System.out.println("You will pick the number of bins and balls.");
		System.out.println("Then, you will drop all the balls and see which bin it lands.\n");
		/*Method 2: get user input: Indap1
		 * ask user for # of bins
		 * ask user for # of balls(limit # of balls)
		 */
		System.out.println("Enter the number of bins(more than 1): ");
		binCount = input.nextInt();

		System.out.println("Enter the number of balls: ");
		ballCount = input.nextInt();
		
		
			
		topRun();
		
		/*Method 3: Execute game:
		 * Setup array for bins
		 * setup for loop 
		 * inside for loop call custom method to return which bin get a bean.
		 */

		/*Method 3b: bean dropping:
		 * return if it goes right or left.
		 */

		//Method 4: Print out results

		//System.out.println("Hello World");

		//call the run method:

		//call the test method:

		//Method 5: Tell the user the game is over

		System.out.println("Thank you for playing!");


	}

}


