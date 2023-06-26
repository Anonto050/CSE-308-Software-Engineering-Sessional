package Command;
import Receiver.Receiver;

public class UndoCommand implements ICommand {

        Receiver receiver;

        public UndoCommand(Receiver receiver) {
            this.receiver = receiver;
        }
        @Override
        public void execute() {
            receiver.actionUndo();
        }
}
