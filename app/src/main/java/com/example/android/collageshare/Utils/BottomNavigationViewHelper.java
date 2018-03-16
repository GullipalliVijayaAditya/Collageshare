package com.example.android.collageshare.Utils;
import android.util.Log;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

/**
 * Created by gvrao on 16-Mar-18.
 */

public class BottomNavigationViewHelper {


        private static final String TAG = "BottomNavigationViewHel";

        public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx){
            Log.d(TAG, "setupBottomNavigationView: Setting up BottomNavigationView");
            bottomNavigationViewEx.enableAnimation(false);
            bottomNavigationViewEx.enableItemShiftingMode(false);
            bottomNavigationViewEx.enableShiftingMode(false);
            bottomNavigationViewEx.setTextVisibility(false);

        }
    }
