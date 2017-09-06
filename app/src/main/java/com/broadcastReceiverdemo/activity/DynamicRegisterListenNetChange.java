package com.broadcastReceiverdemo.activity;

import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.broadcastReceiverdemo.broadcastreceiver.NetWorkChangeReceiver;

public class DynamicRegisterListenNetChange extends AppCompatActivity {

    private IntentFilter mIntentFilter;
    //声明广播
    private NetWorkChangeReceiver mNetWorkChangeReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_register_listen_net_change);

        mIntentFilter=new IntentFilter();
        mIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        mNetWorkChangeReceiver=new NetWorkChangeReceiver();
        registerReceiver(mNetWorkChangeReceiver,mIntentFilter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(mNetWorkChangeReceiver);
    }
}
