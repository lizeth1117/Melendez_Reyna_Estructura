
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author lizet
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion, contador1=0, contador2=0, contador3=0, contador4=0;
        int voto, azul=0, negro=0, amarillo=0, rojo=0, nulo=0, suma=0 ;
        String palabra ;
        double votantes ;
        Scanner entrada=new Scanner(System.in);
       
        do{
        System.out.println("Seleccione una opcion del menu.\n1. Palabras al reves "
                + "\n2. Numero Perfecto \n3. Primos \n4. Votaciones \n5. Salir");
        opcion= entrada.nextInt();
        
        
        switch(opcion){
            case 1-> {
                System.out.println("Ingrese una palabra.");
                  palabra=  entrada.next();
                  System.out.println(palabra.length());
                for (int i = palabra.length()-1; i >=0 ; i--) {
                    System.out.print(palabra.charAt(i));
                    System.out.println(" ");
                }
            }
            case 2-> { //numero perfecto
                int nperfecto, sumadivisores=0, i=1;
                System.out.println("Ingrese el numero que desea verificar");
                nperfecto= entrada.nextInt();
                do{
                    if (nperfecto%i==0){
                        sumadivisores+=i;
                
                }
                i++;
                }
                while(i<=nperfecto/2);
                if (sumadivisores==nperfecto)
                System.out.println(nperfecto+"es un numero perfecto");
                else 
                     System.out.println(nperfecto+"no es un numero perfecto");
            } //fin case 2
            case 3 -> { //primos
                int num1;
                
                System.out.println("Ingrese el Numero");
                num1=entrada.nextInt();
                if (num1==2){
                    System.out.println("El numero si es primo");
                }
                else{
                for (int i = 1; i < num1; i++) {
                    int cero = num1%i;
                    if (cero==0)
                        suma=suma+1;
                }
                if (suma<2)
                    System.out.println("El numero es primo");
                else
                    System.out.println("el numero no es primo");
                }
            } //fin case 3
   
            case 4 -> { //votacines
                System.out.println("Ingrese cuantos votantes hay en el pais.");
                votantes=entrada.nextDouble();
                for (int i = 0; i < votantes; i++) {
                    System.out.println("Ingrese el voto "+(i+1)+"\n1. Azul \n2. Rojo \n3. Negro \n4. Amarillo ");
                    voto=entrada.nextInt();
                    if (voto==1)
                        azul+=1 ;
                    else if (voto==2)
                        rojo+=1;
                    else if (voto==3)
                        negro+=1;
                    else if(voto==4)
                        amarillo+=1;
                    else
                        nulo+=1 ;
                }
                System.out.println("Azul tiene "+azul+" votos\nRojo tiene "+rojo+" votos\nNegro tiene "+negro+" votos"
                        + "\nAmarillo tiene "+amarillo+" votos\nTotal de votos nulos "+nulo);
                if (((amarillo/votantes)*100)>=60)
                    System.out.println("El Ganador fue el partido Amarillo");
                else if (((azul/votantes)*100)>=60)
                    System.out.println("El Ganador fue el partido Azul");
                else if (((rojo/votantes)*100)>=60)
                    System.out.println("El Ganador fue el partido Rojo");
                else if (((negro/votantes)*100)>=60)
                    System.out.println("El Ganador fue el partido Negro");
                
                else 
                    System.out.println("Votacion falliida");
            }
            case 5 -> {
                System.out.println("la opcion 1. se uso "+contador1+" veces.");
                System.out.println("la opcion 2. se uso "+contador2+" veces.");
                System.out.println("la opcion 3. se uso "+contador3+" veces.");
                System.out.println("la opcion 4. se uso "+contador4+" veces.");
            }

        }  // final de switch
        if (opcion==1)
            contador1=(contador1+1);
        if (opcion==2)
            contador2=(contador2+1);
        if (opcion==3)
            contador3=(contador3+1);
        if (opcion==4)
            contador4=(contador4+1);
        
        } // final de do
        while(opcion!=5);
        
    
        
    }  //final de main
    
}   // final de class
