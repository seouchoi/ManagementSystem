package adress;

import java.util.Scanner;

import exception.DetailAdressFormatException;

public interface AdressInput {
	public void getAdressInput(Scanner input);
	
	public int getAdressId();
	
	public void setCountry(Country country);
	
	public void setAdressId(int adressId);
	
	public void setDistrict(String district);
	
	public void setCity(String city);
	
	public void setStreetNum(int streetNum);
	
	public void setDetailAdress(String detailAdress) throws DetailAdressFormatException;
	
	public void printInfo();
	
	public void setAdressDistrict(Scanner input);
	
	public void setAdressCity(Scanner input);
	
	public void setAdressStreetNum(Scanner input);
	
	public void setAdressDetail(Scanner input);
}
