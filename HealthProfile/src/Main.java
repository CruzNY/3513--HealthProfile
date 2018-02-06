/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexiscruz
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HealthProfile alex = new HealthProfile();
        System.out.println("Enter your first name ");
        alex.setFirstName(input.nextLine());
        System.out.println("Enter your last name ");
        alex.setLastName(input.nextLine());
        System.out.println("Enter Gender");
        alex.setGen(input.nextLine());
        System.out.println("Enter your birth month");
        alex.setMonth(input.nextInt());
        System.out.println("Enter your birth day");
        alex.setDay(input.nextInt());
        System.out.println("Enter your birth year");
        alex.setYear(input.nextInt());
        System.out.println("Enter your Height in inches ");
        alex.setHeight(input.nextInt());
        System.out.println("Enter your weight in pounds");
        alex.setWeight(input.nextInt());
        System.out.println("\n");
        
        System.out.println("\t Health Record");
        System.out.println("----------------------------");
        System.out.println(alex.getInfo());
        
     
        
    }
    
}
