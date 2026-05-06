import java.util.Arrays;

public class Shell {

    int[] copia2;

    public Shell(int[] arreglo, boolean ad){
        this.copia2= arreglo.clone();

        int comparaciones2=0;
        int iteraciones2=0;
        int cambios2=0;

            System.out.println("METODO SHELL");
            System.out.println("Arreglo Original");
            System.out.println(Arrays.toString(copia2));

        if(ad){
           

            int tam= copia2.length;

            for(int gap = tam/2; gap>0 ; gap /=2){

                System.out.println("Gap: "+gap);

                for(int i = gap; i<tam; i++){
                   iteraciones2++;
                   int valorActual = copia2[i];
                   int j=i;

                   while(j >= gap ){
                    comparaciones2++;
                    int valorIzquierda = copia2[j];
                    if(copia2[j - gap]>valorActual){
                        
                        cambios2++;
                    copia2[j] = copia2[j - gap];
                    j -= gap;
                    System.out.println("Iteraciones: " + iteraciones2 + "  " + Arrays.toString(copia2) + "   gap=" + gap + "  i=" + i + "  j=" + j + "  [i]=" + valorActual + "  [j]=" + valorIzquierda + "  cambio=si");
                    }else{
                        System.out.println("Iteraciones: " + iteraciones2 + "  " + Arrays.toString(copia2) + "   gap=" + gap + "  i=" + i + "  j=" + j + "  [i]=" + valorActual + "  [j]=" + valorIzquierda + "  cambio=no");
                        break;
                    }
                   }
                   copia2[j] = valorActual;
                }
            }
        }else{

             int tam= copia2.length;

            for(int gap = tam/2; gap>0 ; gap /=2){

                System.out.println("Gap: "+gap);

                for(int i = gap; i<tam; i++){
                   iteraciones2++;
                   int valorActual = copia2[i];
                   int j=i;

                   while(j >= gap ){
                    comparaciones2++;
                    int valorIzquierda = copia2[j];
                    if(copia2[j - gap]<valorActual){
                        
                        cambios2++;
                    copia2[j] = copia2[j - gap];
                    j -= gap;
                    System.out.println("Iteraciones: " + iteraciones2 + "  " + Arrays.toString(copia2) + "   gap=" + gap + "  i=" + i + "  j=" + j + "  [i]=" + valorActual + "  [j]=" + valorIzquierda + "  cambio=si");
                    }else{
                        System.out.println("Iteraciones: " + iteraciones2 + "  " + Arrays.toString(copia2) + "   gap=" + gap + "  i=" + i + "  j=" + j + "  [i]=" + valorActual + "  [j]=" + valorIzquierda + "  cambio=no");
                        break;
                    }
                   }
                   copia2[j] = valorActual;
                }
            }

        }

        System.out.println(Arrays.toString(copia2));
        System.out.println("");
        
       
        System.out.println("Comparaciones: "+comparaciones2);
        System.out.println("Iteraciones: "+iteraciones2);
        System.out.println("Cambios: "+cambios2);


    }
    
}
