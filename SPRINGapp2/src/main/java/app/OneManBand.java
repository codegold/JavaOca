package app;

import java.util.Map;

import app.Instrument;
import app.PerformanceException;
import app.Performer;

public class OneManBand implements Performer {
    private Map<String, Instrument> instruments;

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }

    public OneManBand() {
    }

    @Override
    public void perform() throws PerformanceException {
        for (String key: instruments.keySet()){
            System.out.println(key+ ": ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
    }
}
