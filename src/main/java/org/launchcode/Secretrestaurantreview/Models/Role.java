package org.launchcode.Secretrestaurantreview.Models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role extends AbstractEntity{

    public Role(String name) {
        super(name);
    }

}
