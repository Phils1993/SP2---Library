package SP2_Library;

public abstract class Title {
    private String title;
    private String literatureType;
    protected int copies;
    protected double rate;

        public Title(String title, String literatureType, int copies){
            this.title = title;
            this.copies = copies;
            this.literatureType = literatureType;
            this.rate = 0.067574;
    }


    //caltulates Author's salery via. points and rate - skal denne hedde: calculateTotalPay
    public double calculateRoyalties(){
        return (calculatePoints()) * rate;
    }

    protected abstract double calculatePoints();
    protected abstract double calculateliteraturPoints();


    // used so i can print out via. system out println
    @Override
    public String toString() {
        return "Title:" + title + ",type:" + literatureType + ",copies:" + copies;
    }

    public String getliteratureType() {
        return literatureType;
    }
}
