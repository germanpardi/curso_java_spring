/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import beans.Animal;

/**
 *
 * @author Admin
 */
public interface ICarnivoro {
    
    public String comerCarne(ICarnivoro ic);
    public String nombrar();
}
