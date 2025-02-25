package rocks.zipcode.io.quiz4.generics;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class GenericUtils {
    public static <E extends Comparable> Iterable<? extends Iterable<E>> powerSet(Set<E> originalSet) {
        return null;
    }

    public static <E extends Comparable> Iterable<? extends Iterable<E>> powerSet(E... originalSet) {
        return powerSet(new TreeSet<>(Arrays.asList(originalSet)));
    }
}

