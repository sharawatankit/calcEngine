package com.company.calcengine;

public class Main {

    public static void main(String[] args) {

    	MathEquation [] equation = new MathEquation[4];
    	equation[0] = new MathEquation(100,200, 'a');
    	equation[1] = new MathEquation(200,300, 'm');
    	equation[2] = new MathEquation(400,100,'s');
    	equation[3] = new MathEquation(250,5,'d');


    	for( MathEquation e: equation){
    		  e.execute();
				System.out.println( e.result);
			}

    }
}
