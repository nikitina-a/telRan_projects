package com.company;

import java.util.Comparator;

public class ComparatorByModel implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        if (o1.getModel().equals(o2.getModel())) {
            o1.compareTo(o2);
        }
        return o1.getModel().compareTo(o2.getModel());
    }
}
