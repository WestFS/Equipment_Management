package org.management.model;

public final class Location {
    private int id;
    private boolean isAllocated;
    private String locationSpecs;  // -> Campo para MongoDB



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAllocated() {
        return isAllocated;
    }

    public void setAllocated(boolean allocated) {
        isAllocated = allocated;
    }

    public String getLocationSpecs() {
        return locationSpecs;
    }

    public void setLocationSpecs(String locationSpecs) {
        this.locationSpecs = locationSpecs;
    }
}
