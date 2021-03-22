/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 22-Mar-21
 *   Time: 6:45 PM
 *   File: BookHelper.java
 */

package March.mar22_21_NK.one;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BookHelper {
    public List<Book> findAllBookOnSubject(Set<Book> books, String requiredSubject) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getSubject().equalsIgnoreCase(requiredSubject)) {
                result.add(book);
            }
        }
        return result;
    }
}

