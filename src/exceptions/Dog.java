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
public class Dog extends Pet implements iLicensable {
    private License licencia;
    @Override
    public License getLicence() {
        return null;
     
    }

    public Dog(License licencia, String name) {
        super(name);
        this.licencia = licencia;
    }
    
    
    public void speak() {
        System.out.println("woof");
    }
    
}
