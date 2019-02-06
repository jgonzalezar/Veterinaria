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
public abstract  class Pet implements iSpeaking {
    private String name;
    
    public Pet (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
}
