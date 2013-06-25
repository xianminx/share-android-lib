package com.example.app;

import android.app.Activity;
import android.os.Bundle;

public class UsingHelloActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        // calling the library project method
        com.example.lib.SayHello.say(this);
    }
}
