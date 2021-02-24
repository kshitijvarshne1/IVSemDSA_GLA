/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 12-Jan-21
 *   Time: 8:00 PM
 *   File: Main.java
 */

package January.jan12_21.main;

import January.jan12_21.concreteclass.ClothesList;
import January.jan12_21.myinterface.ClothList;

public class Main {
    public static void main(String[] args) {
        ClothList clothesList = new ClothesList();
        clothesList.addNewCloth();
    }
}

