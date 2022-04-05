import components.Lights;
import components.PopcornMachine;
import components.Projector;
import components.Screen;

public class Main {

    public static void main(String[] args) {
        Lights lights = new Lights();
        PopcornMachine popcornMachine = new PopcornMachine();
        Projector projector = new Projector();
        Screen screen = new Screen();

        HomeTheaterFacade homeTheaterFacade =
                new HomeTheaterFacade(lights, popcornMachine, projector, screen);

        homeTheaterFacade.watchMovie();
        System.out.println("===============");
        System.out.println("Watching the movie...");
        System.out.println("===============");
        homeTheaterFacade.endMovie();
    }
}
