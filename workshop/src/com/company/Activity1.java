package com.company;

public class Activity1 {
  public static void main(String ... s){
    int sbp = Integer.parseInt(s[0]);
    int dbp = Integer.parseInt(s[1]);
    if(sbp > 90 && sbp < 120)
      System.out.println("Ideal");
    else if(sbp <= 90)
      System.out.println("low");
    else if (dbp > 120 && dbp < 140)
      System.out.println("pre high");
    else if (dbp > 140)
      System.out.println("hight");

  }
}
