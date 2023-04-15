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
			System.out.println("The adress is added.");
			System.out.println();
			adresses.add(adress);

			break;
		}
		case 2:
			if (adresses.isEmpty()) {
				System.out.println("No data to edit");
				System.out.println();
				break;
			}
			for (int i = 0; i < adresses.size(); i++) {
				Adress adress = adresses.get(i);
				System.out.print("Registerd AdressId : ");
				for (int j = 0; j < adresses.size(); j++) {
					System.out.print(adresses.get(j).adressId + " ");
				}
				System.out.println();
				System.out.print("Choose adressId : ");
				int adressId = input.nextInt();
				if (adresses.get(i).adressId != adressId) {
					System.out.println("The adress is not exist");
					System.out.println();
					break;
				} else {
					int pick;
					System.out.println();
					System.out.println("**Adress Edit Menu**");
					System.out.println("1. Edit District");
					System.out.println("2. Edit City");
					System.out.println("3. Edit Street Number");
					System.out.println("4. Edit Detail Adress");
					System.out.println("5. Exit");
					System.out.print("Select Menu : ");
					pick = input.nextInt();
					switch (pick) {
					case 1:
						System.out.print("District : ");
						adress.district = input.next();
						System.out.println("District Edit Complete.");
						System.out.println();
						break;
					case 2:
						System.out.print("City : ");
						adress.city = input.next();
						System.out.println("City Edit Complete.");
						System.out.println();
						break;
					case 3:
						System.out.print("Street Number : ");
						adress.streetNum = input.nextInt();
						System.out.println("Street Number Edit Complete.");
						System.out.println();
						break;
					case 4:
						System.out.print("Detail Adress : ");
						adress.detailAdress = input.next();
						System.out.println("Detail Adress Edit Complete.");
						System.out.println();
						break;
					}
				}
				break;
			}
			break;

		case 3:
			System.out.print("Type AdressId : ");
			int deleteAdressId = input.nextInt();
			int index = -1;
			for (int i = 0; i < adresses.size(); i++) {
				if (adresses.get(i).adressId == deleteAdressId) {
					index = i;
					break;
				}
			}
			if (index >= 0) {
				adresses.remove(index);
				System.out.println("The AdressId " + deleteAdressId + " is deleted.");
				System.out.println();
			} else {
				System.out.println("The adress has not register.");
				System.out.println();
				return;
			}
			break;
		case 4:
			if (adresses.isEmpty()) {
				System.out.println("The adress list is empty.");
				System.out.println();
			} else {
				for (int i = 0; i < adresses.size(); i++) {
					adresses.get(i).printInfo();
				}
				System.out.println();
			}
		}
	}
}