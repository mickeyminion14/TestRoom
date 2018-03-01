package com.example.minion.testroom;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by minion on 22/02/2018 AD.
 */
@Dao
public interface UserDao {
    @Query("SELECT * FROM  user")
    List<User>getAllUsers();


    @Query("SELECT * FROM user WHERE uid=:uid")
    User getPass(String uid);

    @Insert
    void insert(User... users);

    @Update
    void update(User ... users);

    @Delete
    void delete(User... users);


}
