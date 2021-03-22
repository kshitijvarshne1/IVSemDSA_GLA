/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 22-Mar-21
 *   Time: 6:48 PM
 *   File: Main.java
 */

package March.mar22_21_NK.one;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(2234, "amandeep", "Amandeep", "Java"));
        books.add(new Book(3234, "Rahul", "Amandeep", "Python"));
        books.add(new Book(4234, "amandeep", "Amandeep", "C"));
        books.add(new Book(34, "amandeep", "Amandeepkabeta", "C++"));
        books.add(new Book(1734, "aman", "Amandeep", "DSA"));
        System.out.println(books);
        books.sort(Book::compareTo);
        System.out.println(books);
    }
}

