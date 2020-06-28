package com.example.appejerciciodoce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Actividad2 extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        webView = (WebView) findViewById(R.id.webView);

        Bundle bundle = getIntent().getExtras();
        String dato = bundle.getString("direccion");
        webView.loadUrl("http://"+dato);
    }
}