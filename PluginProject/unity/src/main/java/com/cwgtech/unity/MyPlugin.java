package com.cwgtech.unity;

import android.util.Log;

/**
 * Created by colin on 2/4/18.
 */

public class MyPlugin {
    private static final MyPlugin ourInstance = new MyPlugin();

    private static final String LOGTAG = "CWGTech";

    public static MyPlugin getInstance() {
        return ourInstance;
    }

    private long startTime;

    private MyPlugin() {
        Log.i(LOGTAG,"Created MyPlugin");
        startTime = System.currentTimeMillis();
    }

    public double getElapsedTime()
    {
        return (System.currentTimeMillis()-startTime)/1000.0f;
    }
}
