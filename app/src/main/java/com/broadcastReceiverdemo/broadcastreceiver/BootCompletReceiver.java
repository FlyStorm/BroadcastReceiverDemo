package com.broadcastReceiverdemo.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * 创建者     yangyanfei
 * 创建时间   2017/9/7 0007 7:47
 * 作用	      ${TODO}
 * <p/>
 * 版本       $$Rev$$
 * 更新者     $$Author$$
 * 更新时间   $$Date$$
 * 更新描述   ${TODO}
 */
public class BootCompletReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"BootCompletReceiver：手机开机启动了！",Toast.LENGTH_SHORT).show();
    }
}
