package com.example.internship.myapplication2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.internship.myapplication2.model.DairySiteAssessment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.et_field_officer_name)
    EditText m_et_field_officer_name;
    @BindView(R.id.et_cbo_no)
    EditText m_et_cbo_no;
    @BindView(R.id.tv_current_no_cow)
    TextView m_tv_current_no_cow;

    @BindView(R.id.et_cross_milch_cow_qut)
    EditText m_et_cross_milch_cow_qut;
    @BindView(R.id.et_cross_milch_cow_price)
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
    @BindView(R.id.et_local_milch_cow_age)
    EditText m_et_local_milch_cow_age;

    @BindView(R.id.tv_local_total_cow)
    TextView m_tv_local_total_cow;
    @BindView(R.id.et_local_calf_cow_qut)
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

    ////RadioButton
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

    Spinner m_spinner_loan_type;
    //   @BindView(R.id.btn_save)
    Button m_btn_save;

    DairySiteAssessment assessment = new DairySiteAssessment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        declerSpinner();

        m_btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initializeValue();
            }
        });
    }

    private void declerSpinner() {
        m_spinner_loan_type = findViewById(R.id.spinner_loan_type);
        m_btn_save = findViewById(R.id.btn_save);
        List<String> categories = new ArrayList<>();
        categories.add("Select Type");
        categories.add("Bank");
        categories.add("Microfinance");
        categories.add("Not Prepared");
        categories.add("No Need Loan");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, categories);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        m_spinner_loan_type.setAdapter(dataAdapter);
    }
//    private void DeclerEditText() {
//        m_et_field_officer_name = findViewById(R.id.et_field_officer_name);
//        m_et_cbo_no = findViewById(R.id.et_cbo_no);
//
//        m_et_cross_milch_cow_qut = findViewById(R.id.et_cross_milch_cow_qut);
//        m_et_cross_milch_cow_price = findViewById(R.id.et_cross_milch_cow_price);
//        m_et_cross_milch_cow_age = findViewById(R.id.et_cross_milch_cow_age);
//
//        m_et_cross_calf_cow_qut = findViewById(R.id.et_cross_calf_cow_qut);
//        m_et_cross_calf_cow_price = findViewById(R.id.et_cross_calf_cow_price);
//        m_et_cross_calf_cow_age = findViewById(R.id.et_cross_calf_cow_age);
//
//        m_et_cross_male_cow_qut = findViewById(R.id.et_cross_male_cow_qut);
//        m_et_cross_male_cow_price = findViewById(R.id.et_cross_male_cow_price);
//        m_et_cross_male_cow_age = findViewById(R.id.et_cross_male_cow_age);
//
//        m_et_local_milch_cow_qut = findViewById(R.id.et_local_milch_cow_qut);
//        m_et_local_milch_cow_price = findViewById(R.id.et_local_milch_cow_price);
//        m_et_local_milch_cow_age = findViewById(R.id.et_local_milch_cow_age);
//
//        m_et_local_calf_cow_qut = findViewById(R.id.et_local_calf_cow_qut);
//        m_et_local_calf_cow_price = findViewById(R.id.et_local_calf_cow_price);
//        m_et_local_calf_cow_age = findViewById(R.id.et_local_calf_cow_age);
//
//        m_et_local_male_cow_qut = findViewById(R.id.et_local_male_cow_qut);
//        m_et_local_male_cow_price = findViewById(R.id.et_local_male_cow_price);
//        m_et_local_male_cow_age = findViewById(R.id.et_local_male_cow_age);
//
//        m_rg_cowshed_ans = findViewById(R.id.rg_cowshed_ans);
//        m_rg_pacca_floor_ans = findViewById(R.id.rg_pacca_floor_ans);
//
//        m_rg_business_activity_ans = findViewById(R.id.rg_business_activity_ans);
//        m_et_business_activity_comment = findViewById(R.id.et_business_activity_comment);
//
//        m_rg_proprietor_have_loan_ans = findViewById(R.id.rg_proprietor_have_loan_ans);
//        m_et_proprietor_have_loan_comment = findViewById(R.id.et_proprietor_have_loan_comment);
//
//        m_rg_training_from_ans = findViewById(R.id.rg_training_from_ans);
//
//        m_btn_save = findViewById(R.id.btn_save);
//    }

    @SuppressLint("SetTextI18n")
    private void initializeValue() {
        assessment.setFieldOfficer(returnEditTextValue(m_et_field_officer_name));
        assessment.setCBONo(returnEditTextValue(m_et_cbo_no));

        assessment.setCrossMilchCowQty(Integer.parseInt(returnEditTextValue(m_et_cross_milch_cow_qut)));
        assessment.setCrossMilchCowPrice(Integer.parseInt(returnEditTextValue(m_et_cross_milch_cow_price)));
        assessment.setCrossMilchCowAge(Double.parseDouble(returnEditTextValue(m_et_cross_milch_cow_age)));

        assessment.setCrossCalfCowQty(Integer.parseInt(returnEditTextValue(m_et_cross_calf_cow_qut)));
        assessment.setCrossCalfCowPrice(Integer.parseInt(returnEditTextValue(m_et_cross_calf_cow_price)));
        assessment.setCrossCalfCowAge(Double.parseDouble(returnEditTextValue(m_et_cross_calf_cow_age)));

        assessment.setCrossMaleCowQty(Integer.parseInt(returnEditTextValue(m_et_cross_male_cow_qut)));

        assessment.setCrossMaleCowPrice(Integer.parseInt(returnEditTextValue(m_et_cross_male_cow_price)));
        assessment.setCrossMaleCowAge(Double.parseDouble(returnEditTextValue(m_et_cross_male_cow_age)));


        assessment.setLocalMilchCowQty(Integer.parseInt(returnEditTextValue(m_et_local_milch_cow_qut)));
        assessment.setLocalMilchCowPrice(Integer.parseInt(returnEditTextValue(m_et_local_milch_cow_price)));
        assessment.setLocalMilchCowAge(Double.parseDouble(returnEditTextValue(m_et_local_milch_cow_age)));

        assessment.setLocalCalfCowQty(Integer.parseInt(returnEditTextValue(m_et_local_calf_cow_qut)));
        assessment.setLocalCalfCowPrice(Integer.parseInt(returnEditTextValue(m_et_local_calf_cow_price)));
        assessment.setLocalCalfCowAge(Double.parseDouble(returnEditTextValue(m_et_local_calf_cow_age)));

        assessment.setLocalMaleCowQty(Integer.parseInt(returnEditTextValue(m_et_local_male_cow_qut)));
        assessment.setLocalMaleCowPrice(Integer.parseInt(returnEditTextValue(m_et_local_male_cow_price)));
        assessment.setLocalMaleCowAge(Double.parseDouble(returnEditTextValue(m_et_local_male_cow_age)));


        assessment.setHasOwnerCowshed(returnRadioGroupValue(m_rg_cowshed_ans));
        assessment.setHasCowshedPaccaFloor(returnRadioGroupValue(m_rg_pacca_floor_ans));

        assessment.setHasOwnerOtherBusiness(returnRadioGroupValue(m_rg_business_activity_ans));
        assessment.setOtherBusinessName(returnEditTextValue(m_et_business_activity_comment));

        assessment.setHasOwnerCurrentLoan(returnRadioGroupValue(m_rg_proprietor_have_loan_ans));
        assessment.setLoanInstitutionName(returnEditTextValue(m_et_proprietor_have_loan_comment));

        assessment.setHasTrainingFrom(returnRadioGroupValue(m_rg_training_from_ans));
        assessment.setSuitableLoanType(m_spinner_loan_type.getSelectedItem().toString());

        int value = addValue(m_et_cross_milch_cow_qut, m_et_cross_calf_cow_qut, m_et_cross_male_cow_qut);
        int value2 = addValue(m_et_local_milch_cow_qut, m_et_local_calf_cow_qut, m_et_local_male_cow_qut);
        m_tv_cross_total_cow.setText("Cross Cow Total: " + value);
        m_tv_local_total_cow.setText("Local Cow Total: " + value2);
        m_tv_current_no_cow.setText("" + (value + value2));
    }

    private Integer addValue(EditText mi_Qt, EditText ca_Qt, EditText ma_Qt) {
        String Qt1 = mi_Qt.getText().toString();
        String Qt2 = ca_Qt.getText().toString();
        String Qt3 = ma_Qt.getText().toString();
        return Integer.parseInt(Qt1 + Qt2 + Qt3);
    }

    private String returnEditTextValue(EditText editText) {
        return editText.getText().toString();
    }

    private boolean returnRadioGroupValue(RadioGroup radioGroup) {
        RadioButton button = findViewById(radioGroup.getCheckedRadioButtonId());
        if (button.getText().toString().equals("Yes")) {
            return true;
        } else {
            return false;
        }
    }
}
