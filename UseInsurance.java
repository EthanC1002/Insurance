/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UseInsurance;

/**
 *
 * @author ethan
 */

import java.util.*;

public class UseInsurance 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter '1' for Life Insurance or '2' for Health Insurance: ");
        int select = scan.nextInt();
        
        switch (select)
        {
            case 1:
                System.out.println("Enter premium for life insurance: ");
                double amnt = scan.nextInt();
                Life life = new Life(amnt);
                life.display();
                break;
            case 2:
                System.out.println("Enter premium for health insurance: ");
                amnt = scan.nextInt();
                Health health = new Health(amnt);
                health.display();
                break;
            default:
                System.out.println("Enter '1' or '2'.");
                break;
        }
    }
}
