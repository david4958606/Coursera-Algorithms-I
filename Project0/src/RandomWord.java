import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String c = "";
        int i = 0;
        while (!StdIn.isEmpty()) {
            String nextWord = StdIn.readString();
            i++;
            double p = 1.0 / i;
            if (StdRandom.bernoulli(p)) {
                c = nextWord;
            }
        }
        StdOut.println(c);
    }
}
