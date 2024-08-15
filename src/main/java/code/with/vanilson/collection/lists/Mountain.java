package code.with.vanilson.collection.lists;

import java.util.Objects;

/**
 * Mountain
 *
 * @author vamuhong
 * @version 1.0
 * @since 2024-08-15
 */
public class Mountain implements Comparable<Mountain> {
    private String name;

    private int height;

    public Mountain(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (!(o instanceof Mountain mountain)) {return false;}
        return height == mountain.height &&
                name.equals(mountain.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height);
    }

    /**
     * Compares this object with the specified object for order.
     * Implements the natural ordering of {@link Mountain} objects based on their height.
     *
     * @param o the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object is less than,
     * equal to, or greater than the specified object.
     * @throws NullPointerException if the specified object is null.
     */
    @Override
    public int compareTo(Mountain o) {
        return this.height - o.height;
    }

    @Override
    public String toString() {
        return "Mountain{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}