package model;

public class Building{

//Atributes
private int numberBuilding;

//Relation
private Employeer[][] tower;

/** Description: This method initialize the variables
*@param numberBuilding int number of floors
*/
public Building(int numberBuilding){
this.numberBuilding = numberBuilding;
tower = new Employeer[numberBuilding][20];
inicializatedCub();
}

/** Description: This method get the cubicule
*@return Employer the tower
*/
public Employeer[][] getEmployeer(){
	return tower;
}

/** Description: his method set the cubicule
*@param tower Employeer the tower
*/
public void setEmployeer(Employeer[][] tower){
	this.tower = tower;
}

/**Description: this method initialize the employees
*/
public void inicializatedCub(){
for(int i = 0; i < tower.length;i++){
	for(int j = 0; j < tower[0].length;j++){
		tower[i][j] = new Employeer("","68" + i + j,"","",false);
	}
}
}

/**Description: This method assign an employ to a cubicule
*@param nameEmploy String name of the employ
*@param positionEmploy String position of the employ
*@param emailEmploy String email of the employ
*/
public void assingTheEmployInCubicule(String nameEmploy, String positionEmploy, String emailEmploy){
boolean t = false;
	for(int i = 0; i < tower.length && !t;i++){
		for(int k = 0; k < tower[0].length && !t;k++){
			if(tower[i][k].getDisponibility() == false){
				tower[i][k].setNameEmployeer(nameEmploy);
				tower[i][k].setPosition(positionEmploy);
				tower[i][k].setEmail(emailEmploy);
				tower[i][k].setDisponibility(true);
				t = true;
			}
		}
	}
}

/** Description: This method do the ride on L
*@param nameEmploy String name of the employ
*@return String name of the employ
*/
public String rideL(String nameEmploy){
String message = "";
int k = 0;
boolean abajoL = false;
for(int i = 0;  i < tower.length; i++){
    if(tower[i][k].getNameEmployeer().equals(nameEmploy)){
      message = "EMPLEADO:" + tower[i][k].getExtension();
      }
    abajoL = true;
  }
  if(abajoL == true){
    for(int m = 1; m  < tower[0].length; m++){
      if(tower[k][m].getNameEmployeer().equals(nameEmploy)){
            message = "EMPLEADO:" + tower[k][m].getExtension();
    }
  }
}
return message;
}

/** Description: This method do the ride on Z
*@param nameEmploy String name of the employ
*@return String name of the employ
*/
public String rideZ(String nameEmploy){
String message = "";
for(int i =0; i < tower.length; i++){
    if(tower[0][i].getNameEmployeer().equals(nameEmploy)){
      message = message + "EMPLEADO:" + tower[0][i].getExtension();
}
}
for(int k = 1; k < tower.length;k++){
      if(tower[k][tower.length-k].getNameEmployeer().equals(nameEmploy)){
          message = message + "EMPLEADO:" + tower[k][tower.length-k].getExtension();
}
}
for(int j= 1; j < tower.length; j++){
  if(tower[tower.length-1][j].getNameEmployeer().equals(nameEmploy)){
    message = message + "EMPLEADO:" + tower[tower.length][j].getExtension();
  }
}
return message;
}

/** Description: This method do the ride on X
*@param nameEmploy String name of the employee
*@return String name of the employee
*/
public String spiralXfila(String nameEmploy){
String message ="";
 for(int i = 0; i < tower.length;i++){
	 if(tower[i][i].getNameEmployeer().equals(nameEmploy)){
		 message = message + "EMPLEADO:" + tower[i][i].getExtension();
	 }
 }
  for(int k = 0; k < tower.length;k++){
	if((tower.length % 2 == 0) || (tower.length % 2 != 0 && k != tower.length/2)){
		if(tower[k][tower.length-1-k].getNameEmployeer().equals(nameEmploy)){
			message = message + "EMPLEADO:" + tower[k][tower.length-1-k].getExtension();
		}
	}
  }
return message;
}

/** Description: This method do the ride on spiral E
*@param nameEmploy String name of the employee
*@return String name of the employee
*/
public String spiralE(String nameEmploy){
String message = "";
int m = 0;
for(int i = 0; i < tower.length;i+= 2){
	for(int j = 0; j < tower.length;j++){
		if(m % 2 == 0){
			if(tower[i][j].getNameEmployeer().equals(nameEmploy)){
			message = message + "EMPLEADO:" + tower[i][j].getExtension();
			 }
			}else if(m % 2 != 0){
						if(tower[i][tower.length-j-1].getNameEmployeer().equals(nameEmploy)){
						message = message + "EMPLEADO:" + tower[i][tower.length-j-1].getExtension();
				}
			}
		}
		if(m % 2 == 0 && i < tower.length-1){
			if(tower[i+1][tower.length-1].getNameEmployeer().equals(nameEmploy)){
				message = message + "EMPLEADO:" + tower[i+1][tower.length-1].getExtension();
			}
		}else{
			if(tower[i+1][0].getNameEmployeer().equals(nameEmploy)){
				message = message + "EMPLEADO:" + tower[i+1][0].getExtension();
			}
		}
		m++;
	}
		return message;
}

/** Description: This method do the ride on spiral O
*@param nameEmploy String name of the employee
*@return String name of the employee
*/
public String spiralO(String nameEmploy){
String message = "";
for(int i = 0; i < tower.length;i++){
  if(tower[0][i].getNameEmployeer().equals(nameEmploy)){
    message = message + "EMPLEADO:" + tower[0][i].getExtension();
  }
}
for(int k = 0; k > tower[0].length; k++){
  if(tower[tower.length-1][k].getNameEmployeer().equals(nameEmploy)){
    message = message + "EMPLEADO:" + tower[tower.length][k].getExtension();
  }
}
for(int o = 0; o < tower.length;o++){
 if(tower[o][0].getNameEmployeer().equals(nameEmploy)){
  message = message + "EMPLEADO:" +tower[o][0].getExtension();
 }else if(tower[o][tower.length].getNameEmployeer().equals(nameEmploy)){
   message = message + "EMPLEADO:" +tower[o][tower.length].getExtension();
 }
}
return message;
}

/** Description: This method do the ride on spiral
*@param charge String charge of the employee
*@return String th charge of the employee
*/
public String spiral(String charge){
	String message = "";
	int row1 = 0;
	int row2 = tower.length-1;
	int col1 = 0;
	int col2 = tower.length-1;
	while(row1 < row2 && col1 < col2){
		for(int i = row1; i < row2;i++){
			if(tower[i][col1].getPosition().equals(charge)){
				message = message + "EMPLEADO:" + tower[i][col1].getEmail();
			}
		}
		col1++;
		for(int i = col1; i < col2;i++){
			if(tower[row2][i].getPosition().equals(charge)){
				message = message + "EMPLEADO:" + tower[row2][i].getEmail();
			}
		}
		row2--;
		for(int i = row2; i >= row1 ;i--){
			if(tower[i][col2].getPosition().equals(charge)){
				message = message + "EMPLEADO:" + tower[i][col2].getEmail();
			}
		}
		col2--;
		for(int i = col2; i >= col1;i--){
			if(tower[row1][i].getPosition().equals(charge)){
				message = message + "EMPLEADO:" + tower[row1][i].getEmail();
			}
		}
		row1++;
	}
 return message;
}
}
