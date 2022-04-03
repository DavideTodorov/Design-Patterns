import command.*;
import model.GarageDoor;
import model.Light;
import remote.RemoteControl;
import remote.SimpleRemoteControl;

public class Main {

    public static void main(String[] args) {

        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();

        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.pressedButton();

        GarageDoorOpenCommand doorOpenCommand = new GarageDoorOpenCommand(new GarageDoor());

        simpleRemoteControl.setCommand(doorOpenCommand);
        simpleRemoteControl.pressedButton();

        System.out.println("==================================");

        Light livingRoomLight = new Light();
        Light kitchenLight = new Light();
        GarageDoor garageDoor = new GarageDoor();

        Command livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        Command kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        Command livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
        Command kitchenLightOffCommand = new LightOffCommand(kitchenLight);
        Command garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        Command garageDoorClose = new GarageDoorCloseCommand(garageDoor);

        RemoteControl remoteControl = new RemoteControl(3);

        remoteControl.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
        remoteControl.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
        remoteControl.setCommand(2, garageDoorOpen, garageDoorClose);

        remoteControl.onButtonPushed(0);
        remoteControl.offButtonPushed(0);
        remoteControl.undoButtonPushed();

        remoteControl.onButtonPushed(1);
        remoteControl.undoButtonPushed();
        remoteControl.offButtonPushed(1);

        remoteControl.onButtonPushed(2);
        remoteControl.offButtonPushed(2);
        remoteControl.undoButtonPushed();
    }
}
