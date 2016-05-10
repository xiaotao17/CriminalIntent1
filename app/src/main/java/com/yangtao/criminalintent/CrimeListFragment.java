package com.yangtao.criminalintent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;

import java.util.ArrayList;

/**
 * Created by YANGTAO on 2016/5/10.
 */
public class CrimeListFragment extends ListFragment {
   private ArrayList<Crime> mCrimes;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.crimes_title);
        mCrimes = CrimeLab.get(getActivity()).getCrimes();
    }
}