package com.preccrep.spiralwords.activity;

import android.os.Bundle;
import android.content.Intent;

import com.preccrep.spiralwords.R;
import com.preccrep.spiralwords.util.StringUtils;

//import com.preccrep.spiralwords.api.Api;

import java.util.HashMap;

public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    protected int initLayout() {
        return 0;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    private void login(String account, String pwd) {
        if (StringUtils.isEmpty(account)) {
            showToast("请输入账号");
            return;
        }
        if (StringUtils.isEmpty(pwd)) {
            showToast("请输入密码");
            return;
        }
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("mobile", account);
        params.put("password", pwd);
//        Api.config(ApiConfig.LOGIN, params).postRequest(this,new TtitCallback() {
//            @Override
//            public void onSuccess(final String res) {
//                Log.e("onSuccess", res);
//                Gson gson = new Gson();
//                LoginResponse loginResponse = gson.fromJson(res, LoginResponse.class);
//                if (loginResponse.getCode() == 0) {
//                    String token = loginResponse.getToken();
//                    insertVal("token", token);
//                    navigateToWithFlags(HomeActivity.class,
//                            Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
//                    showToastSync("登录成功");
//                } else {
//                    showToastSync("登录失败");
//                }
//            }
//
//            @Override
//            public void onFailure(Exception e) {
//
//            }
//        });
    }

}