import java.lang.Math;

public class PiKaValue {
    int n;

    public void piKaValueKyaHai() {
        double pi=0;
        for (int i = 1; i <= n ; i++) {
            double k = Math.pow( (-1), (i+1));
            double o = k/((2*i)-1);
            pi = pi+o;
            //System.out.println(o);
            //System.out.println(pi);
        }
        pi = 4*pi;
        System.out.println("The value of pi upto the number of terms you entered is = " + pi);
    }

    PiKaValue(int n) {
        this.n=n;
    }
}

