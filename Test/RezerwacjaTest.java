package Test;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.FixMethodOrder;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;
import src.Dane;
import src.Rezerwacja;
import src.Sprzet;


@Category({TestEntity.class})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Parameterized.class)
public class RezerwacjaTest {
    static Dane dane = new Dane();
    static Rezerwacja instances[];
    
    @Parameterized.Parameter
    public Sprzet[][] sprzety1;
    @Parameterized.Parameters
    public static Collection<Object[][][]> data(){
        Object[][][][] data1 = new Sprzet[][][][]{{
            {
                { new Sprzet(dane.daneSprzetow[0][0], Float.parseFloat(dane.daneSprzetow[0][1]), dane.daneSprzetow[0][2]),
                    new Sprzet(dane.daneSprzetow[1][0], Float.parseFloat(dane.daneSprzetow[1][1]), dane.daneSprzetow[1][2]),
                    new Sprzet(dane.daneSprzetow[2][0], Float.parseFloat(dane.daneSprzetow[2][1]), dane.daneSprzetow[2][2]),
                    new Sprzet(dane.daneSprzetow[3][0], Float.parseFloat(dane.daneSprzetow[3][1]), dane.daneSprzetow[3][2]),
                    new Sprzet(dane.daneSprzetow[4][0], Float.parseFloat(dane.daneSprzetow[4][1]), dane.daneSprzetow[4][2])},
                {new Sprzet(dane.daneSprzetow[3][0], Float.parseFloat(dane.daneSprzetow[3][1]), dane.daneSprzetow[3][2]),
                new Sprzet(dane.daneSprzetow[5][0], Float.parseFloat(dane.daneSprzetow[5][1]), dane.daneSprzetow[5][2]),
                new Sprzet(dane.daneSprzetow[4][0], Float.parseFloat(dane.daneSprzetow[4][1]), dane.daneSprzetow[4][2]),
                new Sprzet(dane.daneSprzetow[2][0], Float.parseFloat(dane.daneSprzetow[2][1]), dane.daneSprzetow[2][2]),
                new Sprzet(dane.daneSprzetow[0][0], Float.parseFloat(dane.daneSprzetow[0][1]), dane.daneSprzetow[0][2])},
                                    
            
            }}};
        return Arrays.asList(data1);
    }
    
    @BeforeClass
    public static void SetUp(){
        instances = new Rezerwacja[2];
        instances[0] = new Rezerwacja(1, "12.01.2021 14:00");
        instances[1] = new Rezerwacja(2, "06.01.2021 18:00");
    }
    
    @Test
    public void test1ZarezerwujSprzet(){
        System.out.println("zarezerwujSprzet");
        for (int i=0; i < 2; i++){
            for (int j = 0; j < 5; j++){
                instances[i].zarezerwujSprzet(sprzety1[i][j]);
                Sprzet sprzet1 = instances[i].getSprzety().get(j);
                assertSame(sprzet1, sprzety1[i][j]);
            }
        }
    }
    
    @Test
    public void test2ObliczWartoscRezerwacji(){
        System.out.println("obliczWartoscRezerwacji");
        for (int i=0; i<2;i++){
            for (int j=0; j<5;j++){
                assertEquals(dane.cenyKategorie[i][j],
                        instances[i].obliczWartoscRezerwacji(), 0F);
            }
        }
    }

}
