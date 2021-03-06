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
public class TrigonometricIdentities extends Fragment {


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
        View v = inflater.inflate(R.layout.trigonometricidentities, container, false);
        ActionBar bar = getActivity().getActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.GreenTrTrigonometricIdentities)));
        bar.setTitle("Trigonometric Identities");

        final WebView wFirst = (WebView) v.findViewById(R.id.trigonometricIdentitiesWebView);
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
                + "<span id='prva'></span>   <span id='vtora'></span>   <span id='treta'></span>   <span id='cetvrta'></span>   <span id='peta'></span>   <span id='sesta'></span>  <hr style='width: 130%'>  <span id='sedma'></span> <span id='osma'></span> <span id='deveta'></span> <span id='deseta'></span> <span id='edinaeseta'></span> <span id='dvanaeseta'></span>   <hr style='width: 130%'>   <span id='trinaeseta'></span>   <span id='cetirinaeseta'></span>   <span id='petnaeseta'></span>  <hr style='width: 130%'>  <span id='sesnaeseta'></span> <span id='sedumnaeseta'></span>  <span id='osumnaeseta'></span>  <span id='devetnaeseta'></span>  <span id='dvaeseta'></span>  <span id='dvaesetiprva'></span>  <hr style='width: 130%'>  <span id='dvaesetivtora'></span> <span id='dvaesetitreta'></span> <span id='dvaeseticetvrta'></span> <span id='dvaesetipeta'></span>  <hr style='width: 130%'> <p style='color: #9cbe5b'>Law of sines:</p>  <span id='dvaesetisesta'></span>  <p style='color: #9cbe5b'>Law of cosines:</p>  <span id='dvaesetisedma'></span> <span id='dvaesetiosma'></span> <span id='dvaesetideveta'></span>  <p style='color: #9cbe5b'>Law of tangents:</p>  <span id='triesta'></span>", "text/html", "utf-8", ""
        );
        wFirst.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                if (!url.startsWith("http://bar")) return;

                //Replace the formula string below!!!
                wFirst.loadUrl("javascript:document.getElementById('prva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.trigonometricIdentitiesPrva)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('vtora').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.trigonometricIdentitiesVtora)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('treta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.trigonometricIdentitiesTreta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('cetvrta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.trigonometricIdentitiesCetvrta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('peta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.trigonometricIdentitiesPeta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('sesta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.trigonometricIdentitiesSesta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('sedma').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.trigonometricIdentitiesSedma)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('osma').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.trigonometricIdentitiesOsma)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('deveta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.trigonometricIdentitiesDeveta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('deseta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.trigonometricIdentitiesDeseta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('edinaeseta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.trigonometricIdentitiesEdinaeseta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('dvanaeseta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.trigonometricIdentitiesDvanaeseta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('trinaeseta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.trigonometricIdentitiesTrinaeseta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('cetirinaeseta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.trigonometricIdentitiesCetirinaeseta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('petnaeseta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.trigonometricIdentitiesPetnaeseta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('sesnaeseta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.trigonometricIdentitiesSesnaeseta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('sedumnaeseta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.trigonometricIdentitiesSedumnaeseta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('osumnaeseta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.trigonometricIdentitiesOsumnaeseta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('devetnaeseta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.trigonometricIdentitiesDevetnaeseta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('dvaeseta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.trigonometricIdentitiesDvaeseta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('dvaesetiprva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.trigonometricIdentitiesDvaesetiprva)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('dvaesetivtora').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.trigonometricIdentitiesDvaesetivtora)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('dvaesetitreta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.trigonometricIdentitiesDvaesetitreta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('dvaeseticetvrta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.trigonometricIdentitiesDvaeseticetvrta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('dvaesetipeta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.trigonometricIdentitiesDvaesetipeta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('dvaesetisesta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.trigonometricIdentitiesDvaesetisesta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('dvaesetisedma').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.trigonometricIdentitiesDvaesetisedma)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('dvaesetiosma').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.trigonometricIdentitiesDvaesetiosma)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('dvaesetideveta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.trigonometricIdentitiesDvaesetideveta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('triesta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.trigonometricIdentitiesTriesta)) + "\\\\]';");
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
