package com.basis.java.gof23.adapter.example2;

/**
 * TODO
 *
 * @author lihongjian
 * @since 2020/4/25
 */
public class AdapterDesignBootstrap {
    public static void main(String[] args) {
        NetLineAdaptee netLineAdaptee = new NetLineAdaptee();
        NetLineAdapter netLineAdapter = new NetLineAdapter(netLineAdaptee);
        ComputerClinet computerClinet = new ComputerClinet(netLineAdapter);
        computerClinet.net();
    }
}
