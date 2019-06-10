package model;

public abstract class Company{

//Constants
public final static char AGRICULTURE = 'A';
public static final char EXPLOITATION = 'B';
public static final char INDUSTRY = 'C';
public static final char ELECTRICITY = 'D';
public static final char CONSTRUCTION = 'E';
public static final char COMERCY  = 'F';
public static final char TRANSPORTATION = 'G';
public static final char FINANCIAL_STATEMENTS = 'H';
public static final char SOCIETY = 'I';

//Atributes
private String nameComercy;
private int amountEmployeer;
private double amountActives;
private String inscription;
private String nit;
private String address;
private String phone;
private char typeOrganization;
private String legalName;

//Relations
private Building build;

/**
* Description This constructor let to initializaze the variables
* @param nameComercy String the name of the comercy
* @param amountEmployeer int the amount of employeers
* @param amountActives String the amount of actives
* @param inscription String the date of inscription
* @param nit String the nit of the company
* @param address String the address of the company
* @param phone String the phone of contact
* @param typeOrganization char the type of organization
* @param legalName String the legal name
* @param build Building  the build
*/
public Company(String nameComercy, int amountEmployeer, double amountActives, String inscription, String nit, String address,String phone, char typeOrganization, String legalName,Building build){
  this.nameComercy = nameComercy;
  this.amountEmployeer = amountEmployeer;
  this.amountActives = amountActives;
  this.inscription = inscription;
  this.nit = nit;
  this.address = address;
  this.phone = phone;
  this.typeOrganization = typeOrganization;
  this.legalName = legalName;
  this.build = build;
}

/** Description: This method gets the name of the company
*@return String name of the company
*/
public String getNameComercy(){
  return nameComercy;
}

/** Description: This method set the name of comercy
*@param nameComercy String name of comercy
*/
public void setNameComercy(String nameComercy){
  this.nameComercy = nameComercy;
}

/** Description: This method gets the amount of employeers
*@return int amount of employeers
*/
public int getAmountEmployeer(){
  return amountEmployeer;
}

/** Description: This method set the amount of employeer
*@param amountEmployeer int amount of employeer
*/
public void setAmountEmployeer(int amountEmployeer){
  this.amountEmployeer = amountEmployeer;
}

/** Description: This method gets the amount of actives
*@return double amount of actives
*/
public double getAmountActives(){
  return amountActives;
}

/**Description: This method set the amount of actives
*@param amountActives double amount of actives
*/
public void setAmountActives(double amountActives){
  this.amountActives = amountActives;
}

/** Description: This method gets the inscription
*@return String inscription
*/
public String getInscription(){
  return inscription;
}

/** Description: This method set the inscription
*@param inscription inscription
*/
public void setInscription(String inscription){
  this.inscription = inscription;
}

/** Description: This method gets the nit
*@return String nit
*/
public String getNit(){
  return nit;
}

/** Description: This method set the nit
*@param nit String nit
*/
public void setNit(String nit){
  this.nit = nit;
}

/** Description: This method gets the address
*@return String address
*/
public String getAddress(){
  return address;
}

/**Description: This method set the address
*@param address String address
*/
public void setAddress(String address){
  this.address = address;
}

/** Description: This method gets the phone
*@return String phone
*/
public String getPhone(){
  return phone;
}

/** Description: This method set the phone
*@param phone String phone
*/
public void setPhone(String phone){
  this.phone = phone;
}

/**Description: This method gets the type of organization
*@return char type of organization
*/
public char getTypeOrganization(){
  return typeOrganization;
}

/**Description: This method set the type of organization
*@param typeOrganization char type of organization
*/
public void setTypeOrganization(char typeOrganization){
  this.typeOrganization = typeOrganization;
}

/** Description: This method gets the legal name
*@return String legal name
*/
public String getLegalName(){
  return legalName;
}

/**Description: This method set the legal name
*@param legalName String legal name
*/
public void setLegalName(String legalName){
  this.legalName = legalName;
}

/** Description: This method gets the builds
*@return Building builds
*/
public Building getBuild(){
  return build;
}

/** Description: This method set the builds
*@param build Building the build
*/
public void setBuild(Building build){
  this.build = build;
}
}