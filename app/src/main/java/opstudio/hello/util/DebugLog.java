package opstudio.hello.util;

import android.util.Log;

/**
 * Created by C-Class M3 on 2016-12-02.
 */

public class DebugLog {


    public static final boolean DEBUG = true;
    public static final String LOG_TAG = "DebugLog";

    public static final void logD(String tag, String log) {
        if (DEBUG) {
            Log.d(LOG_TAG, tag + " >>> " + log);
        }
    }

    public static final void logI(String tag, String log) {
        if (DEBUG) {
            Log.i(LOG_TAG, tag + " >>> " + log);
        }
    }

    public static final void logE(String tag, String log) {
        if (DEBUG) {
            Log.e(LOG_TAG, tag + " >>> " + log);
        }
    }

    public static final void logW(String tag, String log) {
        if (DEBUG) {
            Log.w(LOG_TAG, tag + " >>> " + log);
        }
    }
}
