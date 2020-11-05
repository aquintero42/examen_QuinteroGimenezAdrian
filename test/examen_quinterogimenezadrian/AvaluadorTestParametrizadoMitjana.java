/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_quinterogimenezadrian;

import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

/**
 *
 * @author Adrian
 */
@RunWith(Parameterized.class)
public class AvaluadorTestParametrizadoMitjana {
    
    private Avaluador instance;
    
    public Double mitjana;
    public Estudiant estudiant;    
    
    public AvaluadorTestParametrizadoMitjana(double mitjana, Estudiant estudiant) {
        this.mitjana = mitjana;
        this.estudiant = estudiant;
    }
    
    
    @Parameterized.Parameters
    public static List<Object[]> data() {
        Object[][] data = new Object[][] {
                {10.0, new Estudiant("Pep",10.0,10.0,10.0)},
                {7.5, new Estudiant("Arnau",7.5,7.5,7.5)},
                {5.0, new Estudiant("Adrian",5.0,5.0,5.0)},
                {0.0, new Estudiant("Fiol",0.0,0.0,0.0)},
                {4.0, new Estudiant("Dani",8.0,4.0,0.0)},
                {8.0, new Estudiant("David",8.0,8.0,8.0)},
                {9.5, new Estudiant("Juan",10.0,9.5,9.0)},
                {3.5, new Estudiant("Fran",5.0,1.5,4.0)},
                {7.0, new Estudiant("Laura",10.0,3.0,8.0)},
                {6.5, new Estudiant("Albert",9.5,5.5,4.5) },
                
        };
        return Arrays.asList(data); 
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
    public void testParametrizadoMitjana() throws Exception {
        assertEquals(mitjana, instance.mitjana(estudiant), 1.0E-2);
    }
    
}
