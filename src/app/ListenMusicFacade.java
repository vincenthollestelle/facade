package app;

public class ListenMusicFacade {
    Amplifier amp = new Amplifier("Top-O-Line Amplifier");
    Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
    DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
    CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
    Projector projector = new Projector("Top-O-Line Projector", dvd);
    TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
    Screen screen = new Screen("Theater Screen");
    PopcornPopper popper = new PopcornPopper("Popcorn Popper");

    public void StartMusic(){
        lights.on();
        amp.on();
        amp.setVolume(5);
        cd.insert();
        amp.setStereoSound();
        cd.on();
        cd.play("No more parties in LA");
    }

    public void StopMusic(){
        amp.off();
        amp.setCd(cd);
        cd.eject();
        cd.off();
    }

    public void StartRadio(){
        tuner.on();
        tuner.setFrequency(101);
        amp.on();
        amp.setVolume(5);
        amp.setTuner(tuner);
    }

    public void StopRadio(){
        tuner.off();
        amp.off();
    }

}