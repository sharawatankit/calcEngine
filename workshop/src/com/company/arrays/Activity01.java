package com.company.arrays;

public class Activity01 {
  public static void main(String ... s){
    String[] text = {"So", "many", "books", "so", "little", "time"};
    String text_to_search = "so";
    int occurence = -1;
    for(int i=0; i< text.length; i++){
      if(text_to_search.compareToIgnoreCase(text[i]) == 0)
        System.out.println("query found at " + i);
    }
  }
}
