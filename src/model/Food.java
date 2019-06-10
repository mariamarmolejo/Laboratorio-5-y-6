package model;

public class Food extends Manufacturing{

//Constant
public static final String ROOM_TEMPERATURE = "Temperatura ambiente" ;
public static final String REFRIGERATION = "Refrigeracion";
public static final String FREEZER = "Congelacion" ;

//Atributes
private String importer;
private String maker;
private String conservation;

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
* @param importer String the importer
* @param maker String the maker
* @param conservation String conservation
*/
public Food(String nameComercy, int amountEmployeer, double amountActives, String inscription, String nit, String address,String phone, char typeOrganization, String legalName,Building build,String importer,String maker,String conservation){
super(nameComercy,amountEmployeer,amountActives,inscription,nit,address,phone,typeOrganization,legalName,build);
this.importer = importer;
this.maker = maker;
this.conservation = conservation;
}

/** Description: This method get the importer
*@return String the importer
*/
public String getImporter(){
  return importer;
}

/**Description: This method set the importer
* @param importer String the importer
*/
public void setImporter(String importer){
  this.importer = importer;
}

/** Description: This method get  the maker
*@return String the maker
*/
public String getMaker(){
  return maker;
}

/**Description:This method set  maker
* @param maker String  maker
*/
public void setMaker(String maker){
  this.maker = maker;
}

/** Description:This method set the conservation
*@return String the conservation
*/
public String getConservation(){
  return conservation;
}

/**Description:This method set the conservation
* @param conservation String the conservation
*/
public void setConservation(String conservation){
  this.conservation = conservation;
}

/** Description: This method get the information of the company of food
*@return String information of the company of food
*/
public String toString(){
String message = "";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + super.toString() + "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + "IMPORTADOR:" + importer + "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + "FABRICADOR:" + maker + "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + "CONSERVACION:" + conservation + "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
return message;
}

}