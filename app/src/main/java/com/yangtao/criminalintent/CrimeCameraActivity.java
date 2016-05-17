package com.yangtao.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Yangtao on 2016/5/13.
 */
public class CrimeCameraActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeCameraFragment();
    }
}
