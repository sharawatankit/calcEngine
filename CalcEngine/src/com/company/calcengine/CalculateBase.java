package com.company.calcengine;

public abstract class CalculateBase {
  private double leftValue;
  private double rightValue;
  private double result;


  public void setLeftValue(double value) { this.leftValue = value; }
  public double getLeftValue() { return leftValue; }

  public void setRightValue(double rightValue) { this.rightValue = rightValue; }
  public double getRightValue() { return rightValue; }

  public double getResult(double r) { return result; }
  public void setResult(double r) { this.result = r; }


  public  CalculateBase() {}
  public CalculateBase(double lv, double rv){
    this.leftValue = lv;
    this.rightValue = rv;
  }

  public abstract void calculate();
}
