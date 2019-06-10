package model;
import java.util.ArrayList;

public class Holding{

//Relations
private ArrayList<Company> companies;
private Building buildings;

/** Description: Constructor  let to initializaze the variables
*@param buildings Building the building
*/
public Holding(Building buildings){
this.buildings = buildings;
companies = new ArrayList<Company>();
}

/**
*Description: this method get the building
*@return Building buildings
*/
public Building getBuilding(){
  return buildings;
}

/**Description: this method set the building
*@param buildings Building buildings
*/
public void setBuilding(Building buildings){
  this.buildings = buildings;
}

/** Description: This method add a company
*@param comp Company add the company
*/
public void addCompany(Company comp){
  companies.add(comp);
}

/** Description: This method show information of the companies
*@return String information of the companies
*/
public String showInformation(){
String message = "";
for(int i = 0; i < companies.size(); i++){
message = message+companies.get(i).toString();
}
return message;
}

/** Description:This method get the name of the companies
*@return String the name
*/
public String getCompaniesNames(){
  String message = "";
	for(int i = 0; i < companies.size();i++){
    	if(companies.get(i) instanceof Service){
        message = message+companies.get(i).getNameComercy();
      }
  }
return message;
}

/** Description: this method get the information of the company with products
*@param name String name of the company with products
*@return String information of the company with products
*/
public String getCompanyWithProductsInformation(String name){
String message = "";
for(int i = 0; i < companies.size();i++){
if(companies.get(i) instanceof Manufacturing){
  if(companies.get(i).getNameComercy().equals(name)){
message = message + ((Manufacturing)companies.get(i)).getInformation();
}
}
}
return message;
}

/** Description: This method add products to specific company
*@param comp Company the company
*@param products ArrayList the products
*/
public void addCompanyProducts(Company comp ,ArrayList<Product> products){
  companies.add(comp);
  ((Manufacturing) comp).addProduct(products);
}

/** Description: this method gets the product of the company
*@param name String the name of the company
*@return ArrayList the array of the products
*/
public ArrayList<Product> getProductOfCompany(String name){
ArrayList<Product> arr = null;
  for(int i = 0; i < companies.size();i++){
if(companies.get(i) instanceof Manufacturing){
  if(companies.get(i).getNameComercy().equals(name)){
    arr =  ((Manufacturing)companies.get(i)).getProducts();
}
  }
}
return arr;
}

/** Description: Ethis method get the information of the company with polls
*@param nameL String name of the company with polls
*@return String information of the company with polls
*/
public String getCompanyWithPollsInformation(String nameL){
String message = "";
for(int i = 0; i < companies.size();i++){
if(companies.get(i) instanceof Service){
  if(companies.get(i).getNameComercy().equals(nameL)){
    message = message + ((Service) companies.get(i)).getInformation();
  }
}
}
return message;
}

/** Description: This method add polls to the companies
*@param comp Company the company
*@param polls the polls
*/
public void addCompanyWithPolls(Company comp, ArrayList<Poll> polls){
companies.add(comp);
((Service)comp).addPolls(polls);
}

/** Description: this method gets the poll
*@param nameL String the name of the company
*@return ArrayList the array of polls
*/
public ArrayList<Poll> getPollsOfCompany(String nameL){
ArrayList<Poll> arrg = null;
for(int i = 0; i < companies.size();i++){
if(companies.get(i) instanceof Service){
  if(companies.get(i).getNameComercy().equals(nameL)){
    arrg = ((Service)companies.get(i)).getPolls();
  }
}
}
return arrg;
}

/** Description: This method add an employ to a cubicule
*@param nameCompany String name of the company
*@param nameEmploy String name of the employ
*@param positionEmploy String position of the employ
*@param emailEmploy String email of the employ
*/
public void addEmployeerToCubicules(String nameCompany,String nameEmploy,String positionEmploy,String emailEmploy){
for(int i = 0; i < companies.size();i++){
  if(nameCompany.equals(companies.get(i).getNameComercy())){
    if(companies.get(i).getBuild().getEmployeer() !=null){
      companies.get(i).getBuild().assingTheEmployInCubicule(nameEmploy,positionEmploy,emailEmploy);
    }
  }
}
}

/** Description: add a builfing to the company
*@param nameCompany String name of the company
*@param numberBuild Building the build to add
*/
public void addBuildingToCompany(String nameCompany,Building numberBuild){
for(int i = 0; i < companies.size();i++){
  if(companies.get(i).getNameComercy().equals(nameCompany)){
    if(companies.get(i).getBuild().getEmployeer() == null){
        companies.get(i).setBuild(numberBuild);
    }
  }
}
}

/** Description: This method show a ride on L
*@param nameK String the name of the company
*@param nameEmploy the name of the employ
*@return String information of the build
*/
public String showBuildingL(String nameK,String nameEmploy){
String message = "";
for(int i = 0; i < companies.size();i++){
if(companies.get(i).getNameComercy().equals(nameK)){
message = message + companies.get(i).getBuild().rideL(nameEmploy);
}
}
return message;
}

/** Description: This method do the ride Z
*@param nameK String name of the company
*@param nameEmploy name of the employ
*@return String information of build
*/
public String showBuildingZ(String nameK,String nameEmploy){
String message = "";
for(int i = 0; i < companies.size();i++){
if(companies.get(i).getNameComercy().equals(nameK)){
message = message + companies.get(i).getBuild().rideZ(nameEmploy);
}
}
return message;
}

/** Description: This method show the ride spiral 
*@param nameK String the name of the company
*@param charge the charge of the employ
*@return String the information o the build
*/
public String showBuildingSpiral(String nameK,String charge){
String message = "";
for(int i = 0; i < companies.size();i++){
if(companies.get(i).getNameComercy().equals(nameK)){
message = message + companies.get(i).getBuild().spiral(charge);
}
}
return message;
}

/** Description: this method show the ride on E
*@param nameK String  name of the company
*@param nameEmploy name of the employ
*@return String the information o the build
*/
public String showBuildingE(String nameK,String nameEmploy){
String message = "";
for(int i = 0; i < companies.size();i++){
if(companies.get(i).getNameComercy().equals(nameK)){
message = message + companies.get(i).getBuild().spiralE(nameEmploy);
}
}
return message;
}

/** Description: this method show the ride on O
*@param nameK String name of the company
*@param nameEmploy name of the employ
*@return String the information o the build
*/
public String showBuildingO(String nameK,String nameEmploy){
String message = "";
for(int i = 0; i < companies.size();i++){
if(companies.get(i).getNameComercy().equals(nameK)){
message = message + companies.get(i).getBuild().spiralO(nameEmploy);
}
}
return message;
}

/** Description: this method show the ride on X
*@param nameK String name of the company
*@param nameEmploy name of the employ
*@return String the information o the build
*/
public String showBuildingX(String nameK,String nameEmploy){
String message = "";
for(int i = 0; i < companies.size();i++){
if(companies.get(i).getNameComercy().equals(nameK)){
message = message + companies.get(i).getBuild().spiralXfila(nameEmploy);
}
}
return message;
}
}