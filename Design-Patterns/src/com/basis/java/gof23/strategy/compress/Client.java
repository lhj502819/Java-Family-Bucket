package com.basis.java.gof23.strategy.compress;

public class Client {

    public static void main(String[] args) {
        TarCompress tarCompress = new TarCompress();
        CompressContext compressContext = new CompressContext(tarCompress);
        compressContext.compress("1","fold1");
        //切换算法
        ZipCompress zipCompress = new ZipCompress();
        compressContext = new CompressContext(zipCompress);
        compressContext.compress("1","fold1");
    }
}
