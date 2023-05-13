package adress;

import java.util.Scanner;

public class Japan extends Adress implements AdressInput{
	public Japan(Country country) {
		this.country = country;
	}
	public void getAdressInput(Scanner input) {
		System.out.print("Adress Id : ");
		int adressId = input.nextInt();
		this.setAdressId(adressId);

		System.out.print("Your District : ");
		String district = input.next();
		this.setDistrict(district);

		System.out.print("City : ");
		String city = input.next();
		this.setCity(city);

		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you have a Street Number? (Y/N): ");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("Street Number : ");
				int streetNum = input.nextInt();
				this.setStreetNum(streetNum);
				break;
			} else if (answer == 'n' || answer == 'N') {
				this.setStreetNum(0);
			} else {
			}
		}
		answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you have a Detail Adress? (Y/N): ");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("Detail Adress : ");
				String detailAdress = input.next();
				this.setDetailAdress(detailAdress);
				break;
			} else if (answer == 'n' || answer == 'N') {
				this.setDetailAdress(null);
			} else {
			}
		}

	}
	public void printInfo()
	{
		String ctry = "none";
		switch(this.country) {
		case Korea:
			ctry = "Korea";
			break;
		case America:
			ctry = "America";
			break;
		case Japan:
			ctry = "Japan";
			break;
		case China:
			ctry = "Chian";
			break;
		default:
		}
		System.out.println("Country: "+ ctry+", Adress Id: "+adressId+", District: "+district+", City :"+city+", StreetNum: "+streetNum+", DetailAress: "+detailAdress );	
	}
	
}
