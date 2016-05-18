package com.yangtao.criminalintent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by Yangtao on 2016/5/13.
 */
public class CrimeCameraActivity extends SingleFragmentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
       requestWindowFeature(Window.FEATURE_NO_TITLE);
       getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
    }

    @Override
    protected Fragment createFragment() {
        return new CrimeCameraFragment();
    }
}
