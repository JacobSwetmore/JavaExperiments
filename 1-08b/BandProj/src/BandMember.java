
public class BandMember {

    //private variables – hidden data
    private String stageName;
    private String Instrument;

    //public methods
    public void setName(String stagename) {
        stageName = stagename;
    }

    public void setInstrument(String instrument) {
        Instrument = instrument;
    }

    public String getName() {
        return stageName;
    }

    public String getInstrument() {
        return Instrument;
    }

}