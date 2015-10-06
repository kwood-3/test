package com.krw;

public class SayHello 
{
	//I am making a change to this to see if I can push this from Eclipse
	//up to github.

	public static void main(String[] args) throws InterruptedException 
	{
		boolean check = true;
		int count = 1;
		while (check)
		{
			// TODO Auto-generated method stub
			System.out.println("Hello world " + count);
			
			Thread.sleep(1000);
			count++;
			//if (count==11) check = false;
		}
		System.out.println ("Goodbye you cruel world");
		
		//I am adding another comment to see if I can go stright to GitHub
		
	}

}