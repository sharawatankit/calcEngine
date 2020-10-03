package com.company;

public class Exercise08 {
  public static void main(String... s){
    int season = 2;
    String message= "";

    switch(season){
      case 1: message = "Spring";
      break;
      case 2: message = "Summer";
      break;
      case 3: message = "Fall";
      break;
      case 4: message = "Winter";
      break;
      default: message = "this is not a season";
      break;
    }
  System.out.println(message);
  }
}
