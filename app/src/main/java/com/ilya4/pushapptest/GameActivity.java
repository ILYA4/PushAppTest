package com.ilya4.pushapptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);
        WebView gameView = (WebView) findViewById(R.id.ramses_treasure);
        int game = getIntent().getIntExtra("game", 0);
        WebSettings webSettings = gameView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setAllowFileAccessFromFileURLs(true);
        webSettings.setDomStorageEnabled(true);
        switch (game){
            case 1:gameView.loadUrl("file:///android_asset/games/game1/index.html");
            break;
            case 2:gameView.loadUrl("file:///android_asset/games/game2/index.html");
            break;
        }
    }


}
