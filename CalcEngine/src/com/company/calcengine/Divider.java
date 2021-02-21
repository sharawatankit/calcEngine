package com.company.calcengine;

public class Divider extends CalculateBase{

  public Divider(){}

  public Divider(double a, double b){
    super(a,b);
  }

  @Override
  public void calculate(){
    setResult(getLeftValue() / getRightValue());
  }

}
