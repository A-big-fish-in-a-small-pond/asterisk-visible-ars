package com.example.asteriskfcm;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;

import androidx.navigation.ui.AppBarConfiguration;

import com.example.asteriskfcm.databinding.ActivityMainBinding;
import com.example.asteriskfcm.utils.logger.Logger;
import com.example.asteriskfcm.utils.network.MobileNetwork;
import com.example.asteriskfcm.vo.AccessUserVO;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);
        Log.d("KIM", MobileNetwork.getMobileIPAddress());


        AccessUserVO accessUserVO = new AccessUserVO();
        accessUserVO.setIpv4("127.0.0.1");
        accessUserVO.setToken("12312312");
        accessUserVO.setDate("2022-08-01");

        Gson gson = new Gson();

        Logger.info(gson.toJson(accessUserVO));
//        finish();

    }

}


