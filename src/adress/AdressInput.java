package adress;

import java.util.Scanner;

public interface AdressInput {
	public void getAdressInput(Scanner input);
	
	public int getAdressId();
	
	public void setCountry(Country country);
	
	public void setAdressId(int adressId);
	
	public void setDistrict(String district);
	
	public void setCity(String city);
	
	public void setStreetNum(int streetNum);
	
	public void setDetailAdress(String detailAdress);
	
	public void printInfo();
	
}
