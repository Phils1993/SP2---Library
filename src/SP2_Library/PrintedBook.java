package SP2_Library;

public class PrintedBook extends Title {
    private final int pages;

    public PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType, copies);
        this.pages = pages;
    }

    // not used for printed books
    @Override
    protected double calculatePoints() {
        return pages * calculateliteraturPoints() * copies;
    }

    // metoed for printedbooks
    @Override
    protected double calculateliteraturPoints() {
        switch (getliteratureType()) {
            case "BI", "TE":
                return 3;
            case "LYRIK":
                return 6;
            case "SKØN":
                return 1.7;
            case "FAG":
                return 1;
            default:
                return 0;

        }
    }
}
