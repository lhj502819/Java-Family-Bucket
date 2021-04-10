package com.basis.java.gof23.strategy.compress;

public class CompressContext {
    private final ICompress compress;


    public CompressContext(ICompress compress) {
        this.compress = compress;
    }

    public void compress(String source,String to){
        compress.compress(source,to);
    }
    public void upCompress(String source,String to){
        compress.unCompress(source,to);
    }
}
