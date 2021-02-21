package com.company.calcengine;

public class Adder extends CalculateBase {
  public Adder(){}

  public Adder(double lv, double rv) {
     super(lv,rv);
  }

  @Override
  public void calculate() {
    setResult(getLeftValue() + getRightValue());
  }
}
