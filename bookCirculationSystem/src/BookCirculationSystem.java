public interface BookCirculationSystem {
    /**
     * Checks whether the system currently is empty.
     *
     * @return {@code true} if no books are present, {@code false} otherwise
     */
    Boolean isEmpty();

    /**
     * Adds a book to the system.
     *
     * @param book the {@link Book} to add
     */
    void addBook(Book book);

    /**
     * Removes the specified book from the system, if present.
     *
     * @param book the {@link Book} to remove
     * @return the removed {@link Book}
     * @throws BookNotFoundException if the requested book was not found
     */
    Book removeBook(Book book);

    /**
     * Checks whether the specified book is present in the system.
     *
     * @param book the {@link Book} to check for
     * @return {@code true} if the book is present, {@code false} otherwise
     */
    Boolean isBookIncluded(Book book);

    /**
     * Returns the total number of books currently in the system.
     *
     * @return the count of books
     */
    int size();

    /**
     * Returns a randomly selected book from the system.
     *
     * @return a randomly chosen {@link Book}
     */
    Book getRandomBook();

    /**
     * Finds a book by its ISBN.
     *
     * @param ISBN the ISBN string to search for
     * @return the matching {@link Book}
     * @throws InvalidISBNException if the ISBN does not match any book in the system
     */
    Book findBookByISBN(String ISBN);
}
