package com.basis.java.gof23.command.demo;

public class ChangeChannlTVCommand implements ICommand{

    private TV tv;

    public ChangeChannlTVCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.changeChannl();
    }
}
