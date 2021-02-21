package com.company.calcengine;

public class Multiplicator extends  CalculateBase {

  public Multiplicator(){}

  public Multiplicator(double a, double b){
    super(a,b);
  }

  @Override
  public void calculate(){
    setResult(getLeftValue()* getRightValue());
  }
}
