package com.company;

public class Exercise009 {
  public static void main(String [] s){
    int tempAdujstment = 0;
    String taste = "too hot";

    switch(taste){
      case "too cold" : tempAdujstment +=1;
      case "way too hot" : tempAdujstment-=1;
      case "too hot" : tempAdujstment -=1;
      break;
      default:
        break;

    }
    System.out.print("Temp Adjustment" + tempAdujstment);
  }

}
