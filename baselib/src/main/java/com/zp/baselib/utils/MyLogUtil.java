package com.zp.baselib.utils;

import android.util.Log;

import com.zp.baselib.ZpBaseLib;

public class MyLogUtil {
    /**
     * 输出log,error级别的
     *
     * @param tag
     * @param info
     */
    public static void showLogE(String tag, String info) {
        if (ZpBaseLib.IS_DEBUG) {
            Log.e(tag, info);
        }
    }

    public static void showLogI(String tag, String info) {
        if (ZpBaseLib.IS_DEBUG) {
            Log.i(tag, info);
        }
    }
}
