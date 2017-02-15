//
import java.util.Scanner;
public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
//Defines variables as doubles
		double yearsToWork =0, annualReturnOnInvestment =0, yearsRetired =0, annualReturn =0, requiredIncome =0, ssi =0, monthly= 1, totalNeeded =0 ; 
// Asks how many years you want to work
	System.out.println("How many years do you plan to work?: ");
	yearsToWork = input.nextDouble();
	
// Expected average annual return on investment
	System.out.println("What's the expected average annual return (from 0 -20: " );
	annualReturnOnInvestment = input.nextDouble();

// How long do you want to draw 
	System.out.println("How long do you want to draw? (years retired): ");
	yearsRetired = input.nextDouble();

// Annual Return on payback 
	System.out.println("What is your expected annual return on payback(during retirement) ?: ");
	annualReturn = input.nextDouble();

// Required Income
	System.out.println("What is yur required income?: ");
	requiredIncome = input.nextDouble();
	
// Expected monthly SSI income
	System.out.println("What is your expected monthly SSI Income?: ");
	ssi= input.nextDouble();
		
	
// What you need saved
	totalNeeded = (requiredIncome-ssi)*((1-(1/(Math.pow(1+(annualReturn/100)/12,yearsRetired*12)))))/((annualReturn/100)/12);
	
// Formula to save each month
	monthly = totalNeeded*(((annualReturnOnInvestment/100)/12)/((Math.pow(1+(annualReturnOnInvestment/100)/12, yearsToWork*12))-1));
	

// Tell the user how much they need to save each month
	System.out.format("\n You need to save: $%.2f a month \n for a total of $%.2f saved. \n", monthly , totalNeeded);

	input.close();
	}

}
