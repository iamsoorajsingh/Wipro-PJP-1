/* Design a class that can be used by a health care professional to keep track of a patient’s vital statistics. The following are the details.
Name of the class - Patient
Member Variables - patientName(String),height(double),width(double)
Member Function - double computeBMI()
The above method should compute the BMI and return the result. The formula for computation of BMI  is weight (in kg) ÷ height*height(in metres).
Create an object of the Patient class and check the results. */

import java.io.*;
class Patient
{
	private String name;
	private double height;
	private double weight;
	
	public Patient(String name, double height, double weight)
	{
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public double BMI ()
	{
		return ( weight / ( height * height ) ) * 703;
	}
}

public class Assignment_3
{
	public static void main(String[] args)
	{
		Patient patient = new Patient("Sadakat Aman Khan", 177/2.54, 59*2.2);
		
		System.out.println(patient.BMI());

	}

}