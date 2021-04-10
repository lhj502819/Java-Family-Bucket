package com.basis.java.gof23.command.demo;

public class CloseTVCommand implements ICommand{

    private TV tv;

    public CloseTVCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.closeTV();
    }
}
