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

@Categories.SuiteClasses({RachunkiTestSuiteControl.class})
@RunWith(Categories.class)
@Categories.IncludeCategory(TestControl.class)
@Categories.ExcludeCategory(TestKoszt.class)

public class RachunkiTestSuiteControlWstaw {
    
}
