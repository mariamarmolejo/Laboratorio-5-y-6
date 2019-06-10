package model;

import java.util.ArrayList;

public class Service extends Company{

//Relation
private ArrayList<Poll> polls;

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
public Service(String nameComercy, int amountEmployeer, double amountActives, String inscription, String nit, String address,String phone, char typeOrganization, String legalName,Building build){
super(nameComercy,amountEmployeer,amountActives,inscription,nit,address,phone,typeOrganization,legalName,build);
polls = new ArrayList<Poll>();
}

/** Description: This method get the polls
*@return ArrayList arrayList of polls
*/
public ArrayList<Poll> getPolls(){
  return polls;
}

/** Description: This method set the polls
*@param polls ArrayList polls
*/
public void setPolls(ArrayList<Poll> polls){
  this.polls = polls;
}

/** Description: This method add polls
*@param client ArrayList polls
*/
public void addPolls(ArrayList<Poll> client){
  polls = client;
}

/** Description:The information of the polls
*@return String information of the polls
*/
public String getInformation(){
String message = "";
for(int i = 0 ; i < polls.size();i++){
message = message + polls.get(i).toString1();
}
return message;
}

/** Description: This method gets the general information
*@return String information
*/
public String toString(){
String message = "";
message = message + "----------------------------------------------------------------------------------------------------------------------------\n";
message = message + "Nombre de Compania:" + getNameComercy() + "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + "NIT:" + getNit() + "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + "Direccion:" + getAddress() + "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + "Telefono:" + getPhone() + "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + "Cantidad de empleados:" + getAmountEmployeer() + "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + "Cantidad de activos:" + getAmountActives() + "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + "Inscripcion" + getInscription()+ "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + "Tipo de organizacion:" + getTypeOrganization()+ "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + "Nombre Legal:" + getLegalName()+ "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + "Promedio de encuestas:" + promediateFinal()+ "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + "Promedio de encuestas de 50:" + promediateFinal1() + "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
for(int k = 0; k < polls.size();k++){
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + polls.get(k).toString1();
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
}
return message;
}

/** Description: The prom general
*@return int service
*/
public int promediateOfThis(){
int service = 0;
for(int i = 0; i < polls.size();i++){
  service += polls.get(i).getServiceDoIt();
}
return service;
}

/** Description: Prom general
*@return int answer time
*/
public int promediateOfAnswerTime(){
int answer = 0;
for(int i = 0; i < polls.size();i++){
  answer += polls.get(i).getAnswerTime();
}
return answer;
}

/** Description: Prom general
*@return int relation cost and benefit
*/
public int promediateOfCostBenefit(){
int relation = 0;
for(int i = 0; i < polls.size();i++){
  relation += polls.get(i).getRelationCostXBenefit();
}
return relation;
}

/** Description: the prom/10
*@return int prom
*/
public int promediateFinal(){
  int finalPolls = 0;
  finalPolls = (promediateOfThis() + promediateOfAnswerTime() + promediateOfCostBenefit()) / 10;
  return finalPolls;
}

/** Description: the final prom /50
*@return int prom
*/
public int promediateFinal1(){
int finalPolls1 = 0;
finalPolls1 = (promediateOfThis() + promediateOfAnswerTime() + promediateOfCostBenefit()) / 50;
return finalPolls1;
}

}