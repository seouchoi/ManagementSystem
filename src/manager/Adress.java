package manager;

public class Adress {
	int adressId;
	String district;
	String city;
	int streetNum;
	String detailAdress;
	
	void Adress() {
	}
	void Adress(int adressId,String district,String city,int streetNum, String detailAdress)
	{
		this.adressId=adressId;
		this.district=district;
		this.city=city;
		this.streetNum=streetNum;
		this.detailAdress=detailAdress;
	}
	
	void printInfo()
	{
		System.out.println("Adress Id: "+adressId+" District: "+district+", City :"+city+", StreetNum: "+streetNum+", DetailAress: "+detailAdress );
	}
}
