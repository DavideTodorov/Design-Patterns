package remote;

import command.Command;
import command.NoCommand;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command lastExecutedCommand;

    public RemoteControl(int commandsSlots) {
        this.onCommands = new Command[commandsSlots];
        this.offCommands = new Command[commandsSlots];

        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < commandsSlots; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        lastExecutedCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPushed(int slot) {
        onCommands[slot].execute();
        lastExecutedCommand = onCommands[slot];
    }

    public void offButtonPushed(int slot) {
        offCommands[slot].execute();
        lastExecutedCommand = offCommands[slot];

    }

    public void undoButtonPushed() {
        lastExecutedCommand.undo();
    }

}
