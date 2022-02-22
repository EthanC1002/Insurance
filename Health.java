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
public class Health extends Insurance
{
    public Health(double pr)
    {
        premium = pr;
        type = "Health";
        setCost();
    }
    
    @Override
    public void setCost()
    {
        cost = premium*0.05;
    }
    @Override
    public void display()
    {
        System.out.println(type + " Insurance costs: $" + cost + " per month.");
    }
}
