package zheng.simon.com.frame.ui.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stephentuso.welcome.WelcomeFinisher;
import com.stephentuso.welcome.WelcomePage;
import com.stephentuso.welcome.WelcomeUtils;

import zheng.simon.com.frame.R;

/**
 * Created by zhengyouquan on 08/02/2018.
 */

public class GuidePageFragment extends Fragment implements WelcomePage.OnChangeListener {

    private ViewGroup rootLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_guidepage, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rootLayout = view.findViewById(R.id.rootLayout);
        view.findViewById(R.id.entry).setOnClickListener(view1 -> {
            new WelcomeFinisher(GuidePageFragment.this).finish();
        });
    }

    @Override
    public void onWelcomeScreenPageScrolled(int pageIndex, float offset, int offsetPixels) {
        if (rootLayout != null)
        WelcomeUtils.applyParallaxEffect(rootLayout, true, offsetPixels, 0.3f, 0.2f);
    }

    @Override
    public void onWelcomeScreenPageSelected(int pageIndex, int selectedPageIndex) {

    }

    @Override
    public void onWelcomeScreenPageScrollStateChanged(int pageIndex, int state) {

    }
}
