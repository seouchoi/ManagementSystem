package manager;

public class Adress {
	String district;
	String city;
	int streetNum;
	String detailAdress;
	
	void Adress() {
	}
	void Adress(String district,String city,int streetNum, String detailAdress)
	{
		this.district=district;
		this.city=city;
		this.streetNum=streetNum;
		this.detailAdress=detailAdress;
	}
	
	void printInfo()
	{
		System.out.println("District: "+district+", City :"+city+", StreetNum: "+streetNum+", DetailAress: "+detailAdress );
	}
}
