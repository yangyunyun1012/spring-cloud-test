package com.arvatosystem.web.model;

import org.springframework.stereotype.Component;

/**
 * Created by Celine.Yang on 2017/7/4.
 */
@Component
public class User {
    private Integer userId;
    private String name;
    private String comment;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
