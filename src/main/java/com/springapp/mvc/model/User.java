package com.springapp.mvc.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Tian Wang on 2015/3/24.
 */

public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String password;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date time;

    public User() {
        super();
    }

    public User(String name, String password) {
        super();
        this.name = name;
        this.password = password;
    }

    public User(Integer id, String name, String password, Date time) {
        super();
        this.id = id;
        this.name = name;
        this.password = password;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", password=" + password
                + ", time=" + time + "]";
    }
}