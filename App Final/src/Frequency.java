import java.util.*;

public class Frequency {
    private String mostFreq = "ETAOINSHRDLCUMWFGYPBVKJXQZ";

    private int[] reverse(int[] a) {
        int temp;
        for (int i = 0; i < a.length / 2; i++) {
            temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
        return a;
    }
   
    public String[] freqAnalysis(String text) {
        text = text.toUpperCase();
        String[] top = new String[5];
        int freq[] = new int[26];
        int freqSorted[] = new int[26];
        int Used[] = new int[26];
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ')
                freq[text.charAt(i) - 'A']++;
        }
        for (int i = 0; i < 26; i++) {
            freqSorted[i] = freq[i];
        }
        Arrays.sort(freqSorted);
        freqSorted = reverse(freqSorted);
        for (int i = 0; i < 5; i++) {
            int ch = -1;
            for (int j = 0; j < 26; j++) {
                if (freqSorted[i] == freq[j] && Used[j] == 0) {
                    Used[j] = 1;
                    ch = j;
                    break;
                }
            }
            String holder = "";
            int key = mostFreq.charAt(0) - 'A';
            key = key - ch;
            for (int k = 0; k < text.length(); k++) {
                if (text.charAt(k) == ' ') {
                    holder += (char) ' ';
                    continue;
                }
                int y = text.charAt(k) - 'A';
                y += key;
                if (y < 0)
                    y += 26;
                if (y > 25)
                    y -= 26;
                holder += (char) ('A' + y);
            }
            top[i] = holder;
        }
        return top;
    }

}
