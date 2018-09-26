package Stuff.models;

 public class People {
    private String surname;
    private String nameAnd2ndName; // so named "imya & ot4estvo" 
    private int innCode;
    private int homePhone;
    private String city;
    private String street;
    private String buidingNumber;
    private int appartment;
    private String factory;
    private int peopleQuantity;
//  private int workPhone; // Mr.Occam would be mind it
//  private enum Post {ENGENEER, DIRECTOR, SECRETARY, WORKER;}// Mr.Occam would be mind it

				// DEFAULT CONSTRUCTOR:
    public People () {
    	peopleQuantity++;
    }            	
    // THREE PARAMS CONSTRUCTOR (1st+2nd name, surname, inn-code):
    public People(String surname, String nameAnd2ndName, int innCode) {
    	this.surname = surname;
    	this.nameAnd2ndName = nameAnd2ndName;
    	this.innCode = innCode;
    	peopleQuantity++;
    }				
    // FIVE PARAMS CONSTRUCTOR, ADDING THE ADDRESS & PHONE:
    public People(String city, String street, String buidingNumber, int appartment, int homePhone) {
    	this.city = city;
    	this.street = street;
    	this.buidingNumber = buidingNumber;
    	this.appartment = appartment;
    	this.homePhone = homePhone;
    	peopleQuantity++;
    }
    public String getName(){
    	return (this.surname + " " + this.nameAnd2ndName);
    }
    public void setName(String surname, String nameAnd2ndName) {
    	this.surname = surname;
    	this.nameAnd2ndName = nameAnd2ndName;
    }
    public String toString(){
    	return ("Name = " + this.surname + this.nameAnd2ndName + ", address: " + this.city + ", " + this.street + ", " + this.buidingNumber + ", " + this.appartment + ", working at " + this.factory);
    }
 }
/*    private void changeRate(double newRate) { // Rate updating
    	this.rate = newRate; }
    через войдовые методы присваивать,
    через ретурны выдавать инфу,
toString - to output information about employee
In the method main() create 3 objects of Employee type. 
Input information about them. 
Display the total hours of all workers to screen
*/