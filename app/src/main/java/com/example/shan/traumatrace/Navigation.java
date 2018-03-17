package com.example.shan.traumatrace;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Navigation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);


        String url="https://www.google.co.in/maps";
        WebView web = (WebView) findViewById(R.id.webView);
        web.loadUrl(url);

    }
}
