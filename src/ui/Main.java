package ui;

import model.*;
import java.util.Scanner;
import java.util.ArrayList;

public  class Main{

//Relation
private Holding principal;

//Atributes
private Scanner reader;

public Main(){
  init();
  reader = new Scanner(System.in);
}

public static void main(String[] args) {
Main m = new Main();
m.showMenu();
}

public void showMenu(){
  int userImput = 0;
  System.out.println("===========================================================");
  System.out.println("Escoja una opcion:");
  System.out.println("1.Mostrar la informacion");
  System.out.println("2.Agregar una compania");
  System.out.println("3.Agregar productos a una empresa");
  System.out.println("4.Agregar encuestas a una empresa");
  System.out.println("5.Agregar un edificio a una empresa");
  System.out.println("6.Agregar un empleado a un cubiculo");
  System.out.println("7.Buscar al empleado en la empresa en forma de L");
  System.out.println("8.Buscar al empleado en la empresa en forma de E");
  System.out.println("9.Buscar al empleado en la empresa en forma de Espiral");
  System.out.println("10.Buscar al empleado en la empresa en forma de O");
  System.out.println("11.Buscar al empleado en la empresa en forma de X");
  System.out.println("12.Salir");
  System.out.println("===========================================================");
  while(userImput != 12){
    userImput = reader.nextInt();
    reader.nextLine();
    if(userImput == 1){
      System.out.println(principal.showInformation());
    }else if(userImput == 2){
      int userSelection = 0;
      System.out.println("Ha elegido crear una compania");
      System.out.println("===========================================================");
      System.out.println("Elija el tipo de compania");
      System.out.println("***DE SERVICIO***");
      System.out.println("1.Empresa de Educacion");
      System.out.println("2.Empresa de tecnologia");
      System.out.println("3.Empresa publica");
      System.out.println("***DE MANOFACTURA***");
      System.out.println("4.Empresa de comida");
      System.out.println("5.Empresa de medicamento");
      System.out.println("6.Salir");
      System.out.println("===========================================================");
      while(userSelection != 6){
      userSelection = reader.nextInt();
      reader.nextLine();
      if(userSelection == 1){
        System.out.println("Digite el nombre dela compania");
        String comerName1 = reader.nextLine();

        System.out.println("Digite el nit");
        String nit1 = reader.nextLine();

        System.out.println("Digite la direccion");
        String addres1 = reader.nextLine();

        System.out.println("Digite el numero de contacto");
        String phoneContact1 = reader.nextLine();

        System.out.println("Digite la cantidad de empleados");
        int employeerCant1 = reader.nextInt();
        reader.nextLine();

        System.out.println("Digite el valor de los activos");
        double amountActives1 = reader.nextDouble();
        reader.nextLine();

        System.out.println("Digite la fecha en formato AAAA-MM-DD");
        String dateOfInscription1 = reader.nextLine();

        System.out.println("Digite el tipo de organizacion:");
        System.out.println("AGRICULTURA, CAZA, SILVICULTURA Y PEZCA:" + Company.AGRICULTURE);
        System.out.println("EXPLOTACION DE MINAS Y CANTERAS:"+ Company.EXPLOITATION);
        System.out.println("INDUSTRIA MANUFACTURERA:"+ Company.INDUSTRY);
        System.out.println("ELECTRICIDAD, GAS Y VAPOR:" + Company.ELECTRICITY);
        System.out.println("CONSTRUCCION:" + Company.CONSTRUCTION);
        System.out.println("COMERCIO AL POR MAYOR Y AL POR MENOR:" + Company.COMERCY);
        System.out.println("TRANSPORTE, ALMACENAMIENTO Y COMUNICACIONES:" + Company.TRANSPORTATION);
        System.out.println("EST.F/CIEROS,SEGUROS,B.INMUEBLES,SERV. A COMPANIAS:" + Company.FINANCIAL_STATEMENTS);
        System.out.println("COMUNALES, SOCIALES:" + Company.SOCIETY);
        char typeOrganization1 = reader.nextLine().charAt(0);

        System.out.println("Digite el nombre legal");
        String legalName1 = reader.nextLine();

        System.out.println("Digite el numero de registro ante el Ministerio de educacion");
        String numberRegistrationMEN1 = reader.nextLine();

        System.out.println("Digite los anhos de acreditacion");
        int numberYearsAcreditation1 = reader.nextInt();
        reader.nextLine();

        System.out.println("Digite el puesto el puesto en saber 11 (Si esta en el sector Bachillerato,si no ponga 0)");
        int positionSaber11 = reader.nextInt();
        reader.nextLine();

        System.out.println("Digite el puesto en saber Pro(Si esta en el sector de universitario,si no ponga 0)");
        int positionSaberPro = reader.nextInt();
        reader.nextLine();

        System.out.println("Digite el nombre del rector");
        String nameRector = reader.nextLine();

        System.out.println("Digite el sector educativo//" + Education.HIGH_SCHOOL + "//" + Education.UNIVERSITY);
        String sectorEdu = reader.nextLine();

        System.out.println("Digite los estudiantes en estratos 1 y 2");
        int students1and2 = reader.nextInt();
        reader.nextLine();

        System.out.println("Digite el total de estudiantes");
        int totalEstudents = reader.nextInt();
        reader.nextLine();

        System.out.println("Digite el numero de pisos que quiere para su edificio");
        int m1 = reader.nextInt();
        reader.nextLine();

        Building bb = new Building(m1);

        Company m = new Education(comerName1,employeerCant1,amountActives1,dateOfInscription1,nit1,addres1,phoneContact1,typeOrganization1,legalName1,bb,numberRegistrationMEN1,numberYearsAcreditation1,positionSaber11,positionSaberPro,nameRector,sectorEdu,students1and2,totalEstudents);

        System.out.println( "Ingrese las encuestas hechas por los usuarios, 1.SI son 10 encuestas,2.(50)");
        int userSel = reader.nextInt();
        reader.nextLine();

        ArrayList<Poll> pollss = new ArrayList<Poll>();

        if(userSel == 1){

          for(int i = 0; i < 10; i++){
          System.out.println("Digite el servicio hecho");
          int q = reader.nextInt();
          reader.nextLine();

          System.out.println("Digite el tiempo de respuesta dado");
          int w = reader.nextInt();
          reader.nextLine();

          System.out.println("Digite el costo de relacion por beneficio");
          int e = reader.nextInt();
          reader.nextLine();

          Poll kjr = new Poll(q,w,e);
          pollss.add(kjr);
          principal.addCompanyWithPolls(m,pollss);

        }
        }else if(userSel == 2){

          for (int i = 0;i < 50; i++){

          System.out.println("Digite el servicio hecho");
          int k = reader.nextInt();
          reader.nextLine();

          System.out.println("Digite el tiempo de respuesta dado");
          int l = reader.nextInt();
          reader.nextLine();

          System.out.println("Digite el costo de relacion por beneficio");
          int j = reader.nextInt();
          reader.nextLine();

          Poll kjss = new Poll(k,l,j);
          pollss.add(kjss);
          principal.addCompanyWithPolls(m,pollss);
          }

      }



      }else if(userSelection == 2){

        System.out.println("Digite el nombre del comercio");
        String comerName2 = reader.nextLine();

        System.out.println("Digite su nit");
        String nit2 = reader.nextLine();

        System.out.println("Digite su direccion");
        String addres2 = reader.nextLine();

        System.out.println("Digite su numero de contacto");
        String phoneContact2 = reader.nextLine();

        System.out.println("Digite la cantidad de empleados");
        int employeerCant2 = reader.nextInt();
        reader.nextLine();

        System.out.println("Digite el valor de los activos");
        double amountActives2 = reader.nextDouble();
        reader.nextLine();

        System.out.println("Digite la fecha en formato AAAA-MM-DD");
        String dateOfInscription2 = reader.nextLine();

        System.out.println("Digite el tipo de organizacion:");
        System.out.println("AGRICULTURA, CAZA, SILVICULTURA Y PEZCA:" + Company.AGRICULTURE);
        System.out.println("EXPLOTACION DE MINAS Y CANTERAS:"+ Company.EXPLOITATION);
        System.out.println("INDUSTRIA MANUFACTURERA:"+ Company.INDUSTRY);
        System.out.println("ELECTRICIDAD, GAS Y VAPOR:" + Company.ELECTRICITY);
        System.out.println("CONSTRUCCION:" + Company.CONSTRUCTION);
        System.out.println("COMERCIO AL POR MAYOR Y AL POR MENOR:" + Company.COMERCY);
        System.out.println("TRANSPORTE, ALMACENAMIENTO Y COMUNICACIONES:" + Company.TRANSPORTATION);
        System.out.println("EST.F/CIEROS,SEGUROS,B.INMUEBLES,SERV. A COMPANIAS:" + Company.FINANCIAL_STATEMENTS);
        System.out.println("COMUNALES, SOCIALES:" + Company.SOCIETY);
        char typeOrganization2 = reader.nextLine().charAt(0);

        System.out.println("Digite el nombre legal");
        String legalName2 = reader.nextLine();

		    System.out.println("Digite el tipo de servicio + " + Technology.CAPATITATION_CONSULT + "" + Technology.SOFTWARE_DEVELOPMENT + "" + Technology.INFRASTRUCTURE_SERVICE + "" + Technology.SOFTWARE_SERVICE + "" + Technology.PLATAFORM_SERVICE);
		    String serviceTechno = reader.nextLine();

        System.out.println("Digite el consumo de consuptiomKilowatts");
        int consupTiom = reader.nextInt();
        reader.nextLine();

        System.out.println("Digite el numero de pisos que quiere para su edificio");
        int m = reader.nextInt();
        reader.nextLine();

        Building jks = new Building(m);

		    Company n = new Technology(comerName2,employeerCant2,amountActives2,dateOfInscription2,nit2,addres2,phoneContact2,typeOrganization2,legalName2,jks,serviceTechno,consupTiom);

        System.out.println( "Ingrese las encuestas hechas por los usuarios, 1.SI son 10 encuestas,2.(50)");
        int userSel1 = reader.nextInt();
        reader.nextLine();

        ArrayList<Poll> pollss1 = new ArrayList<Poll>();

        if(userSel1 == 1){

          for(int i = 0; i < 10; i++){
          System.out.println("Digite el servicio hecho");
          int q1 = reader.nextInt();
          reader.nextLine();

          System.out.println("Digite el tiempo de respuesta dado");
          int w1 = reader.nextInt();
          reader.nextLine();

          System.out.println("Digite el costo de relacion por beneficio");
          int e1 = reader.nextInt();
          reader.nextLine();

          Poll kjr1 = new Poll(q1,w1,e1);
          pollss1.add(kjr1);
          principal.addCompanyWithPolls(n,pollss1);

        }

      }else if(userSel1 == 2){

          for (int i = 0;i < 50; i++){

          System.out.println("Digite el servicio hecho");
          int k1 = reader.nextInt();
          reader.nextLine();

          System.out.println("Digite el tiempo de respuesta dado");
          int l1 = reader.nextInt();
          reader.nextLine();

          System.out.println("Digite el costo de relacion por beneficio");
          int j1 = reader.nextInt();
          reader.nextLine();

          Poll kjss1 = new Poll(k1,l1,j1);
          pollss1.add(kjss1);
          principal.addCompanyWithPolls(n,pollss1);
          }

      }


      }else if(userSelection == 3){

        System.out.println("Digite el nombre del comercio");
        String comerName3 = reader.nextLine();

        System.out.println("Digite su nit");
        String nit3 = reader.nextLine();

        System.out.println("Digite su direccion");
        String addres3 = reader.nextLine();

        System.out.println("Digite su numero de contacto");
        String phoneContact3 = reader.nextLine();

        System.out.println("Digite la cantidad de empleados");
        int employeerCant3 = reader.nextInt();
        reader.nextLine();

        System.out.println("Digite el valor de los activos");
        double amountActives3 = reader.nextDouble();
        reader.nextLine();

        System.out.println("Digite la fecha en formato AAAA-MM-DD");
        String dateOfInscription3 = reader.nextLine();

        System.out.println("Digite el tipo de organizacion:");
        System.out.println("AGRICULTURA, CAZA, SILVICULTURA Y PEZCA:" + Company.AGRICULTURE);
        System.out.println("EXPLOTACION DE MINAS Y CANTERAS:"+ Company.EXPLOITATION);
        System.out.println("INDUSTRIA MANUFACTURERA:"+ Company.INDUSTRY);
        System.out.println("ELECTRICIDAD, GAS Y VAPOR:" + Company.ELECTRICITY);
        System.out.println("CONSTRUCCION:" + Company.CONSTRUCTION);
        System.out.println("COMERCIO AL POR MAYOR Y AL POR MENOR:" + Company.COMERCY);
        System.out.println("TRANSPORTE, ALMACENAMIENTO Y COMUNICACIONES:" + Company.TRANSPORTATION);
        System.out.println("EST.F/CIEROS,SEGUROS,B.INMUEBLES,SERV. A COMPANIAS:" + Company.FINANCIAL_STATEMENTS);
        System.out.println("COMUNALES, SOCIALES:" + Company.SOCIETY);
        char typeOrganization3 = reader.nextLine().charAt(0);

        System.out.println("Digite el nombre legal");
        String legalName3 = reader.nextLine();

		System.out.println("Digite el servicio de la empresa publica:" + "//" + Public.SAWAGE_SYSTEM + "//" + Public.ENERGY + "//" + Public.AQUEDUCT);
		String namePublic = reader.nextLine();

		System.out.println("Digite la cantidad de suscriptores total");
	    int suscriptorsTotal = reader.nextInt();
		reader.nextLine();

		System.out.println("Digite la cantidad de suscriptores 1 y 2 ");
		int suscriptors1and2 = reader.nextInt();
		reader.nextLine();

    System.out.println("Digite el numero de pisos que quiere para su edificio");
    int m3 = reader.nextInt();
    reader.nextLine();

    Building jks3 = new Building(m3);

		Company b = new Public(comerName3,employeerCant3,amountActives3,dateOfInscription3,nit3,addres3,phoneContact3,typeOrganization3,legalName3,jks3,namePublic,suscriptorsTotal,suscriptors1and2);

    System.out.println( "Ingrese las encuestas hechas por los usuarios, 1.SI son 10 encuestas,2. (50)");
    int userSel2 = reader.nextInt();
    reader.nextLine();

    ArrayList<Poll> pollss2 = new ArrayList<Poll>();

    if(userSel2 == 1){

      for(int i = 0; i < 10; i++){
      System.out.println("Digite el servicio hecho");
      int q2 = reader.nextInt();
      reader.nextLine();

      System.out.println("Digite el tiempo de respuesta dado");
      int w2 = reader.nextInt();
      reader.nextLine();

      System.out.println("Digite el costo de relacion por beneficio");
      int e2 = reader.nextInt();
      reader.nextLine();

      Poll kjr2 = new Poll(q2,w2,e2);
      pollss2.add(kjr2);
      principal.addCompanyWithPolls(b,pollss2);

    }
  }else if(userSel2 == 2){

      for (int i = 0;i < 50; i++){

      System.out.println("Digite el servicio hecho");
      int k2 = reader.nextInt();
      reader.nextLine();

      System.out.println("Digite el tiempo de respuesta dado");
      int l2 = reader.nextInt();
      reader.nextLine();

      System.out.println("Digite el costo de relacion por beneficio");
      int j2 = reader.nextInt();
      reader.nextLine();

      Poll kjss2 = new Poll(k2,l2,j2);
      pollss2.add(kjss2);
      principal.addCompanyWithPolls(b,pollss2);
      }

  }

      }else if(userSelection == 4){

        System.out.println("Digite el nombre del comercio");
        String comerName4 = reader.nextLine();

        System.out.println("Digite su nit");
        String nit4 = reader.nextLine();

        System.out.println("Digite su direccion");
        String addres4 = reader.nextLine();

        System.out.println("Digite su numero de contacto");
        String phoneContact4 = reader.nextLine();

        System.out.println("Digite la cantidad de empleados");
        int employeerCant4 = reader.nextInt();
        reader.nextLine();

        System.out.println("Digite el valor de los activos");
        double amountActives4 = reader.nextDouble();
        reader.nextLine();

        System.out.println("Digite la fecha en formato AAAA-MM-DD");
        String dateOfInscription4 = reader.nextLine();

        System.out.println("Digite el tipo de organizacion:");
        System.out.println("AGRICULTURA, CAZA, SILVICULTURA Y PEZCA:" + Company.AGRICULTURE);
        System.out.println("EXPLOTACION DE MINAS Y CANTERAS:"+ Company.EXPLOITATION);
        System.out.println("INDUSTRIA MANUFACTURERA:"+ Company.INDUSTRY);
        System.out.println("ELECTRICIDAD, GAS Y VAPOR:" + Company.ELECTRICITY);
        System.out.println("CONSTRUCCION:" + Company.CONSTRUCTION);
        System.out.println("COMERCIO AL POR MAYOR Y AL POR MENOR:" + Company.COMERCY);
        System.out.println("TRANSPORTE, ALMACENAMIENTO Y COMUNICACIONES:" + Company.TRANSPORTATION);
        System.out.println("EST.F/CIEROS,SEGUROS,B.INMUEBLES,SERV. A COMPANIAS:" + Company.FINANCIAL_STATEMENTS);
        System.out.println("COMUNALES, SOCIALES:" + Company.SOCIETY);
        char typeOrganization4 = reader.nextLine().charAt(0);

        System.out.println("Digite el nombre legal");
        String legalName4 = reader.nextLine();

        System.out.println("Digite el importador");
        String impor = reader.nextLine();

        System.out.println("Digite el productor");
        String mak = reader.nextLine();

        System.out.println("Digite la conservacion" + "/" + Food.ROOM_TEMPERATURE + "/" + Food.REFRIGERATION + "/" + Food.FREEZER);
        String con = reader.nextLine();

        System.out.println("Digite el numero de pisos que quiere para su edificio");
        int m4 = reader.nextInt();
        reader.nextLine();

        Building jks4 = new Building(m4);

        Company z = new Food(comerName4,employeerCant4,amountActives4,dateOfInscription4,nit4,addres4,phoneContact4,typeOrganization4,legalName4,jks4,impor,mak,con);

		    System.out.println("Digite cuantos productos necesita");
		    int numberProducts = reader.nextInt();

        ArrayList<Product> l = new ArrayList<Product>();

		   for(int i = 0; i < numberProducts;i++){
			System.out.println("Digite el nombre del producto");
      String namePro = reader.nextLine();

      System.out.println("Digite la cantidad de agua");
      int aguaCan = reader.nextInt();
      reader.nextLine();

      System.out.println("Digite su identificacion");
      int identy = reader.nextInt();
      reader.nextLine();

      System.out.println("Digite el numero de unidades");
      int unities = reader.nextInt();
      reader.nextLine();

      Product m = new Product(namePro,aguaCan,identy,unities);
      l.add(m);
      principal.addCompanyProducts(z,l);

		}


      }else if(userSelection == 5){

        System.out.println("Digite el nombre del comercio");
        String comerName5 = reader.nextLine();

        System.out.println("Digite su nit");
        String nit5 = reader.nextLine();

        System.out.println("Digite su direccion");
        String addres5 = reader.nextLine();

        System.out.println("Digite su numero de contacto");
        String phoneContact5 = reader.nextLine();

        System.out.println("Digite la cantidad de empleados");
        int employeerCant5 = reader.nextInt();
        reader.nextLine();

        System.out.println("Digite el valor de los activos");
        double amountActives5 = reader.nextDouble();
        reader.nextLine();

        System.out.println("Digite la fecha en formato AAAA-MM-DD");
        String dateOfInscription5 = reader.nextLine();

        System.out.println("Digite el tipo de organizacion:");
        System.out.println("AGRICULTURA, CAZA, SILVICULTURA Y PEZCA:" + Company.AGRICULTURE);
        System.out.println("EXPLOTACION DE MINAS Y CANTERAS:"+ Company.EXPLOITATION);
        System.out.println("INDUSTRIA MANUFACTURERA:"+ Company.INDUSTRY);
        System.out.println("ELECTRICIDAD, GAS Y VAPOR:" + Company.ELECTRICITY);
        System.out.println("CONSTRUCCION:" + Company.CONSTRUCTION);
        System.out.println("COMERCIO AL POR MAYOR Y AL POR MENOR:" + Company.COMERCY);
        System.out.println("TRANSPORTE, ALMACENAMIENTO Y COMUNICACIONES:" + Company.TRANSPORTATION);
        System.out.println("EST.F/CIEROS,SEGUROS,B.INMUEBLES,SERV. A COMPANIAS:" + Company.FINANCIAL_STATEMENTS);
        System.out.println("COMUNALES, SOCIALES:" + Company.SOCIETY);
        char typeOrganization5 = reader.nextLine().charAt(0);

        System.out.println("Digite el nombre legal");
        String legalName5 = reader.nextLine();

        System.out.println("Digite el registro sanitario");
        String sanitaryReg = reader.nextLine();

        System.out.println("DIgite el estado" + Invima.VALID + "//" + Invima.NORENEWED);
        String state1 = reader.nextLine();

        System.out.println("Digite la fecha de expiracion");
        String expira = reader.nextLine();

        System.out.println("Digite la modalidad" +"//" + Invima.FABRICATION_EXPO + "//" + Invima.FABRICATION_SELL + "//" + Invima.IMPORT_SELL);
        char modali = reader.nextLine().charAt(0);

        System.out.println("AHORA DIGITE UNOS REQUERIMIENTOS DE MAS");
        System.out.println("Digite el numero de pisos que quiere para su edificio, min de 3 max de 7");
        int m5 = reader.nextInt();
        reader.nextLine();

        Building jks5 = new Building(m5);

        Company lol = new Invima(comerName5,employeerCant5,amountActives5,dateOfInscription5,nit5,addres5,phoneContact5,typeOrganization5,legalName5,jks5,sanitaryReg,state1,expira,modali);

        System.out.println("Digite cuantos productos necesita");
		    int numberProducts1 = reader.nextInt();

        ArrayList<Product> l1 = new ArrayList<Product>();

		   for(int i = 0; i < numberProducts1;i++){
			System.out.println("Digite el nombre del producto");
      String namePro1 = reader.nextLine();

      System.out.println("Digite la cantidad de agua");
      int aguaCan1 = reader.nextInt();
      reader.nextLine();

      System.out.println("Digite su identificacion");
      int identy1 = reader.nextInt();
      reader.nextLine();

      System.out.println("Digite el numero de unidades");
      int unities1 = reader.nextInt();
      reader.nextLine();

      Product m1 = new Product(namePro1,aguaCan1,identy1,unities1);
      l1.add(m1);
      principal.addCompanyProducts(lol,l1);

		}


      }else{

        System.out.println("===========================================================");
        System.out.println("Ha salido con exito de la creacion");
        System.out.println("===========================================================");
        System.out.println("Escoja una opcion:");
        System.out.println("1.Mostrar la informacion");
        System.out.println("2.Agregar una compania");
        System.out.println("3.Agregar productos a una empresa");
        System.out.println("4.Agregar encuestas a una empresa");
        System.out.println("5.Agregar un edificio a una empresa");
        System.out.println("6.Agregar un empleado a un cubiculo");
        System.out.println("7.Buscar al empleado en la empresa en forma de L");
        System.out.println("8.Buscar al empleado en la empresa en forma de E");
        System.out.println("9.Buscar al empleado en la empresa en forma de Espiral");
        System.out.println("10.Buscar al empleado en la empresa en forma de O");
        System.out.println("11.Buscar al empleado en la empresa en forma de X");
        System.out.println("12.Salir");
        System.out.println("===========================================================");
      }

    }

}else if(userImput == 3){
  System.out.println("Ha elegido agregar productos a una empresa");
  System.out.println("Digite el nombre de la empresa:");
  String nombre = reader.nextLine();

  System.out.println(principal.getCompanyWithProductsInformation(nombre));

  System.out.println("Digite el numero de productos a agregar");
  int k = reader.nextInt();
  reader.nextLine();

  ArrayList<Product> lm = new ArrayList<Product>();

  for(int j = 0; j < k;j++){

    System.out.println("Digite el nombre del producto");
    String produc = reader.nextLine();

    System.out.println("Digite la cantidad de agua");
    int wa = reader.nextInt();
    reader.nextLine();

    System.out.println("Digite la identificacion");
    int iden = reader.nextInt();
    reader.nextLine();

    System.out.println("Digite el numero de unidades");
    int uni = reader.nextInt();
    reader.nextLine();

    Product kl = new Product(produc,wa,iden,uni);

    if(principal.getProductOfCompany(nombre) != null){
    principal.getProductOfCompany(nombre).add(kl);
  }
}

}else if(userImput == 4){

System.out.println("Digite el nombre de la empresa");
String nombre1 = reader.nextLine();

System.out.println(principal.getCompanyWithPollsInformation(nombre1));

System.out.println("Digite del 1 al 5 su satisfaccion en las encuestas");
System.out.println("Digite el numero de Polls a agregar, 1. 10 encuestas y 2 50 encuestas");
int number = reader.nextInt();
reader.nextLine();

if(number ==1){
for(int i = 0; i < 10; i++){

  System.out.println("Digite el servicio hecho");
  int k = reader.nextInt();
  reader.nextLine();

  System.out.println("Digite el tiempo de respuesta dado");
  int l = reader.nextInt();
  reader.nextLine();

  System.out.println("Digite el costo de relacion por beneficio");
  int j = reader.nextInt();
  reader.nextLine();

  Poll kj = new Poll(k,l,j);

  if(principal.getPollsOfCompany(nombre1) != null){
    principal.getPollsOfCompany(nombre1).add(kj);
  }

}

}else if(number == 2){
  for(int h = 0; h < 50;h++){
    System.out.println("Digite el servicio hecho");
    int mk = reader.nextInt();
    reader.nextLine();

    System.out.println("Digite el tiempo de respuesta dado");
    int ml = reader.nextInt();
    reader.nextLine();

    System.out.println("Digite el costo de relacion por beneficio");
    int mj = reader.nextInt();
    reader.nextLine();

    Poll mkj = new Poll(mk,ml,mj);

    if(principal.getPollsOfCompany(nombre1) != null){
      principal.getPollsOfCompany(nombre1).add(mkj);
  }
}
}

}else if(userImput == 5){

System.out.println("Digite el nombre de la compania");
String nameCom = reader.nextLine();

System.out.println("Digite el numero de pisos min 3, max 7");
int numberPisos = reader.nextInt();
reader.nextLine();

Building willy = new Building(numberPisos);

principal.addBuildingToCompany(nameCom,willy);

}else if(userImput == 6){

System.out.println("Digite el nombre de la compania");
String comName = reader.nextLine();

System.out.println("Digite el nombre del empleado");
String nameEm = reader.nextLine();

System.out.println("Digite el cargo del empleado");
String positionEm = reader.nextLine();

System.out.println("Digite el email del empleado");
String emailEm = reader.nextLine();

principal.addEmployeerToCubicules(comName,nameEm,positionEm,emailEm);

}else if(userImput == 7){

System.out.println("Digite el nombre de la compania");
String nombreComy = reader.nextLine();

System.out.println("Digite el nombre del empleado");
String nameEmple = reader.nextLine();

System.out.println(principal.showBuildingL(nombreComy,nameEmple));

}else if(userImput == 8){

  System.out.println("Digite el nombre de la compania");
  String nombreComy1 = reader.nextLine();

  System.out.println("Digite el nombre del empleado");
  String nameEmple1 = reader.nextLine();

  System.out.println(principal.showBuildingE(nombreComy1,nameEmple1));


}else if(userImput == 9){

  System.out.println("Digite el nombre de la compania");
  String nombreComy1 = reader.nextLine();

  System.out.println("Digite el cargo del empleado");
  String cargo1 = reader.nextLine();

  System.out.println(principal.showBuildingSpiral(nombreComy1,cargo1));

}else if(userImput == 10){

  System.out.println("Digite el nombre de la compania");
  String nombreComy2 = reader.nextLine();

  System.out.println("Digite el nombre del empleado");
  String nameEmple2 = reader.nextLine();

  System.out.println(principal.showBuildingO(nombreComy2,nameEmple2));


}else if(userImput == 11){

  System.out.println("Digite el nombre de la compania");
  String nombreComy3 = reader.nextLine();

  System.out.println("Digite el nombre del empleado");
  String nameEmple3 = reader.nextLine();

  System.out.println(principal.showBuildingX(nombreComy3,nameEmple3));
}
}
}

  public void init(){
    principal = new Holding(new Building(5));
    Building jh = new Building(6);
    Company techno = new Technology("UbisoftSoftware",12,139.1,"2019-03-01","123330133","Sucre","3104898989", Company.FINANCIAL_STATEMENTS, "Bugisoft",jh, Technology.SOFTWARE_DEVELOPMENT,1333);
    principal.addCompany(techno);

    Building jotaMario = new Building(7);
    Company invi = new Invima("UbisoftSoftware1",12,139.1,"2019-03-01","123330133","Sucre","3104898989", Company.FINANCIAL_STATEMENTS, "Bugisoft",jotaMario,"sadasdasd",Invima.VALID,"2019-02-03",Invima.FABRICATION_SELL);
    Product zk = new Product("Producto",12,123123133,5);
    ArrayList<Product> ms =  new ArrayList<Product>();
    ms.add(zk);
    principal.addCompanyProducts(invi,ms);
  }
}