package net.dydrich.nivola;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class PageActivity extends AppCompatActivity {

    TextView label;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);

        WebView myWebView = (WebView) findViewById(R.id.webView);
        myWebView.getSettings().setJavaScriptEnabled(true);

        Intent receivedIntent = getIntent();
        String url = (String) receivedIntent.getStringExtra("url");
        String textLabel = (String) receivedIntent.getStringExtra("label");

        label = (TextView) findViewById(R.id.textView4);
        label.setText(textLabel);

        myWebView.loadUrl(url);
    }
}
