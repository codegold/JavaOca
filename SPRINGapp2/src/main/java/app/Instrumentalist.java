package app;


public class Instrumentalist  implements Performer {
    public Instrumentalist() {
    }

    private String song;
    private int age;
    private Instrument instrument;

    public String getSong() {
        return song;
    }

    public int getAge() {
        return age;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public void setAge(int age) {
        this.age = age;
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
