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
public class Retriever extends Dog{
    public Retriever(String name, License Licencia){
        super(Licencia, name);
    }
    
    @Override
    public void speak(){
        
    }
    public Bird retrieve(){
    return new Bird();
}
    
}
