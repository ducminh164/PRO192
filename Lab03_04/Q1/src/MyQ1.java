
import java.util.ArrayList;
import java.util.Collections;


public class MyQ1 implements iQ1{
    boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        
        return true;
    }
    
    @Override
    public int f1(ArrayList<Integer> a, int x) {
        int count = 0;
        for (Integer o : a) {
            if (o > x) count++;
        }
        
        return count;
    }

    @Override
    public int f2(ArrayList<Integer> a) {
        int[] b = new int[1000];
        for (int i = 0; i < a.size(); i++) {
            b[a.get(i) / 10]++;
        }
        
        int max_freq = 0;
        int index_max_freq = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] > max_freq) {
                max_freq = b[i];
                index_max_freq = i;
            }
        }
        
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < a.size(); i++) {
            if (10 * index_max_freq <= a.get(i) && a.get(i) <= 10 * index_max_freq + 9 && a.get(i) > res) {
                res = a.get(i);
            }
        }
        
        return res;
    }

    @Override
    public void f3(ArrayList<Integer> a) {
        for (int i = 0; i < a.size(); i++) {
            if (isPrime(a.get(i))) {
                a.remove(i);
                i--;
            }
        }
    }

    @Override
    public void f4(ArrayList<Integer> a, int x) {
        int sum = 0;
        if (a.size() >= x) {
            for (int i = 0; i < a.size(); i++) {
                sum += a.get(i);
                if (i == x - 1) break;
            }
            double avg = (double)sum / x;
            
            for (int i = 0; i < x - 1; i++) {
                for (int j = i + 1; j < x; j++) {
                    if (a.get(i) > avg && a.get(j) > avg && a.get(i) > a.get(j)) {
                        Collections.swap(a, i, j);
                    }
                }
            }
        }
    }

}
