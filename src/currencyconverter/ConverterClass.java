/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currencyconverter;
/**
 *
 * @author toukir
 */
public class ConverterClass {
    double SGD = 3.11910;
    double USD = 4.44147;
    double EUR = 4.72394;
    String result;
    
    public String getUSD(double amount){
        
        result = amount+" US Dollar (USD) = " + amount * USD +" (MYR)";
        
        return result;
    }
    
    public String getSGD(double amount){
        
        result = amount+" Singapore Dollar (SGD) = " + amount * SGD +" (MYR)";
        
        return result;
    }
    
    public String getEUR(double amount){
        
        result = amount + " Euro (EUR) = " + amount * EUR +" (MYR)";
        
        return result;
    }
}
