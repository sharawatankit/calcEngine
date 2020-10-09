package com.company.arrays;

import java.util.*;

public class AnalyzeInput2 {
  public static void main(String ... si){
    ArrayList  s = new ArrayList<>();
    s.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6 }
    ));
    Set st = new HashSet<>();
    st.addAll(s);

    Iterator it = st.iterator();
    while (it.hasNext()){
      System.out.print(Collections.frequency(s,it.next()));
    }
  }
}
