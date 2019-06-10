package model;

public class Education extends Service implements Taxes{

//Constant
public static final String HIGH_SCHOOL = "Bachillerato" ;
public static final String UNIVERSITY = "Universidad" ;

//Atributes
private String numberRegistrationMEN;
private int numberYearsAcreditation;
private int nationalPositionSaber11;
private int nationalPositionSaberPro;
private String rectorName;
private String educativeSector;
private int amountStudentsStratum1and2;
private int totalAmountActivesStudent;

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
* @param numberRegistrationMEN String number of registration of the MEN
* @param numberYearsAcreditation int number of years acreditaded
* @param nationalPositionSaber11 int position in saber11
* @param nationalPositionSaberPro int position in saberPro
* @param rectorName String principal name
* @param educativeSector String educative sector
* @param amountStudentsStratum1and2 int total of students of low stratums
* @param totalAmountActivesStudent int amount of active students
*/
public Education(String nameComercy, int amountEmployeer, double amountActives, String inscription, String nit, String address,String phone, char typeOrganization, String legalName,Building build, String numberRegistrationMEN,int numberYearsAcreditation,int nationalPositionSaber11,int nationalPositionSaberPro,String rectorName,String educativeSector,int amountStudentsStratum1and2, int totalAmountActivesStudent){
super(nameComercy,amountEmployeer,amountActives,inscription,nit,address,phone,typeOrganization,legalName,build);
this.numberRegistrationMEN = numberRegistrationMEN;
this.numberYearsAcreditation = numberYearsAcreditation;
this.nationalPositionSaber11 = nationalPositionSaber11;
this.nationalPositionSaberPro = nationalPositionSaberPro;
this.rectorName = rectorName;
this.educativeSector = educativeSector;
this.amountStudentsStratum1and2 = amountStudentsStratum1and2;
this.totalAmountActivesStudent = totalAmountActivesStudent;
}

/**Description: This method get the number of registration of the MEN 
*@return String number of registration of the MEN
*/
public String getNumberRegistrationMEN(){
  return numberRegistrationMEN;
}

/**Description: This method get the number of registration of the MEN
*@param numberRegistrationMEN String number of registration of the MEN
*/
public void setNumberRegistrationMEN(String numberRegistrationMEN){
  this.numberRegistrationMEN = numberRegistrationMEN;
}

/**Description: This method get the number of years acreditaded
*@return int number of years acreditaded
*/
public int getNumberYearsAcreditation(){
  return numberYearsAcreditation;
}

/**Description: This method get the number of years acreditaded
* @param numberYearsAcreditation int number of years acreditaded
*/
public void setNumberYearsAcreditation(int numberYearsAcreditation){
  this.numberYearsAcreditation = numberYearsAcreditation;
}

/**Description: This method get the position in saber11
*@return int position in saber11
*/
public int getNationalPositionSaber11(){
  return nationalPositionSaber11;
}

/**Description: This method get the position in saber11
*@param nationalPositionSaber11 int position in saber11
*/
public void setNationalPositionSaber11(int nationalPositionSaber11){
  this.nationalPositionSaber11 = nationalPositionSaber11;
}

/**Description: This method get the position in saberPro
*@return int position in saberPro
*/
public int getNationalPositionSaberPro(){
  return nationalPositionSaberPro;
}

/**Description: This method get the position in saberPro
* @param nationalPositionSaberPro int position in saberPro
*/
public void setNationalPositionSaberPro(int nationalPositionSaberPro){
  this.nationalPositionSaberPro = nationalPositionSaberPro;
}

/**Description: This method get the principal name
*@return String principal name
*/
public String getRectorName(){
  return rectorName;
}

/**Description: This method get the principal name
* @param rectorName String principal name
*/
public void setRectorName(String rectorName){
  this.rectorName = rectorName;
}

/**Description: This method get the educative sector
*@return String educative sector
*/
public String getEducativeSector(){
  return educativeSector;
}

/**Description: This method get the educative sector
* @param educativeSector String educative sector
*/
public void setEducativeSector(String educativeSector){
  this.educativeSector = educativeSector;
}

/**Description: This method get the total of students of low stratums
*@return int total of students of low stratums
*/
public int getAmountStudentsStratum1and2(){
  return amountStudentsStratum1and2;
}

/**Description: This method get the total of students of low stratums
* @param amountStudentsStratum1and2 int total of students of low stratums
*/
public void setAmountStudentsStratum1and2(int amountStudentsStratum1and2){
  this.amountStudentsStratum1and2 = amountStudentsStratum1and2;
}

/**Description: This method get the amount of active students
*@return int amount of active students
*/
public int getTotalAmountActivesStudent(){
  return totalAmountActivesStudent;
}

/**Description: This method get the amount of active students
* @param totalAmountActivesStudent int  amount of active students
*/
public void setTotalAmountActivesStudent(int totalAmountActivesStudent){
  this.totalAmountActivesStudent = totalAmountActivesStudent;
}

/** Description: This method get the information of the company
*@return String information of the company
*/
public String toString(){
String message = "";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + super.toString() + "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + "Numero MEN:" + numberRegistrationMEN + "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + "Años acreditado:" + numberYearsAcreditation + "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + "Posicion Saber11:" + nationalPositionSaber11 + "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + "Posicion SaberPro:" + nationalPositionSaberPro + "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + "Rector:" +rectorName + "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + "Sector educativo:" + educativeSector + "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + "Estudiantes de estratos bajos:" + amountStudentsStratum1and2 + "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + "Total estudiantes:" +totalAmountActivesStudent + "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + "Procultura:" + calculatedProCulture() + "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
return message;
}


/**Description: This method calculate the pro culture tax
*@return double pro culture tax
*/
public double calculatedProCulture(){
double porcentaje = 0.0;
porcentaje += 20 - ( amountStudentsStratum1and2/100);
if(porcentaje < 0){
porcentaje = 0.0;
}
return porcentaje;
}

}