package manager;

import java.util.Scanner;

public class Operator {
	Adress adress;
	Scanner input;
	Operator(Scanner input)
	{
		this.input=input;
	}
	static void menu()
	{
		System.out.println("1. Chicken");
		System.out.println("2. Pizza");
		System.out.println("3. HamBuger");
		System.out.println("4. Fried");
		System.out.println();
	}
	 void add_menu()

	{
		
		System.out.println();
		System.out.println("1. Chicken");
		System.out.println("2. Pizza");
		System.out.println("3. HamBuger");
		System.out.println("4. Fried");
		System.out.print("Select Menu : ");
		int select=input.nextInt();
		switch (select) 
		{
		case 1: 
			System.out.println("Selected Chicken");
			break;
		case 2: 
			System.out.println("Selected Pizza");
			break;
		case 3:
			System.out.println("Selected Buger");
			break;
		case 4:
			System.out.println("Selected Fried");
			break;
		}
		System.out.println();
	}
	 void delet_menu()
	{
		System.out.println("Delet Menu");
		System.err.println();
	}
	 void adress()
	{
		 System.out.println("1. Add Adress");
		 System.out.println("2. Delet Adress");
		 System.out.print("Choose Menu : ");
		 int choose=input.nextInt();
		switch(choose){
			case 1:{ adress=new Adress();
		System.out.print("Your District : ");
		adress.district=input.next();
		System.out.print("City : ");
		adress.city=input.next();
		System.out.print("Street Number : ");
		adress.streetNum=input.nextInt();
		System.out.print("Detail Adress : ");
		adress.detailAdress=input.next();
		adress.printInfo();
		System.out.println();
		break;
		}
			case 2:
				 System.out.print("Type StreetNum : ");
				 int streetNum=input.nextInt();
				 if(adress==null)
				 {
					 System.out.println("The adress has not been register.");
					 System.out.println();
					 return;
				 }
				 if(adress.streetNum==streetNum)
				 {
					 adress=null;
					 System.out.println("The adress is deleted.");
					 System.out.println();
				 }
				 break;
		}
	}
}
