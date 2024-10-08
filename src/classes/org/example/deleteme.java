package classes.org.example;

import java.util.HashMap;

public class deleteme {

    public int romanToInt (String s){
        int count = 0;
        HashMap<Character,Integer> numeral = new HashMap<>();
        numeral.put('I',1);
        numeral.put('V',5);
        numeral.put('X',10);
        numeral.put('L',50);
        numeral.put('C',100);
        numeral.put('D',500);
        numeral.put('M',1000);

int pre = 0;
        for (int i = s.length() - 1; i >= 0 ; i--) {
            if (s.charAt(i) == s.charAt(s.length() - 1)) {
            count += numeral.get(s.charAt(i));
            }
            else if (numeral.get(s.charAt(i) ) < pre) {
                count -= numeral.get(s.charAt(i)) ;
            }
            else {
                count += numeral.get(s.charAt(i)) ;
            }
            pre = s.charAt(i);
        }

        return count;
    }

    public static void main(String[] args) {
        deleteme del = new deleteme();

        System.out.println(del.romanToInt("XVIII"));
    }
}
