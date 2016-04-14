// import scanner
import java.util.Scanner;
public class Bean_Machine_Group_Project {
	// declared public variables
	public static int binCount;
	public static int ballCount;
	
	// created custom method
	public static void topRun(){
		// created array for bins
		int[] binArray = new int[binCount];

		binArray = FillBinArray(binCount, ballCount, binArray);
		// for loops
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
	// code for test method
	public static void TestMethod(){
		System.out.println("This method will test the users input.");
		System.out.println("The user selected to have: "+ binCount  + " bins and " +  ballCount + " balls!");
	}

	public static void main(String[] args) {
		// created scanner
		Scanner input = new Scanner(System.in);
		// greet user
		System.out.println("Welcome to the Bean Machine Game.");
		System.out.println("You will pick the number of bins and balls.");
		System.out.println("Then, you will drop all the balls and see which bin it lands.\n");
		
		System.out.println("Enter the number of bins(more than 1): ");
		binCount = input.nextInt();

		System.out.println("Enter the number of balls: ");
		ballCount = input.nextInt();
		
		//call the test method:
		TestMethod();
		
		// call run method:
		topRun();
		
		System.out.println("Thank you for playing!");


	}

}

