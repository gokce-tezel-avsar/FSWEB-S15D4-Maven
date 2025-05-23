package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WorkintechList<T extends Comparable<T>> {
    private List<T> workintechList = new ArrayList<>();

    public boolean add(T element) {
        if (!workintechList.contains(element)) {
            workintechList.add(element);
            sort();
            return true;
        }
        return false;
    }

    public void sort() {
        Collections.sort(workintechList);
    }

    public boolean remove(T element) {
        boolean removed = workintechList.remove(element);
        if (removed) {
            sort();
        }
        return removed;
    }

    public List<T> getList() {
        return new ArrayList<>(workintechList);
    }

    @Override
    public String toString() {
        return workintechList.toString();
    }
}
