/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordination;

import java.util.List;
import utils.ArrayTools;

public class BubbleSort {

    public static List exec(List<Integer> list) {
        List<Integer> ordinatedList = ArrayTools.ArrayCopy(list);

        for (int i = ordinatedList.size() - 1; i >= 0; i--) {

            for (int j = i + 1; j < ordinatedList.size(); j++) {

                while ((ordinatedList.get(j)) < (ordinatedList.get(j - 1))) {
                    int aux = (ordinatedList.get(j));
                    ordinatedList.set(j, ordinatedList.get(j - 1));
                    ordinatedList.set(j - 1, aux);
                }
                
            }
        }
        return ordinatedList;
    }
}
