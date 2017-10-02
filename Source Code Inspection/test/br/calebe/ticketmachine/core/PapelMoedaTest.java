/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.ticketmachine.core;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ellias Matheus
 */
public class PapelMoedaTest {
    
    public PapelMoedaTest() {
    }
    
   

    
    /**
     * Test of getValor method, of class PapelMoeda.
     */
    @Test
    public void testGetValor() {
        PapelMoeda papel = new PapelMoeda(2,5);
        System.out.println("getValor");
        int expResult = 2;
        int result = papel.getValor();
        assertEquals(expResult, result);
    }

    /**
     * Test of getQuantidade method, of class PapelMoeda.
     */
    @Test
    public void testGetQuantidade() {
        PapelMoeda papel = new PapelMoeda(2,5);
        System.out.println("getQuantidade");
        int expResult = 5;
        int result = papel.getQuantidade();
        assertEquals(expResult, result);
    }
    
}
