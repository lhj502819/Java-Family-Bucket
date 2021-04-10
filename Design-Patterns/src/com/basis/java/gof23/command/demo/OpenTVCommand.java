package com.basis.java.gof23.command.demo;

public class OpenTVCommand implements ICommand{

    private TV tv;

    public OpenTVCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.openTV();
    }
}
