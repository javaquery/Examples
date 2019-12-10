package com.javaquery.core.immutable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Example of Immutable class in java.
 * @author javaQuery
 * @date 2019-12-10
 * @Github: https://github.com/javaquery/Examples
 */
public final class ImmutableClassLatLon {
    private final double latitude;
    private final double longitude;
    private final List<String> labels;

    /**
     * @param latitude
     * @param longitude
     * @param labels
     */
    public ImmutableClassLatLon(double latitude, double longitude, List<String> labels) {
        this.latitude = latitude;
        this.longitude = longitude;
        if(labels != null && !labels.isEmpty()){
            this.labels = new ArrayList<>(labels);
        }else{
            this.labels = null;
        }
    }

    /**
     * Will return new copy of List rather returning reference to current list.
     * @return
     */
    public List<String> getLabels() {
        return labels != null ? new ArrayList<>(labels) : null;
    }

    /**
     * Get new object of ImmutableClassLatLon with updated label.
     * @param label
     * @return ImmutableClassLatLon
     */
    public ImmutableClassLatLon addLabel(String label){
        List<String> temporary = new ArrayList<>();
        if(labels != null && !labels.isEmpty()){
            temporary.addAll(labels);
        }
        temporary.add(label);
        return new ImmutableClassLatLon(latitude, longitude, temporary);
    }

    public static void main(String[] args) {
        ImmutableClassLatLon classLatLon = new ImmutableClassLatLon(23.0225, 72.5714, Arrays.asList("India"));
        System.out.println("classLatLon address: " + classLatLon);

        System.out.println("\n- classLatLon getLabels and add label -");
        System.out.println("classLatLon labels before: " + classLatLon.getLabels());
        /* classLatLon.getLabels() will return new copy of List rather returning reference to current list */
        List<String> localLables = classLatLon.getLabels();
        localLables.add("Hindi");
        System.out.println("localLables: " + localLables);
        System.out.println("classLatLon labels after: " + classLatLon.getLabels());

        System.out.println("\n- add new label to classLatLon -");
        System.out.println("classLatLon add label before: " + classLatLon.getLabels());
        /* When new label is added it will return new object of ImmutableClassLatLon rather updating current object's list */
        ImmutableClassLatLon classLatLonNewLabel = classLatLon.addLabel("Asia");
        System.out.println("classLatLon add label after: " + classLatLon.getLabels());
        System.out.println("classLatLonNewLabel address: " + classLatLonNewLabel);
        System.out.println("classLatLonNewLabel labels: " + classLatLonNewLabel.getLabels());

    }
}
