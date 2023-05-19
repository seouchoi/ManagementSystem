package adress;

import java.nio.charset.MalformedInputException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Korea extends Adress {
	public Korea(Country country) {
		this.country = country;
	}

	public void getAdressInput(Scanner input) {

		System.out.print("Adress Id : ");
		int adressId = input.nextInt();
		this.setAdressId(adressId);

		setAdressDistrict(input);

		setAdressCity(input);

		setAdressStreetNum(input);

		setAdressDetail(input);
	}

	public void printInfo() {
		String ctry = getCountryString();
		System.out.println("Country: " + ctry + ", Adress Id: " + adressId + ", District: " + district + ", City :"
				+ city + ", StreetNum: " + streetNum + ", DetailAress: " + detailAdress);
	}

	public String getCountryString() {
		String ctry = "none";
		switch (this.country) {
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
		return ctry;
	}

}
