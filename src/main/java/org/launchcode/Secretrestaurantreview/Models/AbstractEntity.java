package org.launchcode.Secretrestaurantreview.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

public abstract class AbstractEntity {

    @Id
    @GeneratedValue
    private int id;

    @NotBlank(message = "Name is mandatory.")
    @Size(max = 75, message = "Max length for name is 75 characters.")
    private String name;

    public AbstractEntity(String name) {
        this.name = name;
    }

    public AbstractEntity() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractEntity that = (AbstractEntity) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
