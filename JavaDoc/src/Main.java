/**
 * Hero is the main entity we'll be using to . . .
 *
 * Please see the {@link java_doc.JavaDoc} class for true
 identity
 * @author Captain America
 *
 */


public class Main {
    /**
     * Returns the ceiling modulus of the {@code long} and {@code int} arguments.
     * <p>
     * The ceiling modulus is {@code r = x - (ceilDiv(x, y) * y)},
     * has the opposite sign as the divisor {@code y} or is zero, and
     * is in the range of {@code -abs(y) < r < +abs(y)}.
     *
     * <p>
     * The relationship between {@code ceilDiv} and {@code ceilMod} is such that:
     * <ul>
     *   <li>{@code ceilDiv(x, y) * y + ceilMod(x, y) == x}</li>
     * </ul>
     * <p>
     * For examples, see {@link #sayHello(String)}.
     *
     * @param args the dividend
     *
     * @return the ceiling modulus {@code x - (ceilDiv(x, y) * y)}
     * @throws ArithmeticException if the divisor {@code y} is zero
     * @see #sayHello(String)
     * @since 18
     */
    public static void main(String[] args) {
        System.out.println();

    }
    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }
}


