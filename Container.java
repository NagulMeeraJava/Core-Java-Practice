package task2;

import java.util.Scanner;

public class Container 
{
	int capacity1=0,capacity2=0,capacity3=0;          // 3 variables are declared to calculate 3 containers capacity
	public void container1(int size1,int size2)
	{
		 capacity1=size1*size2;                       // calculating container1 capacity
		
	}
	public void container2(int size1,int size2)
	{
		 capacity2=size1*size2;                       // calculating container2 capacity 
	}
	public void container3(int size1, int size2)
	{
		capacity3=size1*size2;                         // calculating container3 capacity
	}
	public void containerTest()
	{
		Scanner s=new Scanner(System.in);
		// Dispaly containers capacity	
		System.out.println("1. Container 1 capacity is :"+ capacity1);         
		System.out.println("2. Container 2 capacity is :"+ capacity2);
		System.out.println("3. Container 3 capacity is :"+ capacity3);
		System.out.println("Choose container you want to fit");                  
		int a=s.nextInt();
		System.out.println("Choose container you want to hold");
		int b=s.nextInt();
		if((a==1)&&(b==2))
		{
			if(capacity1>capacity2)
			{
				capacity1=capacity2;
			System.out.println("container 2 successfully stored in container1");	
			}
			else
			{
	          throw new ArithmeticException("container2 can't fit into container1");
			}	
		}
		else if((a==1)&&(b==3))
		{
			if(capacity1>capacity3)
			{
				capacity1=capacity3;
				System.out.println("container 3 successfully stored in container1");				
			}
			else
			{
	          throw new ArithmeticException("container3 can't fit into container1");
			}	
		}
		else if((a==2)&&(b==1))
		{
			if(capacity2>capacity1)
			{
				capacity2=capacity1;
				System.out.println("container 1 successfully stored in container2");
			}
			else
			{
	          throw new ArithmeticException("container1 can't fit into container2");
			}	
		}
		else if((a==2)&&(b==3))
		{
			if(capacity2>capacity3)
			{
				capacity2=capacity3;
				System.out.println("container 3 successfully stored in container1");
			}
			else
			{
	          throw new ArithmeticException("container3 can't fit into container1");
			}	
		}
		else if((a==3)&&(b==1))
		{
			if(capacity3>capacity1)
			{
				capacity3=capacity1;
				System.out.println("container 1 successfully stored in container3");
			}
			else
			{
	          throw new ArithmeticException("container1 can't fit into container3");
			}	
		}
		else if((a==3)&&(b==2))
		{
			if(capacity3>capacity2)
			{
				capacity3=capacity2;
				System.out.println("container 2 successfully stored in container3");
			}
			else
			{
	          throw new ArithmeticException("container2 can't fit into container3");
			}	
		}
	}
	public static void main(String args[])
	{
		Container obj=new Container();
		obj.container1(2, 10);
		obj.container2(10, 20);
		obj.container3(10, 20);
		obj.containerTest();
		
	}

}
