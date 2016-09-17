/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathematics;

public class GCD {

    public static double euclids(Integer a, Integer b) {
        double m = a, n = b, remainder = -1;
        
        while (remainder != 0) {
            remainder = m % n;
            m = n;
            n = remainder;
        }
        return m;
    }
}
