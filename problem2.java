package JAVA;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        int N;  
        Scanner list =new Scanner(System.in);  
        System.out.print("Ingresa el largo del arreglo ");   
        N = list.nextInt();  
        ArrayList<Integer> resta = new ArrayList<Integer>();
        int[] array = new int[N];  
        int dmenor = 0;
        
        System.out.println("Ingresa los elementos del arreglo ");  
        
        for(int i=0; i<N; i++){ //Aqui se escanea todo el arreglo
            array[i]=list.nextInt();
            }

            
            for(int i=0;i<N-1;i++){ 

                if((array[i+1]-array[i]) > 0) {
                dmenor = array[i+1] - array[i];
                resta.add(dmenor);
                }
            }
            
            Collections.sort(resta);

            System.out.println(resta.get(0));
        

        list.close();
        }  
}












































