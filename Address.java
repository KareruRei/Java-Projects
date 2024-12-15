public class Address extends Warehouse{
	private String addressLine1;
	private	String addressLine2;
	private	String city;
	private String state;
	private int postalCode;
	private String country;

	void setAddressLine1(String myAddressLine1){addressLine1 = myAddressLine1;}
	void setAddressLine2(String myAddressLine2){addressLine2 = myAddressLine2;}
	void setCity(String myCity){city = myCity;}
	void setState(String myState){state = myState;}
	void setPostalCode(int myPostalCode){postalCode = myPostalCode;}
	void setCountry(String myCountry){country = myCountry;}

    	String getAddressLine1(){return addressLine1;}
    	String getAddressLine2(){return addressLine2;}
    	String getCity(){return city;}
    	String getState(){return state;}
    	int getPostalCode(){return postalCode;}
    	String getCountry(){return country;}
}