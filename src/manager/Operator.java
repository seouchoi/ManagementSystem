package manager;

import java.util.ArrayList;
import java.util.Scanner;

import adress.Adress;
import adress.AdressInput;
import adress.America;
import adress.Korea;
import adress.Country;
import adress.Japan;

public class Operator {
	ArrayList<AdressInput> adresses = new ArrayList<AdressInput>();
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
		System.out.println();
		switch (choose) {
		case 1: {
			int country = 0;
			AdressInput adressInput;
			while (country != 1 && country != 2) {
				System.out.println("1.Korea");
				System.out.println("2.America");
				System.out.println("3.Japan");
				System.out.print("Select Country between 1,2 or 3 : ");
				country = input.nextInt();
				if (country == 1) {
					adressInput = new Korea(Country.Korea);
					adressInput.getAdressInput(input);
					adresses.add(adressInput);
					System.out.println("The adress is added.");
					System.out.println();
					break;
				} else if (country == 2) {
					adressInput = new America(Country.America);
					adressInput.getAdressInput(input);
					adresses.add(adressInput);
					System.out.println("The adress is added.");
					System.out.println();
					break;
				} else if (country == 3) {
					adressInput = new Japan(Country.Japan);
					adressInput.getAdressInput(input);
					adresses.add(adressInput);
					System.out.println("The adress is added.");
					System.out.println();
					break;
				}
				else {
					System.out.println("Select Country between 1,2 or 3 : ");
				}
			}
			break;
		}
		case 2:
			if (adresses.isEmpty()) {
				System.out.println("No data to edit");
				System.out.println();
				break;
			}
			for (int i = 0; i < adresses.size(); i++) {
				AdressInput adressInput = adresses.get(i);
				System.out.print("Registerd AdressId : ");
				for (int j = 0; j < adresses.size(); j++) {
					System.out.print(adresses.get(j).getAdressId() + " ");
				}
				System.out.println();
				System.out.print("Choose adressId : ");
				int adressId = input.nextInt();
				if (adresses.get(i).getAdressId() != adressId) {
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
						String district = input.next();
						adressInput.setDistrict(district);
						System.out.println("District Edit Complete.");
						System.out.println();
						break;
					case 2:
						System.out.print("City : ");
						String city = input.next();
						adressInput.setCity(city);
						System.out.println("City Edit Complete.");
						System.out.println();
						break;
					case 3:
						System.out.print("Street Number : ");
						int streetNum = input.nextInt();
						adressInput.setStreetNum(streetNum);
						System.out.println("Street Number Edit Complete.");
						System.out.println();
						break;
					case 4:
						System.out.print("Detail Adress : ");
						String detailAdress = input.next();
						adressInput.setDetailAdress(detailAdress);
						System.out.println("Detail Adress Edit Complete.");
						System.out.println();
						break;
					}
				}
				break;
			}
			break;

		case 3:
			System.out.print("Registerd AdressId : ");
			for (int j = 0; j < adresses.size(); j++) {
				System.out.print(adresses.get(j).getAdressId() + " ");
			}
			System.out.println();
			System.out.print("Type AdressId : ");
			int deleteAdressId = input.nextInt();
			int index = -1;
			for (int i = 0; i < adresses.size(); i++) {
				if (adresses.get(i).getAdressId() == deleteAdressId) {
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