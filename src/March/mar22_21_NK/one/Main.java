/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 22-Mar-21
 *   Time: 6:48 PM
 *   File: Main.java
 */

package March.mar22_21_NK.one;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Book> books = new HashSet<>();
        books.add(new Book("1234", "amandeep", "Amandeep", "BSex"));
        books.add(new Book("1234", "amandeepkifirstSetting", "Amandeep", "Sexpichewala"));
        books.add(new Book("1234", "amandeep", "Amandeep", "ASexAage wala"));
        books.add(new Book("1234", "amandeep", "Amandeepkabeta", "CSex"));
        books.add(new Book("1234", "amandeepkisetting", "Amandeep", "DSex"));
        System.out.println(books);
    }
}

