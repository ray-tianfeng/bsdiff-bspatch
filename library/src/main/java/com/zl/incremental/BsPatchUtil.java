package com.zl.incremental;

/**
 * Time: 2020/4/2 0002
 * Author: zoulong
 */
public class BsPatchUtil {
    static {
        System.loadLibrary("bs-diff");
    }

    public static native int bsPatch(String oldPath, String patch, String newPath);
}
