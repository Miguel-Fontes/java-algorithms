/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utils;

/**
 *
 * @author Miguel
 */

import java.util.ArrayList;
import java.util.List;

public class ArrayTools
{
  public static List ArrayCopy(List<Integer> lista)
  {
    List<Integer> novaLista = new ArrayList();
    for (Integer item : lista) {
      novaLista.add(item);
    }
    return novaLista;
  }
}
