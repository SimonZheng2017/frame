package zheng.simon.com.frame.app;

import zheng.simon.com.frame.app.ChannelUtil;

/**
 * Created by zhengyouquan on 06/02/2018.
 */

public class Constants {

    // 服务器地址
    public static String SERVER;

    public static boolean EnDebug;

    static {
        //开发环境
        if (ChannelUtil.isDEVChannel()) {
            EnDebug = true;

        } else {
            EnDebug = false;
        }
    }


}
