package com.basis.java.gof23.adapter.example2;

/**
 * 通过适配器去适配网线，连接上网
 *
 * @author lihongjian
 * @since 2020/4/25
 */
public class NetLineAdapter  implements NetToUsb{
    private NetLineAdaptee netLine ;

    public NetLineAdapter(NetLineAdaptee netLine) {
        this.netLine = netLine;
    }

    @Override
    public void adaptNetLine() {
        netLine.connectNet();
    }
}
