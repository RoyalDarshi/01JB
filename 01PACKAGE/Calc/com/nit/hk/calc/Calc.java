package com.nit.hk.calc;
class Calc {
    public static void main(String[] args) {
	class Addition {	    
            void add(int a,int b) {
            System.out.println("Addition is:"+(a+b)); 
            }
        }
	Addition a1=new Addition();
	a1.add(10,20);
    }
}