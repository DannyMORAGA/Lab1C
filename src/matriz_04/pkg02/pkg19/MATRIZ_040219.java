package matriz_04.pkg02.pkg19;

import java.util.Scanner;


public class MATRIZ_040219 {

   
    public static void main(String[] args) {
        Scanner Leer =new Scanner(System.in);
        String StrMatriz [][];
        StrMatriz = new String[10][6];
        int intSuelBas=0, intTotDedu=0, intTotPer=0, intSuelLi1=0, intSuelLi2=0, intSuelLi3=0, intSuelLi4=0, intDep;
        String strSuelBas1, strTotDedu1, strTotPer1, strSuelLi5, strDep1;
        System.out.println("Bienvenido!!!! INGRESO DE PLANILLA\n");
        
        for(int intCont=0; intCont<10; intCont++){
          System.out.println("Ingrese un Nombre en la posicion: ["+intCont+"] [0]");
          StrMatriz[intCont][0]=Leer.next();   
        }
        
        for(int intCont=0; intCont<10; intCont++){
          intSuelBas=(int)(Math.random()*5000+4000);
          strSuelBas1= Integer.toString(intSuelBas);          
          StrMatriz[intCont][1]=strSuelBas1;
        }
        
        for(int intCont=0; intCont<10; intCont++){
          intTotDedu=(int)(Math.random()*500+300);   
          strTotDedu1= Integer.toString(intTotDedu);
          StrMatriz[intCont][2]=strTotDedu1;
        }
        
        for(int intCont=0; intCont<10; intCont++){    
          intTotPer=(int)(Math.random()*500+300);
          strTotPer1= Integer.toString(intTotPer);
          StrMatriz[intCont][3]=strTotPer1;
        }
        
        for(int intCont=0; intCont<10; intCont++){
          intSuelLi1= Integer.parseInt(StrMatriz[intCont][1]);
          intSuelLi2= Integer.parseInt(StrMatriz[intCont][2]);
          intSuelLi3= Integer.parseInt(StrMatriz[intCont][3]);
          intSuelLi4= intSuelLi1-intSuelLi2+intSuelLi3;
          strSuelLi5= Integer.toString(intSuelLi4);
          StrMatriz[intCont][4]=strSuelLi5;        
        }
        
        for(int intCont=0; intCont<10; intCont++){ 
          intDep=(int)(Math.random()*5+1);
          strDep1= Integer.toString(intDep);
          StrMatriz[intCont][5]=strDep1;
        }
        
        System.out.println("        <Nombre>         <Sue_Ba>       <Tot_De>         <Tot_Pe>        <Sue_Li>      <Depart>");
        
        for(int intFila=0; intFila<10; intFila++){
           for(int intColumna=0; intColumna<6; intColumna++){
           System.out.print("           "+StrMatriz[intFila][intColumna]+"\t");
           }
           System.out.println();
        }
        
        int intVector[]= new int[5];
        int intD1=0,intD2=0,intD3=0,intD4=0,intD5=0;
        for(int Cont=0; Cont<10; Cont++)
        {
        if(StrMatriz[Cont][5].equals("1")){
        intVector[0]=intD1=intD1+1;
        }
        if(StrMatriz[Cont][5].equals("2")){
        intVector[1]=intD2=intD2+1;
        }
        if(StrMatriz[Cont][5].equals("3")){
        intVector[2]=intD3=intD3+1;
        }
        if(StrMatriz[Cont][5].equals("4")){
        intVector[3]=intD4=intD4+1;
        }
        if(StrMatriz[Cont][5].equals("5")){
        intVector[4]=intD5=intD5+1;
        }
         }
        
        System.out.print("\n\nEmpleados en cada departamento:  \n");
        
        System.out.println("\n<<Departamento 1>>= "+intVector[0]);
        System.out.println("\n<<Departamento 2>>= "+intVector[1]);
        System.out.println("\n<<Departamento 3>>= "+intVector[2]);
        System.out.println("\n<<Departamento 4>>= "+intVector[3]);
        System.out.println("\n<<Departamento 5>>= "+intVector[4]);
       
    }
    
}
