package Test;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.experimental.categories.Categories;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author daw_k
 */
@Categories.SuiteClasses({FabrykaTest.class, AplikacjaTest.class, RachunekTest.class,
RezerwacjaTest.class, SprzetTest.class})
@RunWith(Categories.class)
@Categories.ExcludeCategory(TestControl.class)
public class RachunkiTestSuiteEntity {
    
}
