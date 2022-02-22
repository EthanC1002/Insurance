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
public class Life extends Insurance
{
    public Life(double pr)
    {
        premium = pr;
        type = "Life";
        setCost();
    }
    
    @Override
    public void setCost()
    {
        cost = premium*0.02;
    }
    @Override
    public void display()
    {
        System.out.println(type + " Insurance costs: $" + cost + " per month.");
    }
}
