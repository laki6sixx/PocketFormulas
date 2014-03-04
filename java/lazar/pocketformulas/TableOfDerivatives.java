package lazar.pocketformulas;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Fragment;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;

/**
 * Created by Lazar on 2/16/14.
 */
public class TableOfDerivatives extends Fragment {


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
        View v = inflater.inflate(R.layout.tableofderivatives, container, false);
        ActionBar bar = getActivity().getActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.GreenTrTrigonometricIdentities)));
        bar.setTitle("Table of Derivatives");

        final WebView wFirst = (WebView) v.findViewById(R.id.tableOfDerivativesWebView);
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
                + "<p style='color: #9cbe5b'>Power of x:</p> <span id='prva'></span> <span id='vtora'></span>  <span id='treta'></span>  <p style='color: #9cbe5b'>Exponential / Logarithmic:</p>  <span id='cetvrta'></span>  <span id='peta'></span> <span id='sesta'></span>  <p style='color: #9cbe5b'>Trigonometric:</p>  <span id='sedma'></span>  <span id='osma'></span>  <span id='deveta'></span>  <span id='deseta'></span>  <span id='edinaesta'></span>  <span id='dvanaesta'></span>   <p style='color: #9cbe5b'>Inverse Trigonometric:</p>   <span id='trinaesta'></span>   <span id='cetirinaesta'></span>   <span id='petnaesta'></span>   <span id='sesnaesta'></span>   <span id='sedumnaesta'></span>   <span id='osumnaesta'></span>   <p style='color: #9cbe5b'>Hyprbolic:</p>  <span id='devetnaesta'></span>  <span id='dvaesta'></span>  <span id='dvaesetiprva'></span>  <span id='dvaesetivtora'></span>  <span id='dvaesetitreta'></span>  <span id='dvaeseticetvrta'></span>", "text/html", "utf-8", ""
        );
        wFirst.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                if (!url.startsWith("http://bar")) return;

                //Replace the formula string below!!!
                wFirst.loadUrl("javascript:document.getElementById('prva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.tableOfDerivativesPrva)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('vtora').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.tableOfDerivativesVtora)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('treta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.tableOfDerivativesTreta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('cetvrta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.tableOfDerivativesCetvrta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('peta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.tableOfDerivativesPeta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('sesta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.tableOfDerivativesSesta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('sedma').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.tableOfDerivativesSedma)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('osma').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.tableOfDerivativesOsma)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('deveta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.tableOfDerivativesDeveta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('deseta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.tableOfDerivativesDeseta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('edinaesta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.tableOfDerivativesEdinaesta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('dvanaesta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.tableOfDerivativesDvanaesta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('trinaesta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.tableOfDerivativesTrinaesta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('cetirinaesta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.tableOfDerivativesCetirinaesta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('petnaesta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.tableOfDerivativesPetnaesta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('sesnaesta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.tableOfDerivativesSesnaesta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('sedumnaesta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.tableOfDerivativesSedumnaesta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('osumnaesta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.tableOfDerivativesOsumnaesta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('devetnaesta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.tableOfDerivativesDevetnaesta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('dvaesta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.tableOfDerivativesDvaesta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('dvaesetiprva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.tableOfDerivativesDvaesetiPrva)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('dvaesetivtora').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.tableOfDerivativesDvaesetiVtora)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('dvaesetitreta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.tableOfDerivativesDvaesetiTreta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('dvaeseticetvrta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.tableOfDerivativesDvaesetiCetvrta)) + "\\\\]';");
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