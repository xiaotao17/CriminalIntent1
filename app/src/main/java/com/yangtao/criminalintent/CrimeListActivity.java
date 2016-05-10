package com.yangtao.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by YANGTAO on 2016/5/10.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
