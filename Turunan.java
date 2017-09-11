/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum1;

/**
 *
 * @author Fahru
 */
public class Turunan extends Induk
{
    public void test (String z)
    {
        System.out.println("Method overload di dalam kelas turunan");
        System.out.println("Z:\""+z+"\"");
        
    }
    public void test()
    {
        System.out.println("Method overload di dalam kelas turunan");
    }
}

