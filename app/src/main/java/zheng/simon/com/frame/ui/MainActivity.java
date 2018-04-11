package zheng.simon.com.frame.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.stephentuso.welcome.WelcomeHelper;

import zheng.simon.com.frame.R;
import zheng.simon.com.frame.base.BaseActivity;
import zheng.simon.com.frame.ui.login.GuideActivity;

/**
 * Created by zhengyouquan on 06/02/2018.
 */

public class MainActivity extends BaseActivity {

    private WelcomeHelper welcomeScreen;

    @Override
    protected int setContentViewRes() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView(@Nullable Bundle savedInstanceState) {
        welcomeScreen = new WelcomeHelper(this, GuideActivity.class);
        welcomeScreen.show(savedInstanceState);
    }


    @Override
    protected void initListener() {

    }

    @Override
    protected void initData() {

    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // This is needed to prevent welcome screens from being
        // automatically shown multiple times

        // This is the only one needed because it is the only one that
        // is shown automatically. The others are only force shown.
        welcomeScreen.onSaveInstanceState(outState);
    }

}
