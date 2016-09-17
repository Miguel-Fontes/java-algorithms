/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathematics;

/**
 *
 * @author Miguel
 */
public class SquareRoot {

    public static double bisection(Integer operand, double precision) {
        double average = 0;
        double upperLimit = operand * operand;
        double lowerLimit = 0;

        while (upperLimit - lowerLimit > precision) {
            average = (lowerLimit + upperLimit) / 2;

            if (average * average > operand) {
                upperLimit = average;
            } else {
                lowerLimit = average;
            }
            
        }
        return average;
    }
}
