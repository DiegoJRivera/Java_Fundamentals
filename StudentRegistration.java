/*
 * Practical Exercise developed by Diego Rivera for Programming Fundamentals class.
 * 28/07/2016
 * Professor Rachel Jeikishore
 * This java program processes student details to register them into courses and then
 * displays this information onto the screen by ID, Name, Course and Fee and Also after the
 * third input will display the total fee.
 */
package practicalexercise1;

/**
 *
 * @author diegorivera
 * 28/07/2016
 * StudentRegistration.java
 * 
 */

import javax.swing.JOptionPane;
public class StudentRegistration
        
{
    public static void main(String [] args)
    {
        Integer fee, totalFees=0, n=0;
        headings();
        while(n<3){
            fee=inputStudentDetails();
            totalFees=(totalFees+fee);
            n++;
        }
    outputTotalFee(totalFees);
        
    }
    public static void headings()
    {
        System.out.println("---HOLMESGLEN INSTITUTE---"+"\n\n"+
                "ID"+"\t\t\t"+"NAME"+"\t\t\t"+"COURSE"+"\t\t\t"+"FEE");
    }
    public static int inputStudentDetails()
    {   
        String id, firstName, lastName, course, feestr;
        id=JOptionPane.showInputDialog(null,"Enter student id");
        firstName=JOptionPane.showInputDialog(null,"Enter first name");
        lastName=JOptionPane.showInputDialog(null,"Enter last name");
        course=JOptionPane.showInputDialog(null,"Enter course");
        feestr=JOptionPane.showInputDialog(null,"Enter course fee");
        System.out.println(id+"\t\t"+firstName+" "+lastName+"\t\t"+course+
                "\t\t"+"$"+feestr);   
        return Integer.parseInt(feestr);
    }
    public static void outputTotalFee(int totalFees) 
    {
        
        System.out.println("\n"+"Total fees $"+totalFees);
    }
}