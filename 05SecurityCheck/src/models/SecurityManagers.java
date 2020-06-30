/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SecurityManagers {
    private KeyCardCheck keyCardCheck;
    private PinCodeCheck pinCodeCheck;

    public SecurityManagers(KeyCardCheck keyCardCheck, PinCodeCheck pinCodeCheck)
    {
       this.keyCardCheck = keyCardCheck;
       this.pinCodeCheck = pinCodeCheck;
    }

    public void Check()
    {
        System.out.print("Menu option: \n1 - KeyCard \n2 - PinCode \nChoose yout option: ");
        Scanner in = new Scanner(System.in);
        int option = in.nextInt();
        switch (option)
        {
            case 1:
                System.out.println(this.keyCardCheck.ValidateUser());
                break;
            case 2:
                System.out.println(this.pinCodeCheck.ValidateUser());
                break;
        }
    }
}
