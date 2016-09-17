/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordination;

import java.util.List;
import utils.ArrayTools;

public class BubbleSort
{
  public static List exec(List<Integer> lista)
  {
    List<Integer> listaOrdenada = ArrayTools.ArrayCopy(lista);
    for (int i = listaOrdenada.size() - 1; i >= 0; i--) {
      for (int j = i + 1; j < listaOrdenada.size(); j++) {
        while (((Integer)listaOrdenada.get(j)).intValue() < ((Integer)listaOrdenada.get(j - 1)).intValue())
        {
          int aux = ((Integer)listaOrdenada.get(j)).intValue();
          listaOrdenada.set(j, listaOrdenada.get(j - 1));
          listaOrdenada.set(j - 1, Integer.valueOf(aux));
        }
      }
    }
    return listaOrdenada;
  }
}
