package com.common.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 * User: luowei
 * Date: 12-12-27
 * Time: 下午3:18
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class User {

    public User() {
    }

    public User(int id, String username, String password, String sex,
                int age, String address, String profile) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.age = age;
        this.address = address;
        this.profile = profile;
    }

    private int id;

    @javax.persistence.Column(name = "id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    @Id
    public int getId() {
        return id;
    }

    public User setId(int id) {
        this.id = id;
        return this;
    }

    private String username;

    @javax.persistence.Column(name = "username", nullable = false, insertable = true, updatable = true, length = 20, precision = 0)
    @Basic
    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    private String password;

    @javax.persistence.Column(name = "password", nullable = false, insertable = true, updatable = true, length = 200, precision = 0)
    @Basic
    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    private String sex;

    @javax.persistence.Column(name = "sex", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    @Basic
    public String getSex() {
        return sex;
    }

    public User setSex(String sex) {
        this.sex = sex;
        return this;
    }

    private int age;

    @javax.persistence.Column(name = "age", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    @Basic
    public int getAge() {
        return age;
    }

    public User setAge(int age) {
        this.age = age;
        return this;
    }

    private String address;

    @javax.persistence.Column(name = "address", nullable = true, insertable = true, updatable = true, length = 200, precision = 0)
    @Basic
    public String getAddress() {
        return address;
    }

    public User setAddress(String address) {
        this.address = address;
        return this;
    }

    private String profile;

    @javax.persistence.Column(name = "profile", nullable = true, insertable = true, updatable = true, length = 1024, precision = 0)
    @Basic
    public String getProfile() {
        return profile;
    }

    public User setProfile(String profile) {
        this.profile = profile;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        if (id != user.id) return false;
        if (address != null ? !address.equals(user.address) : user.address != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (profile != null ? !profile.equals(user.profile) : user.profile != null) return false;
        if (sex != null ? !sex.equals(user.sex) : user.sex != null) return false;
        if (username != null ? !username.equals(user.username) : user.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (profile != null ? profile.hashCode() : 0);
        return result;
    }
}
