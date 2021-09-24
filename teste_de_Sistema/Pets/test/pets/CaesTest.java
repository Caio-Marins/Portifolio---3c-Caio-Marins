/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SESI_SENAI
 */
public class CaesTest {
    Caes instance;
    
    public CaesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Caes("PitbullPOze",10);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of falar method, of class Caes.
     */
    @Test
    public void testFalar() {
        System.out.println("falar");
        String mensagem = "O dia ta lindo, clima insorarado";
        String expResult = "Cahorro n fala";
        String result = instance.falar(mensagem);
        assertEquals(expResult, result);
    }

    /**
     * Test of andar method, of class Caes.
     */
    @Test
    public void testAndar() {
        System.out.println("andar");
        int num_passos = 500;
        boolean expResult = true;
        boolean result = instance.andar(num_passos);
        assertEquals(expResult, result);
    }

    /**
     * Test of comer method, of class Caes.
     */
    @Test
    public void testComer() {
        System.out.println("comer");
        instance.comer();
        String expResult = "satisfeito";
        String result = instance.humor;
        assertEquals(expResult, result);
    }

    /**
     * Test of dormir method, of class Caes.
     */
    @Test
    public void testDormir() {
        System.out.println("dormir");
        instance.humor = "cansado";
        boolean expResult = true;
        boolean result = instance.dormir();  
        assertEquals(expResult, result);
      
    }
     @Test
    public void testFalar2() {
        System.out.println("falar2");
        String mensagem = "auau";
        String expResult = mensagem;
        String result = instance.falar(mensagem);
        assertEquals(expResult, result);
    }
      @Test
    public void testDormir2() {
        System.out.println("dormir2");
        instance.humor = "animado";
        boolean expResult = false;
        boolean result = instance.dormir();  
        assertEquals(expResult, result);
      
    }
}
