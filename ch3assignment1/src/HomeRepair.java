// Guzzo 2/6 ch3 assignment 1
import java.util.Scanner;

public class HomeRepair { 
	public static void main(String[] args) {
		double materialCost;
		int workHours, travelHours;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the job name: ");
		String jobName = input.nextLine();
		
		System.out.print("Enter the cost of materials: $");
		materialCost = input.nextDouble();
		
		System.out.print("Enter the number of hours of work required: ");
		workHours = input.nextInt();
		
		System.out.print("Enter the number of hours of travel time: ");
		travelHours = input.nextInt();
			
		double price = calcEstimate(materialCost, workHours, travelHours);
		System.out.println("The estimated price for the job " + jobName + " is: $" + price);
		
		input.close();
		
	}

	public static double calcEstimate(double materialCost, int workHours, int travelHours) {
		double laborCost = calcLaborCost(workHours, travelHours);
		return materialCost + laborCost;
	}
	public static double calcLaborCost(int workHours, int travelHours) {
	final double workRate = 35.00;
	final double travelRate = 12.00;
	double laborCost = (workRate * workHours) + (travelRate * travelHours);
	return laborCost;
	}

}

