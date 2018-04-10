package me.dragon.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListUtils {
    /**
     * 拆分list，按500条拆分
     * @param list
     * @return
     */
    public static List<List<String>> splitList(List<String> list){
        List<List<String>> lists = new ArrayList<List<String>>();
        List<String> subList = new ArrayList<String>();
        int size = list.size();
        int sum = 500;
        int count = size / sum;
        int yu = size % sum;
        if (count == 0) {
            lists.add(list);
        } else {
            if(size % sum != 0){
                count ++;
            }
            for (int i = 0; i < count; i++) {
                if(sum*(i+1) <= size){
                    subList = list.subList(sum*i, sum*(i+1));
                }else{
                    subList = list.subList(sum*i, sum*(i)+yu);
                }
                lists.add(subList);
            }
        }
        return lists;
    }
}
