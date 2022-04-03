package remote;

import command.Command;

public class SimpleRemoteControl {
    private Command command;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressedButton() {
        command.execute();
    }
}
