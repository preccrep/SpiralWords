package com.preccrep.spiralwords;

import android.view.View;

import com.preccrep.spiralwords.activity.BaseActivity;
import com.preccrep.spiralwords.activity.LoginActivity;
import com.preccrep.spiralwords.activity.RegisterActivity;
import com.preccrep.spiralwords.activity.HomeActivity;
import com.preccrep.spiralwords.util.StringUtils;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends BaseActivity {

    private Button btnLogin;
    private Button btnRegister;

    @Override
    protected int initLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        btnLogin = findViewById(R.id.btn_login);
        btnRegister = findViewById(R.id.btn_register);
    }

    @Override
    protected void initData() {
        if (!StringUtils.isEmpty(findByKey("token"))) {
            navigateTo(HomeActivity.class);
            finish();
        }
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent in = new Intent(MainActivity.this, LoginActivity.class);
//                startActivity(in);
                navigateTo(LoginActivity.class);
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent in = new Intent(MainActivity.this, RegisterActivity.class);
//                startActivity(in);
                navigateTo(RegisterActivity.class);
            }
        });
    }

}