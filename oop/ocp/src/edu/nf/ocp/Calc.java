package edu.nf.ocp;

public class Calc {

    public double cal(double a,double b,String option){
        if("+".equals(option)){
            return a+b;
        }else if("-".equals(option)){
            return a-b;
        }else {
            return 0;
        }
    }
    public double add(double a,double b){
        return a+b;
    }
    public double sub(double a,double b){
        return a-b;
    }
}
