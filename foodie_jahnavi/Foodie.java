import java.util.Scanner;
class Restaurant 

{   
	int booked_tables[]=new int[10];
	void availabletables()
	{
	
	}
   void bookedtables()
   {
	   int i;
	   int bsize=booked_tables.length;
	   for(i=0;i<booked_tables.length;i++)
		   System.out.println("booked tables are "+booked_tables[i]);
	   {
		   
	   }
	   
   }
	void allot_table()
	{   int i,j;
		int[] tables= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Select a table  ");
		Scanner s3=new Scanner(System.in);
		int sel_table=s3.nextInt();
		for(i=0;i<tables.length;i++)
		{
			if(tables[i]==sel_table)
			{
				
				booked_tables[i]=sel_table;
				
				for(j=i;j<tables.length-1;j++)
				{
					tables[j]=tables[j+1];
			}
			}
		}
	}
	void login() 
	{
		String id ="admin";
		String pwd="admin";
		System.out.println("enter the user id");
		Scanner s=new Scanner(System.in);
		String e_id=s.next();
	
		if(!e_id.equals(id)){
			System.out.println("Incorrect id");
		}else
		{
		System.out.println("enter the passsword");
		
		String e_pwd=s.next();
		if(!pwd.equals(e_pwd))
		{
			System.out.println("Incorrect password");
		}
		else
		{
			System.out.println("login successful");
		}
		s.close();
		s1.close();
	}
		
	}
	static public void main(String args[])
	{
		Restaurant r1=new Restaurant();
		r1.login();
		
		System.out.println("1.About us \n 2.Book a table \n 3.Order food \n ");
		System.out.println("enter your choice");
		Scanner choice=new Scanner(System.in);
		  int ch=Integer.parseInt(choice.nextLine());
		  
		    
		
			if(choice.hasNextInt())
			  ch=choice.nextInt();
			else{
				System.out.println(" not scanned");
			}
		   System.out.println(" "+ch);
		System.out.println("Entered choice is "+ch);
		switch(ch)
		{
		case 1: System.out.println("The resturant Where you can get\n great food with less price $ !!");
		case 2: System.out.println("Allot a table ");
		         r1.allot_table();
		         break;
		case 3: System.out.println("order");
		}
		r1.bookedtables();
		}
	 
		
	}