package epam1;

import java.util.Comparator;

public class Comp implements Comparator<Stone> {
    @Override
    public int compare(Stone o1, Stone o2) {
        if (o1.price == o2.price) {
            return 0;
        }
        if (o1.price > o2.price) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
