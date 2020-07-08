package app;

import javax.sound.midi.Instrument;

public class Instrumentalist implements Performer {
    public Instrumentalist() {
    }

    private String song;
    private app.Instrument instrument;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String screamSong() {
        return song;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.print("PLaying " + song + ": ");
        instrument.play();
    }
}
