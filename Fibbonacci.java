package week1.day1;

public class Fibbonacci 
{
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int firstnum=0;
		int secnum=1;
		int sum;
		System.out.println(firstnum);
		System.out.println(secnum);
		for (int i=3;i<=8;i++)
		{
			sum=firstnum+secnum;
			firstnum=secnum;
			secnum=sum;
			System.out.println(sum);
		}
	}

}
