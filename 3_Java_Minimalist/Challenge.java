import java.util.TreeMap;
import java.util.SortedMap;

public class Challenge {

    String weightedSort(String text) {
        text = text.replaceAll("[,.-?!\\'_-]", "");
        String[] wordArray = text.split(" ");
        SortedMap<String, Integer> sortedWeightMap = new TreeMap<String, Integer>();
        String wString = "";
        for (String word : wordArray) {
            if(word.equals("")){
                continue;
            }
            int weight = weight(word);
            sortedWeightMap.put(word, weight);
        }
        for () {
            int weight = weight(word);
            wString = word + "|" + weight + "\n" + wString;
        }
        return wString;
    }

    int weight(String word) {
        int weight = 0;
        for (char c : word.toCharArray()) {
            weight += c;
        }
        return weight;
    }

}
