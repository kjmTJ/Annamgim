package com.worldofuiux.fashionprofileuikit.Auth;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.fingerprint.FingerprintManager;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;

import com.worldofuiux.fashionprofileuikit.MainActivity;

//@TargetApi(Build.VERSION_CODES.M)
//public class FingerprintHandler extends FingerprintManager.AuthenticationCallback {
//    CancellationSignal cancellationSignal;
//    private Context context;
//
//    public FingerprintHandler(Context context) {
//        this.context = context;
//    }
//
//    //메소드들 정의
//    public void startAutho(FingerprintManager fingerprintManager, FingerprintManager.CryptoObject cryptoObject) {
//        cancellationSignal = new CancellationSignal();
//        fingerprintManager.authenticate(cryptoObject, cancellationSignal, 0, this, null);
//
//    }
//
//    @Override
//    public void onAuthenticationError(int errorCode, CharSequence errString) {
//        this.update("인증 에러 발생" + errString, false);
//    }
//
//    @Override
//    public void onAuthenticationFailed() {
//        this.update("인증 실패", false);
//    }
//
//    @Override
//    public void onAuthenticationHelp(int helpCode, CharSequence helpString) {
//        this.update("Error: " + helpString, false);
//    }
//
//    @Override
//    public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult result) {
//        this.update("앱 접근이 허용되었습니다.", true);
//    }
//
//    public void stopFingerAuth() {
//        if (cancellationSignal != null && !cancellationSignal.isCanceled()) {
//            cancellationSignal.cancel();
//        }
//    }
//
//    private void update(String s, boolean b) {
//        //안내 메세지 출력
//        if(b == false){
//
//        } else {//지문인증 성공
//            //sound effect
//            Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
//            Ringtone r = RingtoneManager.getRingtone((Activity)context, notification);
//            r.play();
//        }
//    }
//}
