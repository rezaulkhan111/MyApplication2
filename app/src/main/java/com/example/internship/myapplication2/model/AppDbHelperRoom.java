package com.example.internship.myapplication2.model;


import android.arch.persistence.db.SimpleSQLiteQuery;
import android.arch.persistence.room.Room;
import android.content.Context;
import android.database.Cursor;

import java.util.List;

public class AppDbHelperRoom implements DbHelperRoom {
    private String DB_NAME = "db_task";

    private AppDataBaseRoom db;
    private Context mcontext;

    public AppDbHelperRoom(Context context) {
        mcontext = context;
        this.db = Room.databaseBuilder(mcontext, AppDataBaseRoom.class, DB_NAME).allowMainThreadQueries().fallbackToDestructiveMigration().build();
    }

    @Override
    public List<DairySiteAssessment> GetAllDairySiteAssessment() {
        return db.dairySiteAssessmentDao().getAll();
    }

    @Override
    public DairySiteAssessment GetIdByDairySiteAssessment(Long Id) {
        return db.dairySiteAssessmentDao().getId(Id);
    }

    @Override
    public Long insertAssessment(DairySiteAssessment assessment) {
        // String query = "SELECT * FROM DairySiteAssessment where referenceId LIKE referenceId AND referenceType LIKE referenceType AND assessmentDate LIKE assessmentDate";
        Cursor corsor = db.query(new SimpleSQLiteQuery("SELECT * FROM DairySiteAssessment where referenceId == referenceId AND referenceType == referenceType AND assessmentDate LIKE assessmentDate"));
        if (corsor.equals(assessment)) {
            return db.dairySiteAssessmentDao().insert(new DairySiteAssessment());
        } else {
            return db.dairySiteAssessmentDao().insert(assessment);
        }
    }

    @Override
    public void insertAssessment(List<DairySiteAssessment> assessmentList) {
        db.dairySiteAssessmentDao().insert(assessmentList);
    }

    @Override
    public void deleteSingleDateSourceAssessment(DairySiteAssessment assessment) {
        db.dairySiteAssessmentDao().delete(assessment);
    }

    @Override
    public int deleteDateSourceAssessment(List<DairySiteAssessment> assessmentList) {
        return db.dairySiteAssessmentDao().delete(assessmentList);
    }

    @Override
    public int deleteAllDateSourceAssessment() {
        return db.dairySiteAssessmentDao().delete();
    }

    @Override
    public void updateAssessment(DairySiteAssessment assessment) {
        db.dairySiteAssessmentDao().update(assessment);
    }

    @Override
    public void updateAssessment(List<DairySiteAssessment> assessmentList) {
        db.dairySiteAssessmentDao().update(assessmentList);
    }

}
