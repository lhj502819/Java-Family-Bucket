package com.basis.java.gof23.command.demo;

public class Client {
    public static void main(String[] args) {
        TV tv = new TV();
        ICommand changeChannlTVCommand = new ChangeChannlTVCommand(tv);
        ICommand closeCommand = new CloseTVCommand(tv);
        ICommand openCommand = new OpenTVCommand(tv);

        Controller controller = new Controller(changeChannlTVCommand,closeCommand,openCommand);

        controller.openTV();
        controller.closeTV();
        controller.changeChannlTV();
    }
}
