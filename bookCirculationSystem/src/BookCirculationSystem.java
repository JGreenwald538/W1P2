public interface BookCirculationSystem {
    public Boolean isEmpty();

    public void addBook(Book book);

    public Book popBook(Book book);

    public Boolean isBookIncluded(Book book);

    public int size();

    public Book getRandomBook();

    public Book findBookByISBN(String ISBN);
}
