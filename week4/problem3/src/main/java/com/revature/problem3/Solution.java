package com.revature.problem3;

import java.util.*;

public class Solution {
    public String wordCount(String sentence) {
        //make a dictionary of words
        sentence.toLowerCase();
        String[] words = sentence.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for(String word : words){
            if(map.containsKey(word)){
                map.computeIfPresent(word, (k, v) -> v + 1); //Increases the value by 1
            } else {
                map.put(word,1);
            }
        }
        //Iterate through the map?
        return "";
    }
}
