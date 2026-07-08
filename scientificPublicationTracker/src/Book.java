public class Book extends Publication{
    private String publishingCompany;
    private int numOfPages;
    Book(String title, String[] authors, int publishingYear, int numOfCitations, String publishingCompany, int numOfPages) {
        super(title, authors, publishingYear, numOfCitations);
        this.publishingCompany = publishingCompany;
        this.numOfPages = numOfPages;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public String getPublishingCompany() {
        return this.publishingCompany;
    }

    public int getNumOfPages() {
        return this.numOfPages;
    }

    @Override
    public double estimateImpact() {
        return super.estimateImpact() * 4;
    }
}
