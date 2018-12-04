package com.example.internship.myapplication2.model;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface DairySiteAssessmentDao {

    @Query("SELECT * FROM DairySiteAssessment")
    List<DairySiteAssessment> getAll();

    @Query("SELECT * FROM DairySiteAssessment where id=:Id")
    DairySiteAssessment getId(Long Id);


    @Query("SELECT * FROM DairySiteAssessment where referenceId LIKE referenceId AND referenceType LIKE referenceType AND assessmentDate LIKE assessmentDate")
    long insert(DairySiteAssessment assessment);

    @Insert
    void insert(List<DairySiteAssessment> assessmentList);

    @Delete
    int delete(DairySiteAssessment person);

    @Delete
    int delete(List<DairySiteAssessment> assessmentList);

    @Query("DELETE FROM DairySiteAssessment")
    int delete();

    @Update
    void update(DairySiteAssessment person);

    @Update
    void update(List<DairySiteAssessment> assessmentList);
}

