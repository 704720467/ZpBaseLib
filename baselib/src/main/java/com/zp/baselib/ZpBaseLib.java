package com.zp.baselib;

import android.content.Context;

/**
 * 基础控件配置类
 * Create by zp on 2019-12-11
 */
public class ZpBaseLib {
    public static Context mContext;
    public static boolean IS_DEBUG = true;

    public static void initZpBaseLib(Context context, boolean isDebug) {
        mContext = context;
        IS_DEBUG = isDebug;
    }
}
