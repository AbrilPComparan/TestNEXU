package JAVA;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner; 

public class problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(2);
        list.add(9);
        list.add(4);
        list.add(4);
        list.add(5);
        Collections.sort(list); //Para acomodar la lista de menor a mayor
        int x = 0;
        int y = 0;
        int a = 0;

        for( int i= 0; i<N-1; i++ ){ //Aqui se hace la longitud del arreglo

            x = list.get(i); 
            y = list.get(i+1);

            if (x != y) { 
                x = y;

            } else{
                a = x;
            }
        }

        if(a > 0){
            System.out.println(a);

        }else{
            System.out.println(x);
        }

        input.close();
    }
}
