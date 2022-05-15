package week1.day1;

public class Car
{
	
	public void applyBreak()
	{
		System.out.println("Apply brakes when speed breaker in the road");
	}
	
	public void applyGear()
	{
		System.out.println("Reduce the gear in traffic and drive the car slowly");
	}

	public void switchonAc()
	{
		System.out.println("Switch on the Ac while riding the car");
	}
	public void applyAcclerate()
	{
		System.out.println("Apply the accelarate slowly after changing the gear level from Neutral to 1st Gear");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Car c=new Car();
		c.applyBreak();
		c.applyGear();
		c.switchonAc();
		c.applyAcclerate();

	}

}
