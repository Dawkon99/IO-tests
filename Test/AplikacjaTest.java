package Test;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.IllegalFormatCodePointException;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;
import org.junit.runners.MethodSorters;
import src.Aplikacja;
import src.Dane;
import src.Klient;
import src.Sprzet;

@Category({TestControl.class, TestEntity.class})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AplikacjaTest {
    static Dane dane;
    static Aplikacja instance;
    
    @Rule
    public ExpectedException exception = ExpectedException.none();
    
    @BeforeClass
    static public void SetUp(){
        instance = new Aplikacja();
        dane = new Dane();
    }
    
    @Test
    public void test1DodajKonto(){
        System.out.println("DodajKonto");
        for (int i = 0; i < 4; i++){
            instance.utworzKonto(dane.uzytkownicy[i][0], dane.uzytkownicy[i][1], dane.uzytkownicy[i][2],
                    dane.uzytkownicy[i][3], dane.uzytkownicy[i][4]);
            int ile1 = instance.getUzytkownicy().size();
            instance.utworzKonto(dane.uzytkownicy[i][0], dane.uzytkownicy[i][1], dane.uzytkownicy[i][2],
                    dane.uzytkownicy[i][3], dane.uzytkownicy[i][4]);
            int ile2 = instance.getUzytkownicy().size();
            
            instance.stworzRezerwacje((Klient)instance.getUzytkownicy().get(i), dane.numeryRezerwacji[i],
                    dane.datyRezerwacji[i], dane.sprzety[i]);
            
            assertEquals(ile1, ile2);
        }
    }
    
    @Test
    public void test2DodajSprzet(){
        System.out.println("DodajSprzet");
        for (int i = 0; i < 6; i++){
            instance.dodajSprzet(dane.daneSprzetow[i]);
            Sprzet sprzet = instance.getSprzety().get(instance.getSprzety().size() - 1);
            assertEquals(sprzet, dane.sprzety[i]);
        }
        exception.expect(IllegalFormatCodePointException.class);
        exception.expectMessage("Code point = 0x0");
        instance.dodajSprzet(dane.daneSprzetow[6]);
    }
    
    @Test
    public void test3ObliczCeneRezerwacji(){
        System.out.println("ObliczCeneRezerwacji");
        
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 7; j++){
                assertEquals(instance.obliczCeneRezerwacji(dane.numeryRezerwacji[i]),
                        dane.cenySprzetowNetto[i], 0F);
            }
        }
    }
    
  
}
