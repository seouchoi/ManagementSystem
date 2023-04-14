package manager;

import java.util.ArrayList;
import java.util.Scanner;

public class Operator {
	ArrayList<Adress> adresses = new ArrayList<Adress>();
	Scanner input;

	Operator(Scanner input) {
		this.input = input;
	}

	static void menu() {
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
		int select = input.nextInt();
		switch (select) {
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

	void delet_menu() {
		System.out.println("Delet Menu");
		System.err.println();
	}

	void adress() {
		System.out.println("1. Add Adress");
		System.out.println("2. Edit Adress");
		System.out.println("3. Delet Adress");
		System.out.println("4. View Adress");
		System.out.print("Choose Menu : ");
		int choose = input.nextInt();
		switch (choose) {
		case 1: {
			Adress adress = new Adress();
			System.out.print("Adress Id : ");
			adress.adressId = input.nextInt();
			System.out.print("Your District : ");
			adress.district = input.next();
			System.out.print("City : ");
			adress.city = input.next();
			System.out.print("Street Number : ");
			adress.streetNum = input.nextInt();
			System.out.print("Detail Adress : ");
			adress.detailAdress = input.next();
			adresses.add(adress);

			break;
		}
		case 2:
			
		case 3:
			System.out.print("Type AdressId : ");
			int adressId = input.nextInt();
			int index = -1;
			for (int i = 0; i < adresses.size(); i++) {
				if (adresses.get(i).adressId == adressId) {
					index = i;
					break;
				}
			}
			if (index >= 0) {
				adresses.remove(index);
				System.out.println("The AdressId " + adressId + " is deleted.");
				System.out.println();
			} else {
				System.out.println("The adress has not register.");
				System.out.println();
				return;
			}
			break;
		case 4:
			for (int i = 0; i < adresses.size(); i++) {				
					adresses.get(i).printInfo();											
			}

		}
	}
}
