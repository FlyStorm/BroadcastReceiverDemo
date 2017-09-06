package com.broadcastReceiverdemo.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

/**
 * 创建者     yangyanfei
 * 创建时间   2017/9/6 0006 17:20
 * 作用	      ${TODO}
 * <p/>
 * 版本       $$Rev$$
 * 更新者     $$Author$$
 * 更新时间   $$Date$$
 * 更新描述   ${TODO}
 */
public class NetWorkChangeReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        ConnectivityManager connectivityManager= (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo=connectivityManager.getActiveNetworkInfo();
        if(networkInfo!=null&&networkInfo.isAvailable()){
            Toast.makeText(context,"当前网络可用",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(context,"没有网络连接，请检查网络！",Toast.LENGTH_SHORT).show();
        }
//        Toast.makeText(context,"network changes",Toast.LENGTH_SHORT).show();
    }
}
