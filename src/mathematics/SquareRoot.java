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
        double average = 0.0D;

        double upperLimit = operand.intValue() * operand.intValue();
        double lowerLimit = 0.0D;
        while (upperLimit - lowerLimit > precision) {
            average = (lowerLimit + upperLimit) / 2.0D;
            if (average * average > operand.intValue()) {
                upperLimit = average;
            } else {
                lowerLimit = average;
            }
        }
        return average;
    }
}
