package Command;

import Receiver.Receiver;

public class RedoCommand implements ICommand {

    Receiver receiver;

    public RedoCommand(Receiver receiver) {
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.actionRedo();
    }
}
