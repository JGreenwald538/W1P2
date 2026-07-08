package src;

public class Journal extends Article{
    private String publisher;
    private String[] editors;

    Journal(String title, String[] authors, int publishingYear, int numOfCitations, String publisher, String[] editors) {
        super(title, authors, publishingYear, numOfCitations);
        this.publisher = publisher;
        this.editors = editors;
    }

    public String getPublisher() {
        return publisher;
    }

    public String[] getEditors() {
        return editors;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setEditors(String[] editors) {
        this.editors = editors;
    }


    @Override
    public double estimateImpact() {
        return super.estimateImpact() * 2;
    }
}
