package com.manu.occasionreminder;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

/**
 * This activity takes in Occasion Name, Date, person name and notify time and saves it to Database.
 */
public class AddEventActivity extends AppCompatActivity {

    EditText mDate, mTime;
    EditText mOccasionName, mName;
    Button mSave;
    private String mOccasion, mNameOfThePerson, mOccasionDate, mNotifyTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_event);

        mOccasionName = findViewById(R.id.occasion_name);
        mName = findViewById(R.id.name);
        mDate = findViewById(R.id.text_view_date);
        mTime = findViewById(R.id.text_view_time);
        mSave = findViewById(R.id.save);

        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }

    @Override
    protected void onResume() {
        super.onResume();

        mOccasion = mOccasionName.getText().toString();
        mNameOfThePerson = mName.getText().toString();
        mOccasionDate = mDate.getText().toString();
        mNotifyTime = mTime.getText().toString();

        mSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: To add details to Database
            }
        });
    }
}
