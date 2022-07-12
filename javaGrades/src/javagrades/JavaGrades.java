/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagrades;

import java.util.Scanner;

/**
 *
 * @author lsum0
 */
public class JavaGrades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double score;
        String letterGrade;
        System.out.println("Enter the raw score: ");
        score = in.nextDouble();
        if (score > 90) {
            System.out.println("Excellent job, you got an A");
        }
        else if (score > 80) {
            System.out.println("Nice job, you got a B");
        }
        else if (score > 70) {
            System.out.println("You got a C");
        }
        else if (score > 60) {
            System.out.println("You need to study more you received a D");
        } else {
            System.out.println("You failed this time, please get a tutor");
        }
    }
    
}
