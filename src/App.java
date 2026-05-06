import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
       
        Scanner leer = new Scanner(System.in); 
        int opcion1=1;
        do{ 
            System.out.println("PROGRAMA DE ORDENAMIENTO");

            System.out.println("1.Ejecutar Ordenamientos");
            System.out.println("2.Salir");
            
            System.out.println("Elija una opcion");
            try {
                 opcion1 = leer.nextInt();
            
            
            
            switch (opcion1) {
                case 1:
                    boolean opcion2;
                    boolean opcion3;
                     System.out.println("Insertion");
                     System.out.println("Ascendente");
                     opcion2= leer.nextBoolean();
                   
                     System.out.println("Shell");
                     System.out.println("Ascendente");
                     opcion3= leer.nextBoolean();
                    
                     int [] arreglo1 = {12,-7,25,0,-15,33,19,-22,5,48,-3};
                    

                     System.out.println("RESULTADOS");
                     System.out.println("");
                     System.out.println("Insertion");
                     Insertion insertion = new Insertion(arreglo1,opcion2);
                     System.out.println("");
                     System.out.println("Shell");
                    Shell shell = new Shell(arreglo1,opcion3);


                    break;
            
                case 2:
                    System.out.println("Saliendo");
                    break;
                default :
                  System.out.println("Opcion no valida");
                  break;
            }
            } catch (Exception e) {
                System.out.println("Lo que usted ingreso no es un nuemero");
                leer.nextLine();
                opcion1=0;
            }
        }while(opcion1!=2);

    }

   
}
