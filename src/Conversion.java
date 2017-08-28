
public class Conversion 
{
	
	public static void round()
	{
		double num1 = 2, num2 = 3;
		double dividedNum = num1/num2;
		double adjustedNum;
		int roundedNum;
		
		//System.out.println(dividedNum);
		adjustedNum = dividedNum + .5;
		roundedNum = (int) adjustedNum;
		//System.out.println(roundedNum);
		
		System.out.println(num1 + "/" + num2 + " is " + dividedNum + " but rounds to " + roundedNum + "\n");
	}
	
	
	public static void convertInchesToFeetAndInches()
	{
		int originalInch = 77;
		int inchesInFeet = 12;
		int newInch;
		int feet = originalInch / inchesInFeet; 
		//System.out.println(feet);		
		newInch = originalInch % inchesInFeet;
		//System.out.println(newInch);
		System.out.println(originalInch + "\"" + " is " + feet + "'" + newInch + "\"\n");
	}
	
	public static void calculateBMI()
	{
		int heightInch = 63, weightLbs = 125;
		
		double inchConversion = .0254, lbsConversion = .45;
		
		double heightMeter = heightInch * inchConversion;
		double weightKg = weightLbs * lbsConversion;
		heightMeter *= heightMeter;
		double bmi = weightKg / heightMeter;
		System.out.println("The BMI for a person who is " + heightInch + "\" " + "and weighs" + weightLbs + " lbs is " + bmi);		
		
		
	}
	
	
	public static void main(String[] args)
	{
		round();
		convertInchesToFeetAndInches();
		calculateBMI();
	}
}
