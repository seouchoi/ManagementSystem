package adress;

import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

import exception.DetailAdressFormatException;

public abstract class Adress implements AdressInput,Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2435977407586555442L;
	protected Country country = Country.Korea;
	protected int adressId;
	protected String district;
	protected String city;
	protected int streetNum;
	protected String detailAdress;

	public Adress() {
	}

	public Adress(Country country) {
		this.country = country;
	}

	public Adress(Country country, int adressId, String district, String city, int streetNum, String detailAdress) {
		this.country = country;
		this.adressId = adressId;
		this.district = district;
		this.city = city;
		this.streetNum = streetNum;
		this.detailAdress = detailAdress;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public int getAdressId() {
		return adressId;
	}

	public void setAdressId(int adressId) {
		this.adressId = adressId;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getStreetNum() {
		return streetNum;
	}

	public void setStreetNum(int streetNum) {
		this.streetNum = streetNum;
	}

	public String getDetailAdress() {
		return detailAdress;
	}

	public void setDetailAdress(String detailAdress) throws DetailAdressFormatException {
		if (!detailAdress.contains("-")) {
			throw new DetailAdressFormatException();
		}
		this.detailAdress = detailAdress;
	}

	public abstract void printInfo();

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

		System.out.print("Street Number : ");
		int streetNum = input.nextInt();
		this.setStreetNum(streetNum);

		System.out.print("Detail Adress : ");
		String detailAdress = input.next();
		try {
			this.setDetailAdress(detailAdress);
		} catch (DetailAdressFormatException e) {
			System.out.println("Incorrect Detail Adress Format. Put the '-' in Detail Adress.");
		}
	}

	public void setAdressDistrict(Scanner input) {
		System.out.print("District : ");
		String district = input.next();
		this.setDistrict(district);
	}

	public void setAdressCity(Scanner input) {
		System.out.print("City : ");
		String city = input.next();
		this.setCity(city);
	}

	public void setAdressStreetNum(Scanner input) {
		System.out.print("Street Number : ");
		int streetNum = input.nextInt();
		this.setStreetNum(streetNum);
	}

	public void setAdressDetail(Scanner input) {
		String detailAdress = "";
		while (!detailAdress.contains("-") || detailAdress.equals("")) {
			System.out.print("Detail Adress : ");
			detailAdress = input.next();
			try {
				this.setDetailAdress(detailAdress);
			} catch (DetailAdressFormatException e) {
				System.out.println("Incorrect Detail Adress Format. Put the '-' in Detail Adress.");
			}
		}
	}

	public void setStreetNumwithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you have a Street Number? (Y/N): ");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				setAdressStreetNum(input);
				break;
			} else if (answer == 'n' || answer == 'N') {
				this.setStreetNum(0);
			} else {
			}

		}
	}

	public void setDetailAdresswithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you have a Detail Adress? (Y/N): ");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				setAdressDetail(input);
				break;
			} else if (answer == 'n' || answer == 'N') {
				try {
					this.setDetailAdress(null);
				} catch (DetailAdressFormatException e) {
					System.out.println("Incorrect Detail Adress Format. Put the '-' in Detail Adress.");
				}
			} else {
			}
		}

	}
}
