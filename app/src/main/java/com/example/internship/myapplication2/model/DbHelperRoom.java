package com.example.internship.myapplication2.model;

import java.util.List;

public interface DbHelperRoom {

    List<DairySiteAssessment> GetAllDairySiteAssessment();

    DairySiteAssessment GetIdByDairySiteAssessment(Long Id);

    Long insertAssessment(DairySiteAssessment assessment);

    void insertAssessment(List<DairySiteAssessment> assessmentList);

    void deleteSingleDateSourceAssessment(DairySiteAssessment assessment);

    int deleteDateSourceAssessment(List<DairySiteAssessment> assessmentList);

    int deleteAllDateSourceAssessment();

    void updateAssessment(DairySiteAssessment assessment);

    void updateAssessment(List<DairySiteAssessment> assessment);

}
