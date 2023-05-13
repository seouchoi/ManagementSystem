package adress;

import java.util.Scanner;

public abstract class Adress implements AdressInput {
	protected Country country=Country.Korea;
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
	public Adress(Country country,int adressId,String district,String city,int streetNum, String detailAdress)
	{
		this.country = country;
		this.adressId=adressId;
		this.district=district;
		this.city=city;
		this.streetNum=streetNum;
		this.detailAdress=detailAdress;
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
	public void setDetailAdress(String detailAdress) {
		this.detailAdress = detailAdress;
	}


	public abstract void printInfo();
	
	
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
}
