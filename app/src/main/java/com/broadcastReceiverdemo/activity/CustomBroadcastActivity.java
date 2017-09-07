package com.broadcastReceiverdemo.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CustomBroadcastActivity extends AppCompatActivity {
    //声明控件
    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_broadcast);

        //实例化控件
        btn1= (Button) findViewById(R.id.btn_custom_broadcast);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent("com.example.broadcast.MY_BROADCAST");
                sendBroadcast(intent);
            }
        });
    }
}
