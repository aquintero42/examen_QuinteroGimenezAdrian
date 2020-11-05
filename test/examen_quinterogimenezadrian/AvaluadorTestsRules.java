/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_quinterogimenezadrian;

import java.security.InvalidParameterException;
import org.hamcrest.CoreMatchers;
import org.hamcrest.core.Is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.rules.ExternalResource;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;

/**
 *
 * @author Adrian
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AvaluadorTestsRules {
    
    private Avaluador instance;
    
    @Rule
    public final ExpectedException thrown = ExpectedException.none();

    @Rule
    public Timeout globalTimeout = Timeout.millis(150);

    @Rule
    public final ExternalResource externalResource = new ExternalResource() {
        @Override
        protected void before() throws Throwable {
            System.out.println("en before de external resource");
        }

        ;
	    
	    @Override
        protected void after() {
            System.out.println("en after de external resource");
        }
    ;

    };    
    
    public AvaluadorTestsRules() {
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
    
    @Test
    public void testMitjana() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectCause(CoreMatchers.isA(IllegalAccessException.class));
        thrown.expectMessage("No puede haber números negativos");        
        assertEquals(5.0, instance.mitjana(new Estudiant ("Arnau",-10.0,-2.5,-3.0)), 1.0E-2);
    }

    @Test
    public void testMitjana2() throws Exception {       
        instance.mitjana(new Estudiant("Adrian",-2.0,-5.0,-10.0));
    }

    @Test
    public void testMitjanaSiSupera() throws Exception {      
        assertEquals(7.0, instance.mitjanaSiSupera(new Estudiant ("Adrian",7.4,9.2,4.4)), 1.0E-2);
    }
    
    @Test
    public void testMitjanaSiSupera2() throws Exception {       
        assertEquals(6.5, instance.mitjanaSiSupera(new Estudiant ("Fiol",8.2,6.2,5.1)), 1.0E-2);
    }
    
    @Test
    public void testMitjanaSiSupera3() throws Exception {    
        instance.mitjanaSiSupera(null);
    }    
    
}
