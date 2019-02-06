/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.ArrayList;

/**
 *
 * @author jgonzalezar
 */
public class Veterinaria {
    private Pet perro1 = new Dog (new License(2),"Firulais");
    private Pet perro2 = new Retriever ("Max", new License(3));
    private Pet gato1 = new Cat ("Motas");
    private ArrayList<Pet> mascotas = new ArrayList<>();
    boolean pet = mascotas.add(perro1);
}
