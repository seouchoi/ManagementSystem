package adress;

import java.util.Scanner;

public class Korea extends Adress implements AdressInput{
	public Korea(Country country) {
		this.country = country;
	}
	
	public void getAdressInput(Scanner input) 
	{
		System.out.print("Adress Id : ");
		int adressId = input.nextInt();
		this.setAdressId(adressId);
		
		System.out.print("Your District : ");
		String district = input.next();
		this.setDistrict(district);
		
		System.out.print("City : ");
		String city = input.next();
		this.setCity(city);
		
		System.out.print("Street Number : ");
		int streetNum = input.nextInt();
		this.setStreetNum(streetNum);
		
		System.out.print("Detail Adress : ");
		String detailAdress = input.next();
		this.setDetailAdress(detailAdress);
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
