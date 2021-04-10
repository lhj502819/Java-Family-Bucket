package com.basis.java.gof23.strategy.compress;

public class ZipCompress implements ICompress{
    @Override
    public void compress(String source, String to) {
        String format = String.format("zip---> 将%s压缩至%s.tar", source, to);
        System.out.println(format);
    }

    @Override
    public void unCompress(String source, String to) {
        String format = String.format("zip---> 将%s解压至%s", source, to);
        System.out.println(format);
    }
}

