package com.epam.testproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "GRUNTS", schema = "PUBLIC", catalog = "PUBLIC")
public class GruntsEntity {
    private int id;
    private Integer cash;
    private String description;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CASH")
    public Integer getCash() {
        return cash;
    }

    public void setCash(Integer cash) {
        this.cash = cash;
    }

    @Basic
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GruntsEntity that = (GruntsEntity) o;

        if (id != that.id) return false;
        if (cash != null ? !cash.equals(that.cash) : that.cash != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (cash != null ? cash.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
