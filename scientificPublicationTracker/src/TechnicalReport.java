public class TechnicalReport extends Article{
    private String publicationVenue;
    private int numOfImpressions;
    TechnicalReport(String title, String[] authors, int publishingYear, int numOfCitations, String publicationVenue,
                    int numOfImpressions) {
        super(title, authors, publishingYear, numOfCitations);
        this.publicationVenue = publicationVenue;
        this.numOfImpressions = numOfImpressions;
    }

    public int getNumOfImpressions() {
        return numOfImpressions;
    }

    public String getPublicationVenue() {
        return publicationVenue;
    }

    public void setNumOfImpressions(int numOfImpressions) {
        this.numOfImpressions = numOfImpressions;
    }

    public void setPublicationVenue(String publicationVenue) {
        this.publicationVenue = publicationVenue;
    }

    @Override
    public double estimateImpact() {
        if (numOfCitations <= 10) {
            throw new ImpactEstimationException("Blog post needs to have more than 10 citations to estimate " +
                    "its impact");
        }
        double impact = numOfCitations / 5.0;

        impact += numOfImpressions;

        return impact;
    }
}
