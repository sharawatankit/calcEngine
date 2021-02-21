package com.company.calcengine;

public class MathEquation {



  public MathEquation(){ }

  public MathEquation(double lv, double rv, char op){
    leftValue = lv;
    rightValue = rv;
    opCode = op;
  }

  public void execute(){
    System.out.println(opCode);
    switch(opCode){
      case 'a':
        result = leftValue + rightValue;
        break;
      case 's':
        result = leftValue - rightValue;
        break;
      case 'd':
        result = leftValue / rightValue;
        break;
      case 'm':
        result = leftValue * rightValue;
        break;
      default:
        result = 0.0;
        System.out.println("Invalid opcode");

    }
  }

}
