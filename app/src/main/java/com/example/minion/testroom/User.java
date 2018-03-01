package com.example.minion.testroom;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by minion on 22/02/2018 AD.
 */
@Entity
public class User {
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "uid")
    @NonNull
    private String uid;

    @ColumnInfo(name = "pass")
    private  String pass;

    public User(String uid,String pass)
    {
        this.uid=uid;
        this.pass=pass;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
