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
public class IntegralIdentities extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private String doubleEscapeTeX(String s) {
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '\'') t += '\\';
            if (s.charAt(i) != '\n') t += s.charAt(i);
            if (s.charAt(i) == '\\') t += "\\";
        }
        return t;
    }
    @Override
    public void onStart() {
        super.onStart();
    }
    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.integralidentities, container, false);
        ActionBar bar = getActivity().getActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.YellowCalculusIdentities)));
        bar.setTitle("Integral Identities");

        final WebView wFirst = (WebView) v.findViewById(R.id.integralIDsWebView);
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
                + "<span id='prva'></span> <p style='color: #e8b84c'>Fundamental Theorem for integrals of derivatives</p> <span id='vtora'></span>  <hr style='width: 150%'>  <span id='treta'></span> <span id='cetvrta'></span> <span id='peta'></span> <span id='sesta'></span> <span id='sedma'></span> <hr style='width: 150%'> <p style='color: #e8b84c'>Trigonometric:</p>  <span id='osma'></span>  <span id='deveta'></span>  <span id='deseta'></span>  <span id='edinaeseta'></span>  <span id='dvanaeseta'></span>  <span id='trinaeseta'></span> <p style='color: #e8b84c'>Trigonometric Result:</p> <span id='cetirinaeseta'></span> <span id='petnaeseta'></span> <span id='sesnaeseta'></span> <span id='sedumnaeseta'></span> <span id='osumnaeseta'></span> <span id='devetnaeseta'></span> <p style='color: #e8b84c'>Inverse Trigonometric:</p> <span id='dvaeseta'></span>  <span id='dvaesetiprva'></span>  <span id='dvaesetivtora'></span>   <p style='color: #e8b84c'>Inverse Trigonometric Result:</p> <span id='dvaesetitreta'></span> <span id='dvaeseticetvrta'></span> <span id='dvaesetipeta'></span>   <p style='color: #e8b84c'>Useful Identities:</p> <span id='dvaesetisesta'></span> <span id='dvaesetisedma' style='color: #FF5252'></span> <span id='dvaesetiosma'></span> <span id='dvaesetideveta' style='color: #FF5252'></span> <span id='trieseta'></span> <span id='triesetiprva' style='color: #FF5252'></span>  <p style='color: #e8b84c'>Hyperbolic:</p>  <span id='triesetivtora'></span> <span id='triesetitreta'></span>  <span id='trieseticetvrta'></span>  <span id='triesetipeta'></span>  <span id='triesetisesta'></span>  <span id='triesetisedma'></span>", "text/html", "utf-8", ""
        );
        wFirst.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                if (!url.startsWith("http://bar")) return;

                //Replace the formula string below!!!
                wFirst.loadUrl("javascript:document.getElementById('prva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.integralIdentitiesPrva)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('vtora').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.integralIdentitiesVtora)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('treta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.integralIdentitiesTreta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('cetvrta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.integralIdentitiesCetvrta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('peta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.integralIdentitiesPeta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('sesta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.integralIdentitiesSesta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('sedma').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.integralIdentitiesSedma)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('osma').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.integralIdentitiesOsma)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('deveta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.integralIdentitiesDeveta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('deseta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.integralIdentitiesDeseta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('edinaeseta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.integralIdentitiesEdinaeseta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('dvanaeseta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.integralIdentitiesDvanaeseta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('trinaeseta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.integralIdentitiesTrinaeseta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('cetirinaeseta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.integralIdentitiesCetirinaeseta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('petnaeseta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.integralIdentitiesPetnaeseta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('sesnaeseta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.integralIdentitiesSesnaeseta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('sedumnaeseta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.integralIdentitiesSedumnaeseta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('osumnaeseta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.integralIdentitiesOsumnaeseta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('devetnaeseta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.integralIdentitiesDevetnaeseta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('dvaeseta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.integralIdentitiesDvaeseta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('dvaesetiprva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.integralIdentitiesDvaesetiPrva)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('dvaesetivtora').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.integralIdentitiesDvaesetiVtora)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('dvaesetitreta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.integralIdentitiesDvaesetiTreta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('dvaeseticetvrta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.integralIdentitiesDvaesetiCetvrta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('dvaesetipeta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.integralIdentitiesDvaesetiPeta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('dvaesetisesta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.integralIdentitiesDvaesetiSesta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('dvaesetisedma').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.integralIdentitiesDvaesetiSedma)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('dvaesetiosma').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.integralIdentitiesDvaesetiOsma)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('dvaesetideveta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.integralIdentitiesDvaesetiDeveta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('trieseta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.integralIdentitiesTrieseta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('triesetiprva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.integralIdentitiesTriesetiPrva)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('triesetivtora').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.integralIdentitiesTriesetiVtora)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('triesetitreta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.integralIdentitiesTriesetiTreta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('trieseticetvrta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.integralIdentitiesTriesetiCetvrta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('triesetipeta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.integralIdentitiesTriesetiPeta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('triesetisesta').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.integralIdentitiesTriesetiSesta)) + "\\\\]';");
                wFirst.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");

                wFirst.loadUrl("javascript:document.getElementById('triesetisedma').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.integralIdentitiesTriesetiSedma)) + "\\\\]';");
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
