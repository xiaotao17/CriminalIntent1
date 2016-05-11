package com.yangtao.criminalintent;

import android.content.Context;
import android.transition.ArcMotion;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by YANGTAO on 2016/4/28.
 */
public class CrimeLab {
   private ArrayList<Crime> mCrimes;
    private static CrimeLab sCrimelab;
    private Context mAppContext;

    private CrimeLab(Context appContext) {
        mAppContext = appContext;
        mCrimes = new ArrayList<Crime>();
    }

    public static CrimeLab get(Context c) {
        if (sCrimelab == null) {
            sCrimelab = new CrimeLab(c.getApplicationContext());
        }
        return sCrimelab;
    }

    public ArrayList<Crime> getCrimes() {
        return mCrimes;
    }

    public Crime getCrime(UUID id){
        for (Crime c : mCrimes){
            if (c.getId().equals(id))
                return c;
        }
        return null;
    }

    public void addCrime(Crime c){
        mCrimes.add(c);
    }
}
