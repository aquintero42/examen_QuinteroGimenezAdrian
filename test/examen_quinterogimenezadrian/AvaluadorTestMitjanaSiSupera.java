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
public class AvaluadorTestMitjanaSiSupera {
    
    private Avaluador instance;
    
    public AvaluadorTestMitjanaSiSupera() {
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
        assertNotNull("instància és nul·la", instance);
    }    
    
    /**
     * En este test probaremos a introducir las notas de forma
     * que la media estará por debajo del valor de notaSupera
     */
    
    @Test
    public void testMitjanaSiSupera() throws Exception {
        assertEquals(7.0, instance.mitjanaSiSupera(new Estudiant ("Adrian",7.4,9.2,4.4)), 1.0E-2);
    }

    /**
     * En este test probaremos a introducir las notas de forma 
     * que la media estará por encima del valor de notaSupera
     */    
    
    @Test
    public void testMitjanaSiSupera2() throws Exception {
        assertEquals(6.5, instance.mitjanaSiSupera(new Estudiant ("Fiol",8.2,6.2,5.1)), 1.0E-2);
    }  
    
    /**
     * En este test probaremos a introducir un valor 'null' para demostrar que no se puede añadir un estudiante
     * nulo y nos devuelve la excepción.
     */
    
    @Test
    public void testMitjanaSiSupera3() throws Exception {
        instance.mitjanaSiSupera(null);
    }
    
}
