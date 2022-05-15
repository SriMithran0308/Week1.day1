package week1.day1;
public class Mobile 
{

	public void makecalls()
	{
		System.out.println("Incoming and outgoing calls are unlimited ");
	}
	
	public void sendmsg()
	{
		System.out.println("mobiles will send message soon at high speed");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Mobile mkcalls=new Mobile();
		Mobile smsg=new Mobile();
		mkcalls.makecalls();
		mkcalls.sendmsg();
}
}
