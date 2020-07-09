package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("wkTnaJPm1of35E6CsfZMrzpDMt6rkpnQSfo8yutF")
                // if defined
                .clientKey("6rjCM4VzRsjm4BdZwTnPuYWKrTrndYCOYtIAa835")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}
