package model;

public class Poll{

//Atributes
private int serviceDoIt;
private int answerTime;
private int relationCostXBenefit;

/**Description: This constructor initialize the variables
*@param serviceDoIt int the service do it
*@param answerTime int answer time
*@param relationCostXBenefit int cost of relation
*/
public Poll(int serviceDoIt,int answerTime,int relationCostXBenefit){
  this.serviceDoIt = serviceDoIt;
  this.answerTime = answerTime;
  this.relationCostXBenefit = relationCostXBenefit;
}

/**Description: This method get the service do it
*@return int the service do it
*/
public int getServiceDoIt(){
  return serviceDoIt;
}

/**Description: This method set the service do it
*@param serviceDoIt int service do it
*/
public void setServiceDoIt(int serviceDoIt){
  this.serviceDoIt = serviceDoIt;
}

/** Description: This method get the answer time
*@return int answer time
*/
public int getAnswerTime(){
  return answerTime;
}

/**Description: This method set the  answer time
*@param answerTime int answer time
*/
public void setAnswerTime(int answerTime){
  this.answerTime = answerTime;
}

/** Description: This method set the  relation cost x benefit 
*@return int the  relation cost x benefit
*/
public int getRelationCostXBenefit(){
  return relationCostXBenefit;
}

/**Description: This method set the  relation cost x benefit
*@param relationCostXBenefit int the  relation cost x benefit
*/
public void setRelationCostXBenefit(int relationCostXBenefit){
  this.relationCostXBenefit = relationCostXBenefit;
}

/** Description: This method get the information of the polls
*@return String information of the polls 
*/
public String toString1(){
String message = "";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + "SERVICIO:" + serviceDoIt + "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + "TIEMPO DE RESPUESTA:" + answerTime + "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + "RELACION COSTO X BENEFICIO:" + relationCostXBenefit + "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
return message;
}
}
