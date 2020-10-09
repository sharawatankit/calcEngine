package com.company.arrays;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListExample {

  public static void main(String ... s){
    List<Integer> list = new ArrayList();
    list.add(20);
    //list.add("abc");
    list.add(5);
    System.out.print(list.toString());
    System.out.println((list.indexOf(20)));
  }
}
