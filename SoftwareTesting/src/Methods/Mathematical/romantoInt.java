package Methods.Mathematical;

import java.util.HashMap;
import java.util.Map;

public class romantoInt {
    public static int romanToInt(String s) {
        Map<Character, Integer> romanToNumber  = new HashMap<>();
        romanToNumber.put('I', 1);
        romanToNumber.put('V', 5);
        romanToNumber.put('X', 10);
        romanToNumber.put('L', 50);
        romanToNumber.put('C', 100);
        romanToNumber.put('D', 500);
        romanToNumber.put('M', 1000);

        int result = 0;
        for(int i = 0; i <= s.length()-1; i++){
            char romanNumb = s.charAt(i);

            if(romanNumb == 'I' || romanNumb == 'X' || romanNumb == 'C') {
                if(i != s.length()-1) {
                    char next = s.charAt(i+1);

                    if((romanNumb == 'I' && (next == 'V' || next == 'X')) ||
                            (romanNumb == 'X' && (next == 'L' || next == 'C')) ||
                            (romanNumb == 'C' && (next == 'D' || next == 'M'))) {
                        result -= romanToNumber.get(romanNumb);
                        continue;
                    }
                }
            }

            result += romanToNumber.get(romanNumb);

        };

        return result;
    }
}
