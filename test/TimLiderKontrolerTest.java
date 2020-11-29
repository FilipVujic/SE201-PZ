/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entiteti.Korisnik;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Filip
 */
public class TimLiderKontrolerTest {
    
    public TimLiderKontrolerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testKreiranjaKorisnika() {

        Korisnik k1 = new Korisnik();
        Korisnik k2 = new Korisnik();
        
        k1.setEmailKorisnika("filip@hotmail.com");
//        k2.setEmailKorisnika("filip@hotmail.com");
        k2.setEmailKorisnika("katarina@hotmail.com");
        
        boolean postoji = false;
        
        if(k1.getEmailKorisnika().equals(k2.getEmailKorisnika())) {
            postoji = true;
        }
        
        assertEquals(false, postoji);
    }
}
