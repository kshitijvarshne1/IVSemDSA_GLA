/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 22-Mar-21
 *   Time: 6:48 PM
 *   File: Main.java
 */

package March.mar22_21_NK.one;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Set<Book> books = new HashSet<>();
        books.add(new Book(2234, "amandeep", "Amandeep", "Java"));
        books.add(new Book(3234, "Rahul", "Amandeep", "Python"));
        books.add(new Book(4234, "amandeep", "Amandeep", "C"));
        books.add(new Book(34, "amandeep", "Amandeepkabeta", "C++"));
        books.add(new Book(1734, "aman", "Amandeep", "DSA"));
        BookHelper bh = new BookHelper();
        System.out.println(bh.findAllBookOnSubject(books, "Java"));
        System.out.println(books);
        /*List<Book> sortedList = new ArrayList<>(books);
        sortedList.sort(Book::compareTo);*/
        /*System.out.println(sortedList);*/

        List<?> a = books.stream().sorted(Comparator.comparing(Book::getSubject)).collect(Collectors.toList());

        System.out.println(a);
    }
}

