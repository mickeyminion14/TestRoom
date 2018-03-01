package com.example.minion.testroom;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by minion on 22/02/2018 AD.
 */
@Database(entities = User.class,version = 2)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao getUserDao();
}
