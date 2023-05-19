package manager;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Operator op = new Operator(input);

		selectMenu(input, op);
	}

	public static void selectMenu(Scanner input,Operator op) {
		int num = 0;
		while (num != 5) {
			try{
			showMenu();
			num = input.nextInt();
			System.out.println();
			switch (num) {
			case 1:
				op.menu();
				break;
			case 2:
				op.add_menu();
				break;
			case 3:
				op.delet_menu();
				break;
			case 4:
				op.adress();
				break;
			default:
				continue;
			}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an Integer between 1 and 4.");
				System.out.println();
				if(input.hasNext())
				{
					input.next();
				}
				num = -1;
			}
		}

	}

	public static void showMenu() {
		System.out.println("1. Show menu");
		System.out.println("2. Add menu");
		System.out.println("3. Delet menu");
		System.out.println("4. Adress");
		System.out.println("5. Exit");
		System.out.print("select number 1-5 : ");
	}
}
