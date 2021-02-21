package com.company.calcengine;

public class Subtractor extends CalculateBase  {

  public Subtractor(){}

  public Subtractor(double lv, double rv) {
    super(lv,rv);
  }

  @Override
  public void calculate(){
    setResult(getLeftValue() - getRightValue());
  }
}
