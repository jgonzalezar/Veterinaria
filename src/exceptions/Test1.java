/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author jgonzalezar
 */

    public class Test1{
        
        public Test1(){
            divideByZero();
        }
    public void divideByZero(){
        try{
            int c = 0;
            for (int i = 0; i < 10; i++) {
                c = 5/0;
                System.out.println("Punto de control 1");
            }
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
            System.out.println("Punto de control 2");
        }
    
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Test1();
    }
    }


