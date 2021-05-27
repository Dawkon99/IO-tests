package Test;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Arrays;
import java.util.Collection;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import src.Dane;

import static org.junit.Assert.*;

@Category({TestEntity.class})
@RunWith(Parameterized.class)
public class SprzetTest {
    Dane dane = new Dane();
    @Parameterized.Parameter
    public int numer1;
    
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        Object[][] data1 = new Object[][]{{0},{1},{2},{3},{4},{5}};
        return Arrays.asList(data1);
    }
    
    @Test
    public void testEquals(){
        System.out.println("Equals");
        for (int j=numer1;j<5; j++)
            if(numer1==j)
                assertTrue(dane.sprzety[numer1].equals(dane.sprzety[j]));
            else
                assertFalse(dane.sprzety[numer1].equals(dane.sprzety[j]));
    }
    
    @Test
    public void testObliczCeneBrutto(){
        System.out.println("obliczCeneBrutto");
        float result1 = dane.sprzety[numer1].obliczCenęBrutto();
        float result2 = dane.cenySprzetow[numer1];
        assertEquals(result1, result2, 0F);
    }

}
