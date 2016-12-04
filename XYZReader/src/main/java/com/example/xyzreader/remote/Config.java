package com.example.xyzreader.remote;

import android.util.Log;

import java.net.MalformedURLException;
import java.net.URL;

class Config {

    private static final String LOG_TAG = Config.class.getSimpleName();
    static final URL BASE_URL;


    static {
        URL url = null;
        try {
            url = new URL("https://dl.dropboxusercontent.com/u/231329/xyzreader_data/data.json" );
        } catch (MalformedURLException ignored) {
            Log.e(LOG_TAG, ignored.getMessage(), ignored);
        }

        BASE_URL = url;
    }
}
