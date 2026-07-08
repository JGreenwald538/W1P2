import java.time.Year;
import java.util.Arrays;
import java.util.Objects;

public class Publication {
    protected String title;
    protected String[] authors;
    protected int publishingYear;
    protected int numOfCitations;

    Publication(String title, String[] authors, int publishingYear, int numOfCitations) {
        this.title = title;
        this.authors = authors;
        this.publishingYear = publishingYear;
        this.numOfCitations = numOfCitations;
    }

    public int getNumOfCitations() {
        return numOfCitations;
    }

    public String getTitle() {
        return title;
    }

    public String[] getAuthors() {
        return authors;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public void setNumOfCitations(int numOfCitations) {
        this.numOfCitations = numOfCitations;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public double estimateImpact() {
        double age = Year.now().getValue() - publishingYear;
        if (age == 0) {
            age = 1;
        }

        if (age > 250) {
            throw new ImpactEstimationException("Publication is too old to have its impact estimated");
        }

        double impact = numOfCitations / age;

        if (age < 3) {
            impact += 100;
        } else if (age > 40) {
            impact -= 250;
        }

        return impact;
    }

    @Override
    public String toString() {
        return title + Arrays.toString(authors) + publishingYear + numOfCitations;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, Arrays.hashCode(authors), publishingYear, numOfCitations);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj.getClass() != this.getClass()) {
            return false;
        }

        Publication publication = (Publication) obj;
        return Arrays.equals(publication.authors, this.authors) && Objects.equals(publication.numOfCitations,
                this.numOfCitations) && Objects.equals(publication.publishingYear, this.publishingYear) &&
                Objects.equals(publication.title, this.title);
    }
}
