/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 22-Mar-21
 *   Time: 6:44 PM
 *   File: Book.java
 */

package March.mar22_21_NK.one;

public class Book implements Comparable<Book> {
    private int isbn;
    private String bookName;
    private String author;
    private String Subject;

    public Book(int isbn, String bookName, String author, String subject) {
        this.isbn = isbn;
        this.bookName = bookName;
        this.author = author;
        Subject = subject;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", Subject='" + Subject + '\'' +
                '}' + '\n';
    }

    @Override
    public int compareTo(Book o) {
        return String.valueOf(this.Subject).compareTo(o.getSubject());
    }
}

