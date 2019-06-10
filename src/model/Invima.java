package model;

public class Invima extends Manufacturing implements Consuptiom{

//Constant
public static final char FABRICATION_EXPO = 'X';
public static final char FABRICATION_SELL = 'Y';
public static final char IMPORT_SELL = 'Z';
public static final String VALID = "Vigente";
public static final String NORENEWED = "No renovado";

//Atributes
private String sanitaryRegistration;
private String state;
private String expiration;
private char modality;

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
* @param sanitaryRegistration String sanitary registration
* @param state String state of the medicament
* @param expiration String expiration date
* @param modality char modality of the medicament
*/
public Invima(String nameComercy, int amountEmployeer, double amountActives, String inscription, String nit, String address,String phone, char typeOrganization, String legalName,Building build,String sanitaryRegistration, String state, String expiration, char modality){
super(nameComercy,amountEmployeer,amountActives,inscription,nit,address,phone,typeOrganization,legalName,build);
  this.sanitaryRegistration = sanitaryRegistration;
  this.state = state;
  this.expiration = expiration;
  this.modality = modality;
}

/** Description: This method get the sanitary registration
*@return String  sanitary registration
*/
public String getSanitaryRegistration(){
  return sanitaryRegistration;
}

/**Description: This method set the sanitary registration
* @param sanitaryRegistration String  sanitary registration
*/
public void setSanitaryRegistration(String sanitaryRegistration){
  this.sanitaryRegistration = sanitaryRegistration;
}

/** Description: This method get the state of the medicament
*@return String state of the medicament
*/
public String getState(){
  return state;
}

/**Description: This method set the state of the medicament
* @param state String state of the medicament
*/
public void setState(String state){
  this.state = state;
}

/** Description: This method get the expiration date
*@return String  expiration date
*/
public String getExpiration(){
  return expiration;
}

/**Description: This method set the expiration date
* @param expiration String expiration date
*/
public void setExpiration(String expiration){
  this.expiration = expiration;
}

/** Description: This method get the modality of the medicament
*@return char modality of the medicament
*/
public char getModality(){
return modality;
}

/**Description: This method set the modality of the medicament
* @param modality char modality of the medicament
*/
public void setModality(char modality){
  this.modality = modality;
}

/** Description: This method get the information of the company
*@return String la information of the company
*/
public String toString(){
String message = "";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + super.toString() + "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + "REGISTRO SANITARIO:" + sanitaryRegistration + "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + "ESTADO:" + state + "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + "EXPIRACION:" + expiration + "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + "MODALIDAD:" + modality + "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + "Arboles por sembrar:" + calculatedThingXThree() + "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
return message;
}

/** Description: This method get the amount of threes
*@return int amount of threes
*/
public int calculatedThingXThree(){
int amountThree = 0;
for(int i = 0; i < getProducts().size(); i++){
  Product m = getProducts().get(i);
  if(m.getWaterAmount() > 1 && m.getWaterAmount()  < 140){
    amountThree = 6;
  }else if(m.getWaterAmount()  >41&& m.getWaterAmount()  < 800){
      amountThree = 25;
    }else if(m.getWaterAmount() >800){
          amountThree = 200;
        }
      }
return amountThree;
}

}