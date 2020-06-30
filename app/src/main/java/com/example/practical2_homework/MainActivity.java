package com.example.practical2_homework;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private Button resetBtn;
    private Button countBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_name);
        resetBtn = (Button) findViewById(R.id.reset_zero);
        countBtn = (Button) findViewById(R.id.button_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,Toast.LENGTH_SHORT);

        toast.show();
    }

    public void countUp(View view){
        ++mCount;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

        if (mCount % 2 == 1)
            countBtn.setBackgroundColor(Color.parseColor("#EC4A2A"));
        else
            countBtn.setBackgroundColor(Color.parseColor("#2AEC39"));
    }

    public void resetZero(View view){
        mCount = 0;
        mShowCount.setText(Integer.toString(mCount));
        resetBtn.setBackgroundColor(Color.parseColor("#808080"));
    }
}