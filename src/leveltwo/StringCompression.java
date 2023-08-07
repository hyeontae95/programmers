package leveltwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringCompression {
    public static void main(String[] args) {
        solution("aabbaccc");
    }

    public static void solution(String s) {
        List<String> resultList = new ArrayList<>();
        for(int i = 1; i <= s.length() / 2; i++) {
            StringBuilder result = new StringBuilder();
            int count = 1;
            String baseString = s.substring(0, i);

            for(int j = i; j <= s.length(); j += i) {
                String comparisonString = s.substring(j, Math.min(j + i, s.length()));

                if(baseString.equals(comparisonString))
                    count++;

                else {
                    result.append((count > 1) ? count + baseString : baseString);

                    baseString = comparisonString;
                    count = 1;
                }
            }
            result.append(baseString);

            resultList.add(result.toString());
        }

        System.out.println(resultList);
    }
}
