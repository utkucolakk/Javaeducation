package set_sample;

import java.util.EnumSet;

public class EnumSetSample02 {

    public static void main(String[] args) {
        // Creating an EnumSet using range()
        EnumSet<Size> sizes = EnumSet.range(Size.MEDIUM, Size.EXTRALARGE);

        System.out.println("EnumSet: " + sizes);

    }
}
