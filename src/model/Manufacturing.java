package model;
import java.util.ArrayList;

public class Manufacturing extends Company{

//Relations
private ArrayList<Product> products;

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
public Manufacturing(String nameComercy, int amountEmployeer, double amountActives, String inscription, String nit, String address,String phone, char typeOrganization, String legalName,Building build){
super(nameComercy,amountEmployeer,amountActives,inscription,nit,address,phone,typeOrganization,legalName,build);
products = new ArrayList<Product>();
}

/** Description:This method get the products
*@return ArrayList products
*/
public ArrayList<Product> getProducts(){
  return products;
}

/** Description: This method set the  products
*@param products ArrayList products
*/
public void setProducts(ArrayList<Product> products){
  this.products = products;
}

/** Description: This method add the products
*@param productos ArrayList products
*/
public void addProduct(ArrayList<Product> productos){
products = productos;
}

/** Description:This method get the information of the products
*@return String information of the products
*/
public String getInformation(){
String message = "";
for(int i = 0; i < products.size();i++){
    message = message + products.get(i).toString();
  }
return message;
}

/** Description: This method get the information of the Company
*@return String information of the Company
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
for(int i = 0; i < products.size();i++){
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + products.get(i).toString() + "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
}
return message;
}
}