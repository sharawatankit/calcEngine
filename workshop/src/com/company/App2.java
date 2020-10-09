package com.company;

import java.lang.reflect.Array;
import java.util.*;

class SortByValue implements Comparator<DataPoint> {
  @Override
  public int compare(DataPoint o1, DataPoint o2) {
    return o1.value - o2.value;
  }
}

class DataPoint {
   String key;
   Integer value;

   DataPoint(String s, Integer i){
      key = s;
      value = i;
   }
}
public class App2 {
  public static void main(String ...s){
    List<DataPoint> frequencies = new ArrayList<DataPoint>();
    List text = Arrays.asList("this is a testing exercise i am not using this and i am this".split(" "));
     List l1 = new ArrayList();
      l1.add("is");
      l1.add("a");
      l1.add("this");
      l1.add("not");
      l1.add("i");
    Iterator i  = l1.iterator();
    while(i.hasNext()){
      String a = (String) i.next();
      int freq = Collections.frequency(text, a);
      System.out.println(i + "appears" + freq + "times");
      DataPoint d = new DataPoint(a, freq);
      frequencies.add(d);

    }
    Collections.sort(frequencies, Collections.reverseOrder(new SortByValue()));

    System.out.println("Results sorted");
    for (int ai = 0; ai < frequencies.size(); ai++)
      System.out.println(frequencies.get(ai).value
              + " times for word "
              + frequencies.get(ai).key);
  }
}
