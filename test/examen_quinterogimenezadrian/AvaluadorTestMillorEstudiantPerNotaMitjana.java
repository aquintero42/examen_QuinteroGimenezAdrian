/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_quinterogimenezadrian;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Adrian
 */
public class AvaluadorTestMillorEstudiantPerNotaMitjana {
    
    private Avaluador instance;
    
    public AvaluadorTestMillorEstudiantPerNotaMitjana() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Iniciando test AvaluadorTest1...");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Acabando test AvaluadorTest1...");
    }
    
    @Before
    public void setUp() throws Exception {
        instance = new Avaluador();
        
        instance.mitjana(
                new Estudiant("Adrian",7.4,9.2,4.4));
        instance.mitjana(
                new Estudiant("Arnau",10.0,5.0,.0));
        instance.mitjana(
                new Estudiant("Fiol",8.2,6.2,5.1));        
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    @Test
    public void testInstance() {
        assertNotNull("Instància és nul·la", instance);
    }  

    /**
     * Test of millorEstudiantPerNotaMitjana method, of class Avaluador.
     */
    @Test
    @Ignore
    public void testMillorEstudiantPerNotaMitjana() {
    }
    
    @Test
    public void testMillorEstudiantPerNotaMitjana2() {
        instance.millorEstudiantPerNotaMitjana(null);
    }    
    
}
