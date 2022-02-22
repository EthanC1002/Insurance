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
public abstract class Insurance 
{
    protected String type;
    protected double cost;
    protected double premium;
    
    public abstract void setCost();
    public abstract void display();
}
