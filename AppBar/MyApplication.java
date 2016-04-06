package com.example.android.appbar;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import android.util.Log;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Nuzulul Kurniansyah on 12/10/2015.
 */
public class MyApplication extends Application {
    public void onCreate(){
        super.onCreate();
        printHashKey();
    }
            public void printHashKey(){
                // Add code to print out the key hash
                try {
                    PackageInfo info = getPackageManager().getPackageInfo(
                            "com.facebook.samples.hellofacebook",
                            PackageManager.GET_SIGNATURES);
                    for (Signature signature : info.signatures) {
                        MessageDigest md = MessageDigest.getInstance("SHA");
                        md.update(signature.toByteArray());
                        Log.d("com:", Base64.encodeToString(md.digest(), Base64.DEFAULT));
                    }
                } catch (PackageManager.NameNotFoundException e) {

                } catch (NoSuchAlgorithmException e) {

                }
            }
}
