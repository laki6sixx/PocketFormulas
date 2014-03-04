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
public class HyperbolicIdentities extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.hyperbolicidentities, container, false);
        ActionBar bar = getActivity().getActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.PinkHyperbolic)));
        bar.setTitle("Hyperbolic Identities");

        final WebView wFirst = (WebView) v.findViewById(R.id.hyperbolicWebView);
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
                + "<span id='prva'></span>   <span id='vtora'></span>   <span id='treta'></span>   <span id='cetvrta'></span>   <span id='peta'></span>   <span id='sesta'></span>  <hr>  <span id='sedma'></span> <span id='osma'></span> <span id='deveta'></span>     <hr>    <p style='color: #dd96c0'>Inverse Hyperbolic Definitions</p>   <span id='deseta'></span>  <span id='edinaeseta'></span>  <span id='dvanaeseta'></span>  <span id='trinaeseta'></span>  <span id='cetirinaeseta'></span>  <span id='petnaeseta'></span>   <hr>   <p style='color: #dd96c0'>Relations to Trigonometric Functions</p>  <span id='sesnaeseta'></span>  <span id='sedumnaeseta'></span>  <span id='osumnaeseta'></span>  <span id='devetnaeseta'></span>  <span id='dvaeseta'></span>  <span id='dvaesetiprva'></span>", "text/html", "utf-8", ""
        );
        wFirst.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                if (!url.startsWith("http://bar")) return;

                //Replace the formula string below!!!
                wFirst.loadUrl("javascript:document.getElementById('prva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.hyperbolicPrva)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('vtora').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.hyperbolicVtora)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('treta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.hyperbolicTreta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('cetvrta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.hyperbolicCetvrta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('peta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.hyperbolicPeta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('sesta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.hyperbolicSesta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('sedma').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.hyperbolicSedma)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('osma').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.hyperbolicOsma)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('deveta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.hyperbolicDeveta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('deseta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.hyperbolicDeseta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('edinaeseta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.hyperbolicEdinaeseta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('dvanaeseta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.hyperbolicDvanaeseta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('trinaeseta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.hyperbolicTrinaeseta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('cetirinaeseta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.hyperbolicCetirinaeseta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('petnaeseta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.hyperbolicPetnaeseta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('sesnaeseta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.hyperbolicSesnaeseta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('sedumnaeseta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.hyperbolicSedumnaeseta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('osumnaeseta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.hyperbolicOsumnaeseta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('devetnaeseta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.hyperbolicDevetnaeseta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('dvaesta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.hyperbolicDvaeseta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('dvaesetiprva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.hyperbolicDvaesetiprva)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");
            }
        });
        return v;
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
    public void onResume() {
        super.onResume();
    }
    @Override
    public void onStart() {
        super.onStart();
    }
    @Override
    public void onStop() {
        super.onStop();
    }
}
