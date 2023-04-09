package manager;

import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num=0;
		Scanner input=new Scanner(System.in);
		Operator op=new Operator(input);
		while(num!=5) {
		System.out.println("1. Show menu");
		System.out.println("2. Add menu");
		System.out.println("3. Delet menu");
		System.out.println("4. Adress");
		System.out.println("5. Exit");
		System.out.print("select number 1-5 : ");
		num =input.nextInt();

		if(num==1)
		{
			op.menu();
		}
		else if(num==2)
		{
			op.add_menu();
		}
		else if(num==3)
		{
			op.delet_menu();
		}
		else if(num==4)
		{
			op.adress();
		}
	}

	}
}
