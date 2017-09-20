/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author L115student
 */
public class Startup {
    public static void main(String[] args) {
        ProgrammingCourse course1 = new IntroToProgrammingCourse("introprogramming", "545875746545");
        ProgrammingCourse course2 = new IntroJavaCourse("introjava", "587542574524");
        ProgrammingCourse course3 = new AdvancedJavaCourse("advancedjava", "798296462614");
        
        //this type of inheritance is harder to understand and harder to implement than the normal inheritance
    }
}
