package com.company;

import javax.swing.text.html.HTMLDocument;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropetyExample {
  public static void main(String ... s){
    Properties pr = new Properties();
    pr.put("os","mac");
    pr.put("Ram", "4 gb");
    pr.list(System.out);
    Set setofkeys = pr.keySet();
    Iterator it = setofkeys.iterator();
    while(it.hasNext())
    {
      String key = (String) it.next();
      System.out.println(key + "---" + pr.getProperty(key));
    }
    System.out.println(pr.getProperty("xyz", "not found"));
    Enumeration er = pr.propertyNames();
    while(er.hasMoreElements()){
      System.out.println("er" + er.nextElement());
    }
    String oldValue = (String) pr.setProperty("o1s", "German");
    System.out.println(oldValue);
    System.out.println(pr.getProperty("o1s"));
  }
}