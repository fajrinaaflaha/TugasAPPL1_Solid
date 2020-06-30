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
public class KeyCardCheck extends SecurityCheck {
    private ISecurityUI securityUI;

        public KeyCardCheck(ISecurityUI securityUI)
        {
            this.securityUI = securityUI;
        }

        private boolean IsValid(String code)
        {
            return true;
        }

    @Override
    public boolean ValidateUser() {
        String code = securityUI.RequestKeyCard();
        if (IsValid(code))
        {
            return true;
        }

        return false;
    }
    
}
