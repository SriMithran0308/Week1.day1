package week1.day1;

public class TwoWheeler 
{
	int noofwheels;
	short noOfMirrors;
	long chassisNumber;
	boolean isPunctured;
	String bikeName;
	double runningKM;
	public void vehicledata()
	{
		System.out.println("No of wheels in the bike\n"+noofwheels);
		System.out.println("No of Mirrors\n" +noOfMirrors);
		System.out.println("ChassisNumber\n" +chassisNumber);
		System.out.println("BikeName\n" +bikeName);
		System.out.println("RunningKM\n" +runningKM);
		}
	public void puncturedata()
	{
	if (isPunctured==true) 
	{	
		System.out.println("Tyre is punctured");
	}
	else
	{
		System.out.println("Tyre is not punctured");
	}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TwoWheeler t=new TwoWheeler();	
		t.noofwheels=2;
		t.noOfMirrors=2;
		t.chassisNumber=9894111493l;
		t.isPunctured=false;
		t.bikeName="Honda CB Shine";
		t.runningKM=89.00;
		t.vehicledata();
		t.puncturedata();
		}
}
