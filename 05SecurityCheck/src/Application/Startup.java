/*
 * Created By Fajrina Aflaha.
 */
package Application;

import models.*;
import interfaces.*;
/**
 *
 * @author Fajrina Aflaha
 */
public class Startup {

    
    public static void main(String[] args) {
         ScannerUI scannerUi = new ScannerUI();
            KeyCardCheck keyCardCheck = new KeyCardCheck(scannerUi);
            PinCodeCheck pinCodeCheck = new PinCodeCheck(scannerUi);
            SecurityManagers manager = new SecurityManagers (keyCardCheck, pinCodeCheck);
            manager.Check();
    }
    
}
