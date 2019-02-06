package com.sonomixd.addnote.Model;

import javax.persistence.*;

@Entity
@Table
public class Task {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "task")
    private String task;

    @Column(name = "holderName")
    private String holderName;

    public Task(String task, String holderName) {
        this.task = task;
        this.holderName = holderName;
    }

    public Task() {
    }

    public Long getId() {
        return id;
    }


    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
}
