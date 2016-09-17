/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.ArrayList;
import java.util.List;
import mathematics.GCD;
import mathematics.SquareRoot;
import ordination.BubbleSort;

public class JavaAlgoritmos {

    public static void main(String[] args) {
        
        // Put those at JUNIT tests
        List<Integer> lista = new ArrayList();
        lista.add(3);
        lista.add(1);
        lista.add(5);
        lista.add(4);
        lista.add(2);

        System.out.println("\n--> Bubble Sort");
        System.out.println("> Original: " + lista);
        System.out.println("> Ordenado: " + BubbleSort.exec(lista));

        
        System.out.println("\n--> Square Root");
        double operand = 100;
        double squareRoot = SquareRoot.bisection(Integer.valueOf(100), 1.0E-6D);
        System.out.println("Bissection Square Root for " + operand + " = " + squareRoot + ", witch rounding equals " + Math.round(squareRoot));

        
        System.out.println("\n--> Mathematics");
        Integer a = 232;
        Integer b = 522;
        double gcd = GCD.euclids(a, b);
        System.out.println("Greatest Common Divisor for (" + a + ", " + b + ") equals " + gcd);
    }
}
