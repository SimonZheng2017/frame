package zheng.simon.com.frame.ui.login;

import android.support.v4.app.Fragment;

import com.stephentuso.welcome.BasicPage;
import com.stephentuso.welcome.FragmentWelcomePage;
import com.stephentuso.welcome.WelcomeActivity;
import com.stephentuso.welcome.WelcomeConfiguration;

import zheng.simon.com.frame.R;

/**
 * Created by zhengyouquan on 07/02/2018.
 */

public class GuideActivity extends WelcomeActivity {

    @Override
    protected WelcomeConfiguration configuration() {
        return new WelcomeConfiguration.Builder(this)
                .defaultBackgroundColor(R.color.color_white)
                .bottomLayout(WelcomeConfiguration.BottomLayout.INDICATOR_ONLY)
                .page(new BasicPage(R.drawable.guide1, "", ""))
                .page(new BasicPage(R.drawable.guide2, "", ""))
                .page(new BasicPage(R.drawable.guide3, "", ""))
                .page(new FragmentWelcomePage() {
                    @Override
                    protected Fragment fragment() {
                        return new GuidePageFragment();
                    }
                })
                .useCustomDoneButton(true)
                .build();
    }
}
