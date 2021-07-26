package com.example.olx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.broooapps.otpedittext2.OnCompleteListener;
import com.broooapps.otpedittext2.OtpEditText;

public class GetOTP extends AppCompatActivity {
    private OtpEditText otpEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_otp);
        otpEditText = findViewById(R.id.etOtp);
        otpEditText.setOnCompleteListener(new OnCompleteListener() {
            @Override
            public void onComplete(String value) {
                activityTriversalWithAnimation(MainActivity.class);
            }
        });
    }
    private void activityTriversalWithAnimation(Class classname) {
        Intent intent = new Intent(GetOTP.this, classname);
        startActivity(intent);
    }
}