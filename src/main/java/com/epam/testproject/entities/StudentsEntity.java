package com.epam.testproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "STUDENTS", schema = "PUBLIC", catalog = "PUBLIC")
public class StudentsEntity {
    private int id;
    private String name;
    private String email;
    private GruntsEntity grunt;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

  //  @Column(name = "GRUNT_ID")
    @OneToOne(cascade = CascadeType.ALL)
    public GruntsEntity getGrunt() {
        return this.grunt;
    }

    public void setGrunt(GruntsEntity grunt) {
        this.grunt = grunt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentsEntity that = (StudentsEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (grunt != null ? !grunt.equals(that.grunt) : that.grunt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (grunt != null ? grunt.hashCode() : 0);
        return result;
    }
}
