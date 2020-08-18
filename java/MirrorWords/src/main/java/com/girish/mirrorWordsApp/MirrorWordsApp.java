package com.girish.mirrorWordsApp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MirrorWordsApp {
    public static void main(String[] args) {
        String word1 = "sample";
        String word2 = "plesam";

        int retVal = isSameReflection(word1, word2);
        System.out.println(retVal);
    }

    private static int isSameReflection(String word1, String word2) {
        int retVal = -1;
        int index = 0;
        HashMap<String, Integer> mirrorWordCount = new HashMap<String, Integer>();

        if (word1.length() == word2.length()) {
            int strLength = word1.length();
            for (int i = 0; i < strLength; i++) {
                String w1 = word1.substring(i) + word1.substring(index, i);
                String w2 = word2.substring(i) + word2.substring(index, i);

                if(mirrorWordCount.containsKey(w1)) {
                    int count = mirrorWordCount.get(w1) + 1;
                    mirrorWordCount.put(w1, count);
                } else {
                    mirrorWordCount.put(w1, 0);
                }

                if(mirrorWordCount.containsKey(w2)) {
                    int count = mirrorWordCount.get(w2) + 1;
                    mirrorWordCount.put(w2, count);
                } else {
                    mirrorWordCount.put(w2, 0);
                }

                Set<Integer> values = new HashSet<Integer>(mirrorWordCount.values());
                if (values.size() == 1) {
                    retVal = 1;
                }
            }
        }
        return retVal;
    }
}
