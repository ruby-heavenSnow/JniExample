package com.jni.lib;

/**
 * author  lingfei.qi
 * time    2017/2/15 15:36
 * file    JniExample
 * desc
 */

public class NativeUtil {
  static {
    System.loadLibrary("NativeExample");
  }

  public static native String getStringFromNative();
}
