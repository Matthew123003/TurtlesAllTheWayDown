import java.time.Duration;
import java.time.Instant;

public class GCD {

    public static int gcd1(int p, int q) {
        if (q == 0) {return p;}
        return gcd1(q, p % q);
    }

    public static int gcd2(int p, int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }

    public static Long gdc1Speed(int p, int q){
        Instant start = Instant.now();
        GCD.gcd1(1440, 408);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toNanos();
        return timeElapsed;
    }

    public static Long gcd2Speed(int p, int q){
        Instant start = Instant.now();
        GCD.gcd2(1440, 408);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toNanos();
        return timeElapsed;
    }




}
