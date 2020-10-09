package com.company;
import java.io.Console;
import java.util.ArrayList;

public class AnalyzeInput {
  public static void main(String ... s){
    ArrayList list = new ArrayList<>();
     Console con;
     String line;
       while((con = System.console()) != null && (line = con.readLine()) != null && !line.equals("*")){
         list.add(line);
       }

       System.out.println("you typed:" + list.toString());
  }
}
