package com.company.arrays;

import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

public class Example01 {
  public static void main(String ... s){
    String [] text = {"this", "is" , "a", "b" ,"c", "d", "a"};
    Set st = new HashSet<>(Arrays.asList(text));
    System.out.println(st.toString());

  }
}
