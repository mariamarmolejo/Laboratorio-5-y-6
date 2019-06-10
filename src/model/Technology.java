package model;
import java.util.ArrayList;

public class Technology extends Service implements Consuptiom{

//Constant

public static final String CAPATITATION_CONSULT = "Consultoria capacitacion";
public static final String SOFTWARE_DEVELOPMENT = "Desarrollo de software a la medida";
public static final String INFRASTRUCTURE_SERVICE = "Infraestructura como servicio";
public static final String SOFTWARE_SERVICE = "Software como servicio";
public static final String PLATAFORM_SERVICE = "Plataforma como servicio";

//Atributes

private String service;
private int consuptiomKilowatts;

//Relations

private ArrayList<String> services;


/**Description: The constructor initialize the variables
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
* @param service String the service
* @param consuptiomKilowatts int consuptiom on kilowatts
*/
public Technology(String nameComercy, int amountEmployeer, double amountActives, String inscription, String nit, String address,String phone, char typeOrganization, String legalName,Building build,String service,int consuptiomKilowatts){
super(nameComercy,amountEmployeer,amountActives,inscription,nit,address,phone,typeOrganization,legalName,build);
	this.service = service;
	this.consuptiomKilowatts = consuptiomKilowatts;
	services = new ArrayList<String>();
	services.add(CAPATITATION_CONSULT);
	services.add(SOFTWARE_DEVELOPMENT);
	services.add(INFRASTRUCTURE_SERVICE);
	services.add(SOFTWARE_SERVICE);
	services.add(PLATAFORM_SERVICE);

}

/** Description: This method gets the service
*@return String the service
*/
public String getService(){
  return service;
}

/**Description: This method set the service
* @param service String the service
*/
public void setService(String service){
  this.service = service;
}

/** Description:This method gets the consuption on kilowatts
*@return int killowatts
*/
public int getConsuptiomKilowatts(){
	return consuptiomKilowatts;
}

/**Description: this method set the consuption on kilowatts
* @param consuptiomKilowatts int killowatts
*/
public void setConsuptiomKilowatts(int consuptiomKilowatts){
	this.consuptiomKilowatts = consuptiomKilowatts;
}

/** Description: This method gets the quantity of threes
*@return int amount of threes
*/
public int calculatedThingXThree(){
int amountThreeEnergy = 0;
  if(getConsuptiomKilowatts() > 1 && getConsuptiomKilowatts() < 1000){
    amountThreeEnergy = 8;
  }else if(getConsuptiomKilowatts() > 1001 && getConsuptiomKilowatts() < 3000){
      amountThreeEnergy = 35;
    }else if(getConsuptiomKilowatts() > 3000){
          amountThreeEnergy = 500;
        }
return amountThreeEnergy;
}

/** Description: This method obtains the information of the company
*@return String Information of the company
*/
public String toString(){
String message = "";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message +  super.toString();
message = message +  "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message +  "SERVICIO:" + service + "\n";
message = message +  "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message +  "ARBOLES:" + calculatedThingXThree() + "\n";
message = message +  "---------------------------------------------------------------------------------------------------------------------------- \n";
return message;
}
}
