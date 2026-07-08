package src;

public class ConferenceProceeding extends Article{
    private String confName;
    private String confLocation;

    ConferenceProceeding(String title, String[] authors, int publishingYear, int numOfCitations, String confName,
                         String confLocation) {
        super(title, authors, publishingYear, numOfCitations);
        this.confName = confName;
        this.confLocation = confLocation;
    }

    public void setConfLocation(String confLocation) {
        this.confLocation = confLocation;
    }

    public void setConfName(String confName) {
        this.confName = confName;
    }

    public String getConfLocation() {
        return confLocation;
    }

    public String getConfName() {
        return confName;
    }
}
