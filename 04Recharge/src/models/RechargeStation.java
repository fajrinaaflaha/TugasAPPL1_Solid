/*
 * Created By Fajrina Aflaha.
 */
package models;

import interfaces.IRechargeable;

/**
 *
 * @author Fajrina Aflaha
 */
public class RechargeStation {
    public void recharge(IRechargeable rechargeable){
        rechargeable.recharge();
    }
}
