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
import org.junit.runners.Parameterized.Parameter;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import src.Dane;

import static org.junit.Assert.*;

@Category({TestEntity.class})
@RunWith(Parameterized.class)
public class RachunekTest {
    Dane dane = new Dane();
    
    @Parameter(value=0)
    public int numer1;
    @Parameter(value=1)
    public int numer2;
    
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        Object[][]data1 = new Object[][]{{0,1}, {2,3}};
        return Arrays.asList(data1);
    }
    @Test
    public void testObliczSume(){
        System.out.println("ObliczSume");
        assertEquals(dane.cenyRachunkow[numer1], dane.rachunki[numer1].obliczSume(), 0F);
        assertEquals(dane.cenyRachunkow[numer2], dane.rachunki[numer2].obliczSume(), 0F);
    }
    
    
    public RachunekTest() {
    }

}
