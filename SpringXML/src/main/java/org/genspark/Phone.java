package org.genspark;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Phone {
    private String mob;

    public Phone(){}

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "mob='" + mob + '\'' +
                '}';
    }
}
