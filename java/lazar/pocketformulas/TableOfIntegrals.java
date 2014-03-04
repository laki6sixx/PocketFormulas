package lazar.pocketformulas;

import android.app.ActionBar;
import android.app.Fragment;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Lazar on 2/16/14.
 */
public class TableOfIntegrals extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public void onStart() {
        super.onStart();
    }
    @Override
    public void onStop() {
        super.onStop();
    }

    private String doubleEscapeTeX(String s) {
        String t="";
        for (int i=0; i < s.length(); i++) {
            if (s.charAt(i) == '\'') t += '\\';
            if (s.charAt(i) != '\n') t += s.charAt(i);
            if (s.charAt(i) == '\\') t += "\\";
        }
        return t;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tableofintegrals, container, false);
        ActionBar bar = getActivity().getActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.BrightBlue)));
        bar.setTitle("Table of Integrals");

        final WebView wFirst = (WebView) v.findViewById(R.id.tableOfIntegralsWebView);
        wFirst.getSettings().setJavaScriptEnabled(true);
        wFirst.setBackgroundColor(0x00000000);

        wFirst.loadDataWithBaseURL("http://bar", "<script type='text/x-mathjax-config'>"
                + "MathJax.Hub.Config({ "
                + "showMathMenu: false, "
                + "jax: ['input/TeX','output/HTML-CSS'], "
                + "extensions: ['tex2jax.js'], "
                + "TeX: { extensions: ['AMSmath.js','AMSsymbols.js',"
                + "'noErrors.js','noUndefined.js'] } "
                + "});</script>"
                + "<script type='text/javascript' "
                + "src='file:///android_asset/MathJax/MathJax.js'"
                + "></script>"
                + "<p style='color: #32b3e2'>Power of x:</p> <span id='prva'></span> <span id='vtora'></span> <p style='color: #32b3e2'>Exponential / Logarithmic:</p>  <span id='treta'></span>  <span id='cetvrta'></span>  <span id='peta'></span>", "text/html", "utf-8", ""
        );
        wFirst.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                if (!url.startsWith("http://bar")) return;

                //Replace the formula string below!!!
                wFirst.loadUrl("javascript:document.getElementById('prva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.tableOfIntegralsPrva)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('vtora').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.tableOfIntegralsVtora)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('treta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.tableOfIntegralsTreta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('cetvrta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.tableOfIntegralsCetvrta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('peta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.tableOfIntegralsPeta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");
            }
        });

        return v;
    }
    @Override
    public void onResume() {
        super.onResume();
    }
}
