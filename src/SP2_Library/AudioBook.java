package SP2_Library;

public class AudioBook extends Title{
    int durationInMinutes;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    protected double calculatePoints() {
        return (durationInMinutes * 0.5) * calculateliteraturPoints() * copies;
    }

    @Override // Assigning/returning values for each literature type.
    protected double calculateliteraturPoints(){
        switch (getliteratureType()){
            case "BI", "TE": return 1.5;
            case "LYRIK": return 3;
            case "SKØN": return 0.85;
            case "FAG": return 0.5;
            default: return 0;
        }
    }

}
