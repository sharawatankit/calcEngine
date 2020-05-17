package com.company;

public class Exercise09 {

  public static void main(String... s){
    String cat = new String("cat");
    String dog = new String("dog");
    if (cat.equals(dog)) {
      System.out.println("Cats and dogs are the same.");
    }
    if (!cat.equals(dog)) {
      System.out.println("Cats and dogs are not the same.");
    }
    if (dog == (dog)) {
      System.out.println("Dogs are dogs.");
    }
    // Using literal strings
    if (dog == ("dog")) {
      System.out.println("Dogs are dogs.");
    }
    // Can compare using a literal string, too.
    if ("dog".equals(dog)) {
      System.out.println("Dogs are dogs.");
    }


  }
}
