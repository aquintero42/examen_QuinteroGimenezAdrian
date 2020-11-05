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
public class AvaluadorTestMitjana {
    
    private Avaluador instance;
    
    public AvaluadorTestMitjana() {
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
    public void setUp() {
        instance = new Avaluador();
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
     * Test of mitjanaSiSupera method, of class Avaluador.
     */
    @Test
    public void testMitjana() throws Exception {
        assertEquals(5.0, instance.mitjana(new Estudiant ("Arnau",10.0,5.0,0.0)), 1.0E-2);
    }

    @Test
    public void testMitjana2() throws Exception {
        instance.mitjana(null);
    }
    
}
