package Invoker;

import Command.ICommand;

public class Invoker {
    ICommand command;

    public void setCommand(ICommand command) {
        this.command = command;
        command.execute();
    }
}
