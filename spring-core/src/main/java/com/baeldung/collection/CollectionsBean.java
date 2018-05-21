package com.baeldung.collection;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Gebruiker on 5/18/2018.
 */
public class CollectionsBean {

    @Autowired
    private List<String> nameList;

    private Set<String> nameSet;

    private Map<Integer, String> nameMap;

    public CollectionsBean() {
    }

    public CollectionsBean(Set<String> strings) {
        this.nameSet = strings;
    }

    @Autowired
    public void setNameMap(Map<Integer, String> nameMap) {
        this.nameMap = nameMap;
    }

    public void printNameList() {
        System.out.println(nameList);
    }

    public void printNameSet() {
        System.out.println(nameSet);
    }

    public void printNameMap() {
        System.out.println(nameMap);
    }
}
