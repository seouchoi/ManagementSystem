package manager;

import java.util.Scanner;

public class DeliverlyManager_Repetition {

	public static void main(String[] args) {
		
		int num=0;
		Scanner input=new Scanner(System.in);
		Scanner slt=new Scanner(System.in);
		Scanner adrs=new Scanner(System.in);
	
		while(num!=5) {
		System.out.println("1. menu");
		System.out.println("2. add menu");
		System.out.println("3. delet menu");
		System.out.println("4. adress");
		System.out.println("5. exit");
		System.out.print("select number 1-5 : ");
		num =input.nextInt();
		
		
		switch(num)
		{
		case 1:
			
			System.out.println("1. chicken");
			System.out.println("2. pizza");
			System.out.println("3. buger");
			System.out.println("4. fried");
			System.out.println();
			break;
		case 2:{
			System.out.println();
			System.out.println("1. chicken");
			System.out.println("2. pizza");
			System.out.println("3. buger");
			System.out.println("4. fried");
			System.out.print("Select menu : ");
			int select = slt.nextInt();
			
			switch (select) 
			{
			case 1: 
				System.out.println("Select Chicken");
				break;
			case 2: 
				System.out.println("Select Pizza");
				break;
			case 3:
				System.out.println("Select Buger");
				break;
			case 4:
				System.out.println("Select Fried");
				break;
			}
			System.out.println();
			break;
		}
		case 3:
			System.out.println("Delet Menu");
			System.out.println();
			break;
		case 4:
			System.out.print("Write your Adress : ");
			String adress=adrs.nextLine();
			System.out.println("We will send the delivery "+adress);
			System.out.println();
			break;
		}
		}
	}

}
