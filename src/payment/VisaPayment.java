/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package payment;

import java.util.ArrayList;

/**
 *
 * @author anthony
 */
public class VisaPayment extends Payment {
    private String customerName;
    private int ccNum;
    private double amt;
    
    
    public boolean init(ArrayList<String> params) {
        customerName = params.get(0);
        ccNum = Integer.parseInt(params.get(1));
        return true;
    }
    
    @Override
    public double processPayment() {
        return amt;
    }
    
    public String toString() {
        String invString = "Amount Tendered: Paid by Visa";
        return invString;
    }
    
}
