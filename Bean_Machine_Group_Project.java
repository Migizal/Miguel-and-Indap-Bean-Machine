
public class Bean_Machine_Group_Project {
	
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
		
<<<<<<< HEAD
		/*Method 3b: bean dropping:
		 * return if it goes right or left.
		 */

		//Method 4: Print out results


		//Method 5: Tell the user the game is over
		System.out.println("\nThank you for playing!");
=======
		//System.out.println("Hello World");
		
		//call the run method:
		
		//call the test method:
		
		/*Method 1: greet user: Indap
		 * write a description to greet user
		 * explain the game
		 * tell the user the options
		 */
		
		/*Method 2: get user input: Indap1
		 * ask user for # of bins
		 * ask user for # of balls(limit # of balls)
		 */
		
		
		
		
		
		/*Method 3b: bean dropping: Miguel
		 * return if it goes right or left.
		 */
		
		//Method 4: Print out results: Miguel
		 
		
		//Method 5: Tell the user the game is over
		System.out.println("Thank you for playing!");
>>>>>>> f911f371c5f4bf32be46e612bca339575db4f6fb
		 

	}

}
