package com.company.arrays;

import java.util.*;

public class ItrExample {
  public static void main(String ... s){
    List list = new ArrayList();
    list.add(1);
    list.add(2);
    list.add(3);

    Iterator it = list.iterator();
    while(it.hasNext()){
      System.out.print(it.next());
    }

    ListIterator itr = list.listIterator();
    while(itr.hasNext()){
      System.out.print(itr.next());
      itr.add("s");
    }
    System.out.print(list.toString());

    Map map = new HashMap();
    map.put("a",123);
    map.put('b',43);
    System.out.print(map.toString());
  }
}
