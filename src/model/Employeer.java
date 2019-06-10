package model;

public class Employeer{

//ATRIBUTES
private String nameEmployeer;
private String extension;
private String position;
private String email;
private boolean disponibility;

/** Description: The constructor initialize the variables
*@param nameEmployeer String name of the employeer
*@param extension String extension of the cubicule
*@param position String charge of the employeer
*@param email String email of the employeer
*@param disponibility boolean disponibility of the cubicule
*/
public Employeer(String nameEmployeer,String extension,String position, String email,boolean disponibility){
this.nameEmployeer = nameEmployeer;
this.extension = extension;
this.position = position;
this.email = email;
this.disponibility = disponibility;

}

/** Description: this method gets the name of the employeer
*@return String name of the employeer
*/
public String getNameEmployeer(){
  return nameEmployeer;
}

/**Description: this method gets the extension of the cubicule
*@return String extension of the cubicule
*/
public String getExtension(){
  return extension;
}

/** Description:this method gets the position of the employeer
*@return String position of the employeer
*/
public String getPosition(){
  return position;
}

/** Description: this method gets the email of the employeer
*@return String email of the employeer
*/
public String getEmail(){
  return email;
}

/** Description: this method gets the disponibility of the cubicule
*@return boolean disponibility of the cubicule
*/
public boolean getDisponibility(){
  return disponibility;
}

/** Description: this method set the position of the employeer
*@param position String position of the employeer
*/
public void setPosition(String position){
  this.position = position;
}

/** Description:  this method set the extension of the cubicule
*@param extension String extension of the cubicule
*/
public void setExtension(String extension){
  this.extension = extension;
}

/** Description: this method set the disponibility of the cubicule
*@param disponibility boolean disponibility of the cubicule
*/
public void setDisponibility(boolean disponibility){
  this.disponibility = disponibility;
}

/** Description: this method set the email of the employeer
*@param email String email of the employeer
*/
public void setEmail(String email){
  this.email = email;
}

/** Description: this method set the name of the employeer
*@param nameEmployeer String name of the employeer
*/
public void setNameEmployeer(String nameEmployeer){
  this.nameEmployeer = nameEmployeer;
}

}
