
public class MyQ2 implements iQ2{

    @Override
    public int f5(String s) {
        int res = 0;
        int count = 0;
        s += "!";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                count++;
            } else {
                if (count == 2) res++;
                count = 0;
            }
        }
        
        return res;
    }

    @Override
    public String f6(String s, int k) {
        String res = s;
        char[] temp = res.toCharArray();
        for (int i = 0; i < temp.length; i++) {
            if ((temp[i] >= 'a' && temp[i] <= 'z') || (temp[i] >= 'A' && temp[i] <= 'Z')) {
                char rep = (char)((int)temp[i] + k);
                if (temp[i] >= 'a' && temp[i] <= 'z') {
                    if (rep < 'a') rep = (char)((int)rep + 26);
                    if (rep > 'z') rep = (char)((int)rep - 26);
                }
                if (temp[i] >= 'A' && temp[i] <= 'Z') {
                    if (rep < 'A') rep = (char)((int)rep + 26);
                    if (rep > 'Z') rep = (char)((int)rep - 26);
                }
                temp[i] = rep;
            }
        }
        res = String.valueOf(temp);
        return res;
    }

}
