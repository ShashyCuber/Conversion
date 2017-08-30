// Shashwat Sparsh P3
public class Conversion 
{
	
	public static void round(int num1, int num2)
	{
		double dividedNum = num1/num2;
		double adjustedNum;
		int roundedNum;
		
		//System.out.println(dividedNum);
		adjustedNum = dividedNum + .5;
		roundedNum = (int) adjustedNum;
		//System.out.println(roundedNum);
		
		System.out.println(num1 + "/" + num2 + " is " + dividedNum + " but rounds to " + roundedNum + "\n");
	}
	
	
	public static void convertInchesToFeetAndInches(int originalInch)
	{
		int inchesInFeet = 12;
		int newInch;
		int feet = originalInch / inchesInFeet; 
		//System.out.println(feet);		
		newInch = originalInch % inchesInFeet;
		//System.out.println(newInch);
		System.out.println(originalInch + "\"" + " is " + feet + "'" + newInch + "\"\n");
	}
	
	public static void calculateBMI( int heightInch, int weightLbs)
	{
		int foot = 12;
		int heightFeet;
		double inchConversion = .0254, lbsConversion = .45;
		
		double heightMeter = heightInch * inchConversion;
		double weightKg = weightLbs * lbsConversion;
		heightMeter *= heightMeter;
		
		heightFeet = heightInch / foot;
		heightInch = heightInch % 12;
		double bmi = weightKg / heightMeter;
		//System.out.println(heightFeet);
		//System.out.println(heightInch);
		System.out.println("The BMI for a person who is " + heightFeet + "'" + heightInch + "\" " + "and weighs " + weightLbs + " lbs is " + bmi + "\n");		
		
		
	}
	
	public static void area(int length, int width)
	{
		int feetToYard = 3;
		int areaFeet = length * width;
		
		int lengthYard = length / feetToYard;
		double widthYard = (double) width / feetToYard;
		double areaYard = lengthYard * widthYard;
		System.out.println("A " + width + "' " + length + "' room is " + areaFeet + "sq feet or " + areaYard + " square yards."); 
	}
	
	public static void main(String[] args)
	{
		round(2, 3); //use 2 and 3
		convertInchesToFeetAndInches(77); //use 77
		calculateBMI(63, 125); // use 63, 125
		area(12, 10); // use 12 and 10
	}
}
