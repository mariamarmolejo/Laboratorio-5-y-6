package model;
import java.util.ArrayList;

public class Product{

//Atributes
private String nameProduct;
private int waterAmount;
private int identify;
private int numberUnities;

/**Description: The constructor initialize the variables
*@param nameProduct String name of the product
*@param waterAmount int amount of water in the product
*@param identify int identification
*@param numberUnities int amount of unities
*/
public Product(String nameProduct,int waterAmount, int identify, int numberUnities){
  this.nameProduct = nameProduct;
  this.waterAmount = waterAmount;
  this.identify = identify;
  this.numberUnities = numberUnities;
}

/** Description:This method get the name of the product
*@return String name of the product
*/
public String getNameProduct(){
  return nameProduct;
}

/**Description: This method set the name of the product
* @param nameProduct String name of the product
*/
public void setNameProduct(String nameProduct){
  this.nameProduct = nameProduct;
}

/** Description: This method get the amount of water in the product
*@return String amount of water in the product
*/
public int getWaterAmount(){
  return waterAmount;
}

/**Description: This method set the amount of water in the product
* @param waterAmount int amount of water in the product
*/
public void setWaterAmount(int waterAmount){
  this.waterAmount = waterAmount;
}

/** Description:This method get the identify
*@return int identify
*/
public int getIdentify(){
  return identify;
}

/**Description: This method set the identify
* @param identify int identify
*/
public void setIdentify(int identify){
  this.identify = identify;
}

/** Description:This method get the amount of unities
*@return int la informacion de la companhia de comida
*/
public int getNumberUnities(){
  return numberUnities;
}

/**Description: This method set the amount of unities
* @param numberUnities int amount of unities
*/
public void setNumerUnities(int numberUnities){
  this.numberUnities = numberUnities;
}

/** Description: This method get the information of the products
*@return String information of the products
*/
public String toString(){
String message = "";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + "Nombre Producto:"+ nameProduct + "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + "identificacion:"+ identify + "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
message = message + "Cantidad de unidades:"+ numberUnities + "\n";
message = message + "---------------------------------------------------------------------------------------------------------------------------- \n";
return message;
}

}