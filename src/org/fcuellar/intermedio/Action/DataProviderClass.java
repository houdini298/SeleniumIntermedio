package org.fcuellar.intermedio.Action;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
    @DataProvider(name = "SearchProvider")
    public  Object[][] getDataFromDataProvider(){
        return new Object[][]{
                // {"Fernando"} M = 1 y N = 1, osea es de 1x1
                {"Fernando","Google"},
                {"Luis","Yahoo"},
                {"Sara","Gmail"},
                {"Lorena","Amazon"}
        };
    }
}
