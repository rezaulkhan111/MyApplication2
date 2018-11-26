package com.example.internship.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.internship.myapplication2.model.DairySiteAssessment;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.et_field_officer_name)
    EditText m_et_field_officer_name;
    @BindView(R.id.et_cbo_no)
    EditText m_et_cbo_no;
    @BindView(R.id.tv_current_no_cow)
    TextView m_tv_current_no_cow;

    @BindView(R.id.et_cross_milch_cow_qut)
    EditText m_et_cross_milch_cow_qut;
    @BindView(R.id.et_cross_male_cow_price)
    EditText m_et_cross_milch_cow_price;
    @BindView(R.id.et_cross_milch_cow_age)
    EditText m_et_cross_milch_cow_age;

    @BindView(R.id.tv_cross_total_cow)
    TextView m_tv_cross_total_cow;
    @BindView(R.id.et_cross_calf_cow_qut)
    EditText m_et_cross_calf_cow_qut;
    @BindView(R.id.et_cross_calf_cow_price)
    EditText m_et_cross_calf_cow_price;
    @BindView(R.id.et_cross_calf_cow_age)
    EditText m_et_cross_calf_cow_age;

    @BindView(R.id.et_cross_male_cow_qut)
    EditText m_et_cross_male_cow_qut;
    @BindView(R.id.et_cross_male_cow_price)
    EditText m_et_cross_male_cow_price;
    @BindView(R.id.et_cross_male_cow_age)
    EditText m_et_cross_male_cow_age;

    @BindView(R.id.et_local_milch_cow_qut)
    EditText m_et_local_milch_cow_qut;
    @BindView(R.id.et_local_milch_cow_price)
    EditText m_et_local_milch_cow_price;
    @BindView(R.id.et_local_male_cow_age)
    EditText m_et_local_milch_cow_age;

    @BindView(R.id.tv_local_total_cow)
    TextView m_tv_local_total_cow;
    @BindView(R.id.et_local_milch_cow_qut)
    EditText m_et_local_calf_cow_qut;
    @BindView(R.id.et_local_calf_cow_price)
    EditText m_et_local_calf_cow_price;
    @BindView(R.id.et_local_calf_cow_age)
    EditText m_et_local_calf_cow_age;

    @BindView(R.id.et_local_male_cow_qut)
    EditText m_et_local_male_cow_qut;
    @BindView(R.id.et_local_male_cow_price)
    EditText m_et_local_male_cow_price;
    @BindView(R.id.et_local_male_cow_age)
    EditText m_et_local_male_cow_age;

    @BindView(R.id.rg_cowshed_ans)
    RadioGroup m_rg_cowshed_ans;
    @BindView(R.id.rg_pacca_floor_ans)
    RadioGroup m_rg_pacca_floor_ans;

    @BindView(R.id.rg_business_activity_ans)
    RadioGroup m_rg_business_activity_ans;
    @BindView(R.id.et_business_activity_comment)
    EditText m_et_business_activity_comment;

    @BindView(R.id.rg_proprietor_have_loan_ans)
    RadioGroup m_rg_proprietor_have_loan_ans;
    @BindView(R.id.et_proprietor_have_loan_comment)
    EditText m_et_proprietor_have_loan_comment;

    @BindView(R.id.rg_training_from_ans)
    RadioGroup m_rg_training_from_ans;

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner_loan_type);


    }


    private void DeclerID() {
        DairySiteAssessment assessment = new DairySiteAssessment();


        assessment.setFieldOfficer(String.valueOf(m_et_field_officer_name.getText()));
        assessment.setCBONo(String.valueOf(m_et_cbo_no.getText()));

        assessment.setCrossMilchCowQty(Integer.parseInt(m_et_cross_male_cow_qut.getText().toString()));
        assessment.setCrossMilchCowPrice(Integer.parseInt(m_et_cross_male_cow_price.getText().toString()));
        assessment.setCrossMilchCowAge(Double.parseDouble(m_et_cross_male_cow_age.getText().toString()));

        assessment.setCrossCalfCowQty(Integer.parseInt(m_et_cross_calf_cow_qut.getText().toString()));
        assessment.setCrossCalfCowPrice(Integer.parseInt(m_et_cross_calf_cow_price.getText().toString()));
        assessment.setCrossCalfCowAge(Double.parseDouble(m_et_cross_calf_cow_age.getText().toString()));

        assessment.setCrossMaleCowQty(Integer.parseInt(m_et_cross_male_cow_qut.getText().toString()));
        assessment.setCrossMaleCowPrice(Integer.parseInt(m_et_cross_male_cow_price.getText().toString()));
        assessment.setCrossMaleCowAge(Double.parseDouble(m_et_cross_male_cow_age.getText().toString()));

        assessment.setLocalMilchCowQty(Integer.parseInt(m_et_local_calf_cow_qut.getText().toString()));
        assessment.setLocalMilchCowPrice(Integer.parseInt(m_et_local_milch_cow_price.getText().toString()));
        assessment.setLocalMilchCowAge(Double.parseDouble(m_et_local_milch_cow_age.getText().toString()));

        assessment.setLocalCalfCowQty(Integer.parseInt(m_et_local_calf_cow_qut.getText().toString()));
        assessment.setLocalCalfCowPrice(Integer.parseInt(m_et_local_calf_cow_price.getText().toString()));
        assessment.setLocalCalfCowAge(Double.parseDouble(m_et_local_calf_cow_age.getText().toString()));

        assessment.setLocalMaleCowQty(Integer.parseInt(m_et_local_male_cow_qut.getText().toString()));
        assessment.setLocalMaleCowPrice(Integer.parseInt(m_et_local_male_cow_price.getText().toString()));
        assessment.setLocalMaleCowAge(Double.parseDouble(m_et_local_male_cow_age.getText().toString()));

        // int l=m_rg_cowshed_ans
//        assessment.setHasOwnerCowshed();
//        assessment.setHasCowshedPaccaFloor();
//
//        assessment.setHasOwnerOtherBusiness();
        assessment.setOtherBusinessName(m_et_business_activity_comment.getText().toString());

//        assessment.setHasOwnerCurrentLoan();
        assessment.setLoanInstitutionName(m_et_proprietor_have_loan_comment.getText().toString());

//        assessment.setSuitableLoanType();
    }
}
