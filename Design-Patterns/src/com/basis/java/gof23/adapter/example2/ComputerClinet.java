package com.basis.java.gof23.adapter.example2;

/**
 * TODO
 *
 * @author lihongjian
 * @since 2020/4/25
 */
public class ComputerClinet {
    NetToUsb netToUsb;

    public ComputerClinet(NetToUsb netToUsb) {
        this.netToUsb = netToUsb;
    }

    public void net(){
        netToUsb.adaptNetLine();
    }
}
