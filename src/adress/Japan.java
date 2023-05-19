package adress;

import java.util.Scanner;

public class Japan extends Adress {
	public Japan(Country country) {
		this.country = country;
	}
	public void getAdressInput(Scanner input) {
		System.out.print("Adress Id : ");
		int adressId = input.nextInt();
		this.setAdressId(adressId);
		setAdressDistrict(input);
		setAdressCity(input);
		setStreetNumwithYN(input);
		setDetailAdresswithYN(input);
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
