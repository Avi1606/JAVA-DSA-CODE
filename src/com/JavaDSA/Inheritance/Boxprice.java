package com.JavaDSA.Inheritance;

public class Boxprice extends Boxweight{
    double cost;

     Boxprice(){
        this.cost=-1;
    }
    Boxprice(double l,double h , double w, double weight , double cost){
        super(l,h,w,weight);
         this.cost=cost;
    }
}
