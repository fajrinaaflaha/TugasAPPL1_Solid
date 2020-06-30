/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import interfaces.ISecurityUI;

/**
 *
 * @author User
 */
public class PinCodeCheck extends SecurityCheck {
    ISecurityUI securityUI;
    public PinCodeCheck(ISecurityUI securityUI)
    {
        this.securityUI = securityUI;
    }

    private boolean IsValid(int pin)
    {
        return true;
    }
        
    @Override
    public boolean ValidateUser() {
       int pin = securityUI.RequestPinCode();
       if (IsValid(pin))
       {
        return true;
       }

       return false;
    }
    
}
