package com.basis.java.gof23.bridge;

public class BridgeBootstrap {
    public static void main(String[] args) {
        White white = new White();

        Yellow yellow = new Yellow();
        Square square = new Square();
        square.setColor(yellow);
        square.draw();

        AbstractShape abstractShape = new Square();
        abstractShape.setColor(white);
        abstractShape.draw();
    }
}
