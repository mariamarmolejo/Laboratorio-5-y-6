package model;

public class Public extends Service implements Taxes{

//Constants
public static final String SAWAGE_SYSTEM = "Alcantarillado" ;
public static final String ENERGY = "Energia" ;
public static final String AQUEDUCT ="Acueducto" ;

//Atributes
private String servicePublic;
private int suscriptorsTotally;
private int suscriptorsOneAndTwo;

/** Description This constructor let to initializaze the variables
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
* @param servicePublic String the public service
* @param suscriptorsTotally int total of suscriptors
* @param suscriptorsOneAndTwo int suscriptors one and two
*/
public Public(String nameComercy, int amountEmployeer, double amountActives, String inscription, String nit, String address,String phone, char typeOrganization, String legalName,Building build,String servicePublic,int suscriptorsTotally, int suscriptorsOneAndTwo){
super(nameComercy,amountEmployeer,amountActives,inscription,nit,address,phone,typeOrganization,legalName,build);
this.servicePublic = servicePublic;
this.suscriptorsTotally = suscriptorsTotally;
this.suscriptorsOneAndTwo = suscriptorsOneAndTwo;
}

/**Description: This method gets the public service
*@return String public service
*/
public String getServicePublic(){
  return servicePublic;
}

/**Description: This method set the public service
* @param servicePublic String public service
*/
public void setServicePublic(String servicePublic){
  this.servicePublic = servicePublic;
}

/**Description: This method gets the total subscriptors
*@return int total suscriptors
*/
public int getSuscriptorsTotally(){
  return suscriptorsTotally;
}

/**Description: This method set the total suscriptors
* @param suscriptorsTotally total suscriptors
*/
public void setSuscriptorsTotally(int suscriptorsTotally){
  this.suscriptorsTotally = suscriptorsTotally;
}

/**Description: This method get the suscriptors one and two
*@return int suscriptors one and two
*/
public int getSuscriptorsOneAndTwo(){
  return suscriptorsOneAndTwo;
}

/**Description: This method set the suscriptors one and two
* @param suscriptorsOneAndTwo int  suscriptors one and two
*/
public void setSuscriptorsOneAndTwo(int suscriptorsOneAndTwo){
  this.suscriptorsOneAndTwo = suscriptorsOneAndTwo;
}

/** Description:Este metodo obtiene la informacion de la coimpanhia publica
*@return String la informacion de la companhia
*/
public String toString(){
String message = "";
message = message +  "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message +  super.toString() + "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + "Servicio publico:" + servicePublic + "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + "Total suscriptores:" + suscriptorsTotally + "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + "Suscriptores uno y dos:" +suscriptorsOneAndTwo + "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + "Impuesto proCultura:" + calculatedProCulture() + "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
return message;
}

/**Description: This method calculated the proculture tax
*@return double proculture tax
*/
public double calculatedProCulture(){
double proCulture = 0.0;
proCulture += 40 - (suscriptorsTotally/100);
if(proCulture < 0){
proCulture = 0.0;
}
return proCulture;
}

}