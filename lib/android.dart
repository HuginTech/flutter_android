/* This is free and unencumbered software released into the public domain. */

/// Android bindings for Flutter.
library android;

import 'dart:async' show Future;

import 'package:flutter/services.dart' show MethodChannel;

export 'android_content.dart';
export 'android_os.dart';

/// Android metadata.
abstract class Android {
  static const MethodChannel _channel = MethodChannel('flutter_android/Android');

  /// Returns the Android platform version.
  static Future<String> get platformVersion async {
    return await _channel.invokeMethod('getPlatformVersion');
  }
}
