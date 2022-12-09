package com.revature.problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<String> autoComplete(List<String> list) {
        List<String> returnList = new ArrayList<String>();
        String search = list.get(0);
        for(int i = 1; i < list.size(); i++){
            if(list.get(i).contains(search)){
                returnList.add(list.get(i));
                System.out.println(list.get(i));
            }
        }
        Collections.sort(returnList);
        return returnList;
    }
}
