/* This is free and unencumbered software released into the public domain. */

package com.github.drydart.flutter_android;

import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry.Registrar;

/** FlutterAndroidPlugin */
public class FlutterAndroidPlugin {

  /** Plugin registration. */
  public static void registerWith(final Registrar registrar) {
    assert(registrar != null);

    (new MethodChannel(registrar.messenger(), ActivityManagerHandler.CHANNEL))
      .setMethodCallHandler(new ActivityManagerHandler(registrar));

    (new MethodChannel(registrar.messenger(), AndroidHandler.CHANNEL))
      .setMethodCallHandler(new AndroidHandler(registrar));

    (new MethodChannel(registrar.messenger(), BluetoothAdapterHandler.CHANNEL))
      .setMethodCallHandler(new BluetoothAdapterHandler(registrar));

    (new MethodChannel(registrar.messenger(), BluetoothDeviceHandler.CHANNEL))
      .setMethodCallHandler(new BluetoothDeviceHandler(registrar));

    (new MethodChannel(registrar.messenger(), BluetoothHeadsetHandler.CHANNEL))
      .setMethodCallHandler(new BluetoothHeadsetHandler(registrar));

    (new MethodChannel(registrar.messenger(), BluetoothLeScannerHandler.CHANNEL))
      .setMethodCallHandler(new BluetoothLeScannerHandler(registrar));

    (new MethodChannel(registrar.messenger(), BluetoothManagerHandler.CHANNEL))
      .setMethodCallHandler(new BluetoothManagerHandler(registrar));

    (new MethodChannel(registrar.messenger(), ContextHandler.CHANNEL))
      .setMethodCallHandler(new ContextHandler(registrar));

    (new MethodChannel(registrar.messenger(), EnvironmentHandler.CHANNEL))
      .setMethodCallHandler(new EnvironmentHandler(registrar));

    (new MethodChannel(registrar.messenger(), FaceDetectorHandler.CHANNEL))
      .setMethodCallHandler(new FaceDetectorHandler(registrar));

    (new MethodChannel(registrar.messenger(), SharedPreferencesHandler.CHANNEL))
      .setMethodCallHandler(new SharedPreferencesHandler(registrar));
  }
}
