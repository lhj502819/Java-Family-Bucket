package com.basis.java.gof23.strategy.compress;

public interface ICompress {
    /**
     * 压缩
     * @param source
     * @param to
     */
    default void compress(String source,String to){

    }

    /**
     * 解压
     * @param source
     * @param to
     */
    default void unCompress(String source, String to){

    }
}
