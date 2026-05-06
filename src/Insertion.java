import java.lang.reflect.Array;
import java.util.Arrays;

public class Insertion {
    int[] copia1;

    public Insertion(int[] arreglo, boolean ad){
        this.copia1= arreglo.clone();

        int comparaciones = 0;
        int iteraciones= 0;
        int cambios= 0;

        System.out.println(Arrays.toString(copia1));
        if (ad) {
                for (int i=1; i< copia1.length;i++){
                    iteraciones ++;
                    int valorActual= copia1[i];
                    int j = i-1;
                     
                    while(j >= 0){
                        comparaciones ++;
                        int valorIzquierda =copia1[j];
                        if(copia1[j]> valorActual){
                            copia1[j+1]=copia1[j];
                            cambios ++;
                            
                            System.out.println("Iteracion: "+ iteraciones+" "+Arrays.toString(copia1)+" "+"b="+j+"  "+"a="+i+"   "+"b[]="+valorIzquierda+"  "+"a[]="+valorActual+" "+"cambio: si");
                            j--;
                        }else{
                            System.out.println("");
                            System.out.println("cambio: no");
                            break;
                        }                       
                    }
                 copia1[j+1]=valorActual;
                 System.out.println("iteracion: "+ iteraciones+ " "+ Arrays.toString(copia1));
                }

                
           
        
            }else{
                 for (int i=1; i< copia1.length;i++){
                    iteraciones ++;
                    int valorActual= copia1[i];
                    int j = i-1;
                     
                    while(j >= 0){
                        comparaciones ++;
                        int valorIzquierda =copia1[j];
                        if(copia1[j]< valorActual){
                            copia1[j+1]=copia1[j];
                            cambios ++;
                            
                            System.out.println("Iteracion: "+ iteraciones+" "+Arrays.toString(copia1)+" "+"b="+j+"  "+"a="+i+"   "+"b[]="+valorIzquierda+"  "+"a[]="+valorActual+" "+"cambio: si");
                            j--;
                        }else{
                            System.out.println("");
                            System.out.println("cambio: no");
                            break;
                        }                       
                    }
                 copia1[j+1]=valorActual;
                 System.out.println("iteracion: "+ iteraciones+ " "+ Arrays.toString(copia1));
                }

             
        }
        System.out.println("");
        System.out.println(Arrays.toString(copia1));
        System.out.println("");
        System.out.println("Comparaciones: "+ comparaciones);
        System.out.println("Iteraciones: "+iteraciones);
        System.out.println("Cambios: "+cambios);
        
        
    }
}
