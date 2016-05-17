package com.yangtao.criminalintent;

import android.content.Context;
import android.transition.ArcMotion;
import android.util.Log;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by YANGTAO on 2016/4/28.
 */
public class CrimeLab {
    private static final String TAG = "CrimeLab";
    private static final String FILENAME = "crime.json";

    private ArrayList<Crime> mCrimes;
    private CriminalIntentJSONSerializer mSerializer;

    private static CrimeLab sCrimelab;
    private Context mAppContext;

    private CrimeLab(Context appContext) {
        mAppContext = appContext;
        mSerializer = new CriminalIntentJSONSerializer(mAppContext,FILENAME);
        try {
            mCrimes = mSerializer.loadCrimes();
        }catch (Exception e){
            mCrimes = new ArrayList<Crime>();
            Log.e(TAG,"Error loading crimes:",e);
        }
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

    public Crime getCrime(UUID id) {
        for (Crime c : mCrimes) {
            if (c.getId().equals(id))
                return c;
        }
        return null;
    }

    public void addCrime(Crime c) {
        mCrimes.add(c);
    }

    public void deleteCrime(Crime c){
        mCrimes.remove(c);
    }

    public boolean saveCrimes() {
        try {
            mSerializer.saveCrimes(mCrimes);
            Log.d(TAG,"crimes saved to file");
            return  true;
        }catch (Exception e){
            Log.e(TAG,"Error saving crimes:",e);
            return false;
        }
    }
}
