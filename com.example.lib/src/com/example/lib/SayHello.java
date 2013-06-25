package com.example.lib;
import android.content.Context;
import android.util.Log;

public class SayHello{
	public static void say(Context context){
		String s= context.getString(R.string.hello);
		Log.d("SayHello", s);
	}
}
