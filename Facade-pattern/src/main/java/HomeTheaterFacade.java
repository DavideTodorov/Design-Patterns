import components.Lights;
import components.PopcornMachine;
import components.Projector;
import components.Screen;

public class HomeTheaterFacade {

    private Lights lights;
    private PopcornMachine popcornMachine;
    private Projector projector;
    private Screen screen;

    public HomeTheaterFacade(Lights lights, PopcornMachine popcornMachine,
                             Projector projector, Screen screen) {
        this.lights = lights;
        this.popcornMachine = popcornMachine;
        this.projector = projector;
        this.screen = screen;
    }

    public void watchMovie() {
        lights.off();
        popcornMachine.on();
        projector.on();
        screen.down();
    }

    public void endMovie() {
        lights.on();
        popcornMachine.off();
        projector.off();
        screen.up();
    }
}
