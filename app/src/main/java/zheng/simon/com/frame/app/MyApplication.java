package zheng.simon.com.frame.app;

import android.content.Context;
import android.support.multidex.MultiDexApplication;

import com.facebook.stetho.Stetho;

import photoselector.util.FrescoUtil;

/**
 * Created by zhengyouquan on 06/02/2018.
 */

public class MyApplication extends MultiDexApplication{

    private static MyApplication app;


    public static MyApplication getInstance() {
        return app;
    }

    /**
     * 获取Application的引用
     *
     * @return
     */
    public static Context getAppContext() {
        return app.getApplicationContext();
    }


    @Override
    public void onCreate() {
        super.onCreate();

        app = this;

        FrescoUtil.Init(this);

        if (Constants.EnDebug) {
            Stetho.initializeWithDefaults(this);
        } else {

        }

    }
}
