package Stuff.models;

public class Factory {
    private String factoryName;
    private int edrpouCode;
    private int receptionPhone;
    private String city;
    private String street;
    private String buidingNumber;
    
	// DEFAULT CONSTRUCTOR:
    public Factory() {}            	
    // TWO PARAMS CONSTRUCTOR (edrpouCode, factoryName):
    public Factory(int edrpouCode, String factoryName) {
    this.edrpouCode = edrpouCode;
    this.factoryName = factoryName;
    }				
    // THREE PARAMS CONSTRUCTOR (ADDING THE ADDRESS & PHONE):
    public Factory(String city, String street, String buidingNumber) {
    this.city = city;
    this.street = street;
    this.buidingNumber = buidingNumber;
    }
    
}
