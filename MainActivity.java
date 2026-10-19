package com.gemechu.loancalculator;

import android.content.Context;
import android.os.Bundle;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;

import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final WebView web = getBridge().getWebView();
        // lets the page's "Print Result" button open Android's print dialog (print or save as PDF)
        web.addJavascriptInterface(new Object() {
            @JavascriptInterface
            public void print() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        PrintManager pm = (PrintManager) getSystemService(Context.PRINT_SERVICE);
                        String job = "Loan Calculator Result";
                        PrintDocumentAdapter adapter = web.createPrintDocumentAdapter(job);
                        pm.print(job, adapter, new PrintAttributes.Builder().build());
                    }
                });
            }
        }, "AndroidPrint");
    }
}
