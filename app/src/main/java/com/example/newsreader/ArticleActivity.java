package com.example.newsreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ArticleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);

        WebView webView = findViewById(R.id.webView);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

        Intent intent = getIntent();
        String url_string =intent.getStringExtra("url");
        try {
            webView.loadUrl(String.valueOf(new URL(url_string)));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        System.out.println(url_string);
        URL url = null;
//        String articleContent = "";
//        try {
//            url = new URL(url_string);
//            URLConnection urlConnection = (HttpURLConnection) url.openConnection();
//            InputStream inputStream = urlConnection.getInputStream();
//            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
//            int data = inputStreamReader.read();
//
//            while (data != -1) {
//                char current = (char) data;
//                articleContent += current;
//                data = inputStreamReader.read();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }



//        Log.i("HTML", articleContent);

















//        String data =intent.getStringExtra("content");
//        Log.i("Intent content",data);
//        String encodedHtml = Base64.encodeToString(articleContent.getBytes(), Base64.NO_PADDING);
//        webView.loadData(encodedHtml, "text/html", "base64");
    }
}
