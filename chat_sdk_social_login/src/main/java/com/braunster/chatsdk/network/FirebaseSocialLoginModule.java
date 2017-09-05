package com.braunster.chatsdk.network;

import android.content.Context;

import co.chatsdk.core.NetworkManager;

/**
 * Created by ben on 9/5/17.
 */

public class FirebaseSocialLoginModule {

    public static void activate (Context context) {
        NetworkManager.shared().a.socialLogin = new FirebaseSocialLoginHandler(context);
    }

}