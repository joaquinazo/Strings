package StringUno;

import java.util.StringTokenizer;

/**
 * Created by Joaquin on 22/1/16.
 */
public class ejercicio {
    public static void main(String[] args) {
        StringTokenizer str;
        str = new StringTokenizer("Uno|dos|tres|perico");
        System.out.println("la cadena str tiene " + str.countTokens() + " elementos");
        while (str.hasMoreTokens()) {
            System.out.println(str.nextToken());
        }
        String str1 = "Hola que tal";
        String [] partes1 = str1.split(" ");
        System.out.println(partes1[1]);


    }


}
