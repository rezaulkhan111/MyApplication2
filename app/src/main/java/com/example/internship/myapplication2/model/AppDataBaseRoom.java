package com.example.internship.myapplication2.model;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {DairySiteAssessment.class}, version = 1, exportSchema = false)
public abstract class AppDataBaseRoom extends RoomDatabase {
    public abstract DairySiteAssessmentDao dairySiteAssessmentDao();
}
