package Test;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.Before;
import org.junit.Rule;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import src.Dane;
import src.Fabryka;
import src.Sprzet;

import static org.junit.Assert.*;
import java.util.IllegalFormatCodePointException;

@Category({TestControl.class, TestEntity.class})
public class FabrykaTest {
    Dane dane;
    
    @Rule
    public ExpectedException exception = ExpectedException.none();
    
    @Before
    public void setUp(){
        dane = new Dane();
    }
    
    @Test
    public void testWykonajSprzet(){
        System.out.println("wykonajSprzet");
        Fabryka instance = new Fabryka();
        for (int i = 0; i < 6; i++){
            Sprzet result = instance.wykonajSprzet(dane.daneSprzetow[i]);
            assertEquals(dane.sprzety[i], result);
        }
        exception.expect(IllegalFormatCodePointException.class);
        exception.expectMessage("Code point = 0x0");
        instance.wykonajSprzet(dane.daneSprzetow[6]);
    }
    
    
}
