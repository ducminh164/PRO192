
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class MyCar implements iCar{

    @Override
    public int f7(ArrayList<Car> c, int x) {
        for (Car o : c) {
            if (o.getPrice() > x) c.remove(o);
        }
        
        return 0;
    }

    @Override
    public void f8(ArrayList<Car> c, int x) {
        for (int i = 0; i < c.size() - 1; i++) {
            for (int j = i + 1; j < c.size(); j++) {
                if (c.get(i).getPrice() >= x && c.get(j).getPrice() >= x && c.get(i).getPrice() < c.get(j).getPrice()) {
                    Collections.swap(c, i, j);
                } else if (c.get(i).getPrice() == c.get(j).getPrice()) {
                    int res = c.get(i).getBand().compareTo(c.get(j).getBand());
                    if (res > 0) Collections.swap(c, i, j);
                    else if (res == 0) {
                        int temp = c.get(i).getName().compareTo(c.get(j).getName());
                        if (temp < 0) Collections.swap(c, i , j);
                    }
                } 
            }
        }
    }

    @Override
    public void f9(ArrayList<Car> c) {
        int max = Integer.MIN_VALUE;
        int index_max = 0;
        for (int i = 0; i < c.size(); i++) {
            if (c.get(i).getPrice() > max) {
                max = c.get(i).getPrice();
                index_max = i;
            }
        }
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < c.size(); i++) {
            if (c.get(i).getPrice() < min) {
                min = c.get(i).getPrice();
            }
        }
        
        int min2 = Integer.MAX_VALUE;
        int index_min2 = 0;
        for (int i = 0; i < c.size(); i++) {
            if (c.get(i).getPrice() < min2 && c.get(i).getPrice() > min) {
                min2 = c.get(i).getPrice();
                index_min2 = i;
            }
        }
        
        Collections.swap(c, index_max, index_min2);
    }

    @Override
    public String f10(ArrayList<Car> c) {
        int[] b = new int[1000];
        String res = "";
        
        return res;
    }

}
