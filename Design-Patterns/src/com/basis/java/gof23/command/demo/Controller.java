package com.basis.java.gof23.command.demo;

/**
 * 遥控器类
 */
public class Controller {

    ICommand changeChannlTVCommand ;
    ICommand closeTVCommand ;
    ICommand openTVCommand ;

    public Controller(ICommand changeChannlTVCommand, ICommand closeTVCommand, ICommand openTVCommand) {
        this.changeChannlTVCommand = changeChannlTVCommand;
        this.closeTVCommand = closeTVCommand;
        this.openTVCommand = openTVCommand;
    }

    public void openTV(){
        openTVCommand.execute();
    }
    public void closeTV(){
        closeTVCommand.execute();
    }
    public void changeChannlTV(){
        changeChannlTVCommand.execute();
    }

}
