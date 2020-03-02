package SimpleDictionary;

import SimpleDictionary.Word;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class DictManage {
    Map<String,String> wordList = new TreeMap<>();
    public void initializeWordList(){
        wordList.put("Hello", "Xin chao, Hi");
        wordList.put("say", "noi");
    }
    public void addWord(Word newWord){
        wordList.put(newWord.getWord(),newWord.getMean());
    }
    public String search(String searchingWord){
        Iterator<Map.Entry<String, String>> entryKey = wordList.entrySet().iterator();
        try {
            while (entryKey.hasNext()){
                Map.Entry<String, String> currentEntry = entryKey.next();
                if(currentEntry.getKey().equalsIgnoreCase(searchingWord)){
                    return currentEntry.getValue();
                }
            }
        }catch (NullPointerException e){
            System.out.println("List is empty");
        }
        return "";
    }
}

