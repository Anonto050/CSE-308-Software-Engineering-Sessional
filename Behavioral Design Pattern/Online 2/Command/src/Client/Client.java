package Client;

import Command.RedoCommand;
import Command.UndoCommand;
import Invoker.Invoker;
import Receiver.Receiver;

public class Client {
    public static void main(String[] args) {
        System.out.println("Command Pattern");

        Receiver receiver = new Receiver();
        Invoker invoker = new Invoker();

        UndoCommand undoCommand = new UndoCommand(receiver);
        RedoCommand redoCommand = new RedoCommand(receiver);

        invoker.setCommand(undoCommand);
        invoker.setCommand(redoCommand);
    }
}
