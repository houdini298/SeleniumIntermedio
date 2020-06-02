package org.fcuellar.intermedio.Action;

import org.testng.annotations.*;

public class TestNGAnnotations {
    @BeforeSuite
    public void beforesuite(){
        System.out.println("Este metodo se ejecuta antes de una suite de prueba");
    }

    @BeforeTest
    public void  beforetest(){
        System.out.println("Este metodo se ejecuta antes de las pruebas @Test");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Este metodo se ejecuta antes de la clase");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Se ejecuta antes de cada metodo de prueba @Test");
    }

    @Test
    public void testCase1(){
        System.out.println("Caso de prueba 1");
    }

    @Test
    public void testCase2(){
        System.out.println("Caso de prueba 2");
    }

    @Test
    public void testCase3(){
        System.out.println("Caso de prueba 3 ");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("Se ejecuta despues de cada metodo de prueba");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("Este metodo se ejecuta despues de la clase");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("Este metodo se ejecuta despues de todas las pruebas");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("Este Metodo se ejecuta despues de una suite de pruebas");
    }

}
