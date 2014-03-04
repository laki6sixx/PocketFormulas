package lazar.pocketformulas;

import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Lazar on 2/13/14.
 */
public class AlgebraicGraphs extends Fragment {

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

    //Add functions to TextViews, Buttons etc. HERE! (rock)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.algebraicgraphs, container, false);
        ActionBar bar = getActivity().getActionBar();
        bar.setDisplayShowTitleEnabled(true);
        bar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.BlueAlgebraGraphs)));
        bar.setTitle("Algebraic Graphs");

        final WebView wvPointGraph = (WebView) v.findViewById(R.id.wvPointGraph);
        wvPointGraph.getSettings().setJavaScriptEnabled(true);
        wvPointGraph.setBackgroundColor(0x00000000);

        wvPointGraph.loadDataWithBaseURL("http://bar", "<script type='text/x-mathjax-config'>"
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
                + "<span id='prva'></span>", "text/html", "utf-8", ""
        );
        wvPointGraph.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(final WebView view, String url) {

                if (!url.startsWith("http://bar")) return;

                //Replace the formula string below!!!
                wvPointGraph.loadUrl("javascript:document.getElementById('prva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.algebraGraphsPoint)) + "\\\\]';");
                wvPointGraph.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");
            }
        });

        final WebView wvEllipseFirstGraph = (WebView) v.findViewById(R.id.wvEllipseFirstGraph);
        wvEllipseFirstGraph.getSettings().setJavaScriptEnabled(true);
        wvEllipseFirstGraph.setBackgroundColor(0x00000000);

        wvEllipseFirstGraph.loadDataWithBaseURL("http://bar", "<script type='text/x-mathjax-config'>"
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
                + "<span id='prva'></span>", "text/html", "utf-8", ""
        );
        wvEllipseFirstGraph.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(final WebView view, String url) {

                if (!url.startsWith("http://bar")) return;

                //Replace the formula string below!!!
                wvEllipseFirstGraph.loadUrl("javascript:document.getElementById('prva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.algebraGraphsEllipseFirst)) + "\\\\]';");
                wvEllipseFirstGraph.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");
            }
        });

        final WebView wvEllipseSecondGraph = (WebView) v.findViewById(R.id.wvEllipseSecondGraph);
        wvEllipseSecondGraph.getSettings().setJavaScriptEnabled(true);
        wvEllipseSecondGraph.setBackgroundColor(0x00000000);

        wvEllipseSecondGraph.loadDataWithBaseURL("http://bar", "<script type='text/x-mathjax-config'>"
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
                + "<span id='prva'></span>", "text/html", "utf-8", ""
        );
        wvEllipseSecondGraph.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(final WebView view, String url) {

                if (!url.startsWith("http://bar")) return;

                //Replace the formula string below!!!
                wvEllipseSecondGraph.loadUrl("javascript:document.getElementById('prva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.algebraGraphsEllipseSecond)) + "\\\\]';");
                wvEllipseSecondGraph.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");
            }
        });

        final WebView wvParabolaFirstGraph = (WebView) v.findViewById(R.id.wvParabolaFirstGraph);
        wvParabolaFirstGraph.getSettings().setJavaScriptEnabled(true);
        wvParabolaFirstGraph.setBackgroundColor(0x00000000);

        wvParabolaFirstGraph.loadDataWithBaseURL("http://bar", "<script type='text/x-mathjax-config'>"
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
                + "<span id='prva'></span>", "text/html", "utf-8", ""
        );
        wvParabolaFirstGraph.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(final WebView view, String url) {

                if (!url.startsWith("http://bar")) return;

                //Replace the formula string below!!!
                wvParabolaFirstGraph.loadUrl("javascript:document.getElementById('prva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.algebraGraphsParabolaFirst)) + "\\\\]';");
                wvParabolaFirstGraph.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");
            }
        });

        final WebView wvParabolaSecondGraph = (WebView) v.findViewById(R.id.wvParabolaSecondGraph);
        wvParabolaSecondGraph.getSettings().setJavaScriptEnabled(true);
        wvParabolaSecondGraph.setBackgroundColor(0x00000000);

        wvParabolaSecondGraph.loadDataWithBaseURL("http://bar", "<script type='text/x-mathjax-config'>"
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
                + "<span id='prva'></span>", "text/html", "utf-8", ""
        );
        wvParabolaSecondGraph.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(final WebView view, String url) {

                if (!url.startsWith("http://bar")) return;

                //Replace the formula string below!!!
                wvParabolaSecondGraph.loadUrl("javascript:document.getElementById('prva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.algebraGraphsParabolaSecond)) + "\\\\]';");
                wvParabolaSecondGraph.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");
            }
        });

        final WebView wvCircleGraph = (WebView) v.findViewById(R.id.wvCircleGraph);
        wvCircleGraph.getSettings().setJavaScriptEnabled(true);
        wvCircleGraph.setBackgroundColor(0x00000000);

        wvCircleGraph.loadDataWithBaseURL("http://bar", "<script type='text/x-mathjax-config'>"
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
                + "<span id='prva'></span>", "text/html", "utf-8", ""
        );
        wvCircleGraph.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(final WebView view, String url) {

                if (!url.startsWith("http://bar")) return;

                //Replace the formula string below!!!
                wvCircleGraph.loadUrl("javascript:document.getElementById('prva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.algebraGraphsCircle)) + "\\\\]';");
                wvCircleGraph.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");
            }
        });

        final WebView wvHyperbolaFirstGraph = (WebView) v.findViewById(R.id.wvHyperbolaFirstGraph);
        wvHyperbolaFirstGraph.getSettings().setJavaScriptEnabled(true);
        wvHyperbolaFirstGraph.setBackgroundColor(0x00000000);

        wvHyperbolaFirstGraph.loadDataWithBaseURL("http://bar", "<script type='text/x-mathjax-config'>"
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
                + "<span id='prva'></span>", "text/html", "utf-8", ""
        );
        wvHyperbolaFirstGraph.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(final WebView view, String url) {

                if (!url.startsWith("http://bar")) return;

                //Replace the formula string below!!!
                wvHyperbolaFirstGraph.loadUrl("javascript:document.getElementById('prva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.algebraGraphsHyperbolaFirst)) + "\\\\]';");
                wvHyperbolaFirstGraph.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");
            }
        });

        final WebView wvHyperbolaSecondGraph = (WebView) v.findViewById(R.id.wvHyperbolaSecondGraph);
        wvHyperbolaSecondGraph.getSettings().setJavaScriptEnabled(true);
        wvHyperbolaSecondGraph.setBackgroundColor(0x00000000);

        wvHyperbolaSecondGraph.loadDataWithBaseURL("http://bar", "<script type='text/x-mathjax-config'>"
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
                + "<span id='prva'></span>", "text/html", "utf-8", ""
        );
        wvHyperbolaSecondGraph.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(final WebView view, String url) {

                if (!url.startsWith("http://bar")) return;

                //Replace the formula string below!!!
                wvHyperbolaSecondGraph.loadUrl("javascript:document.getElementById('prva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.algebraGraphsHyperbolaSecond)) + "\\\\]';");
                wvHyperbolaSecondGraph.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");
            }
        });


        return v;
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
    public void onResume() {

        super.onResume();
    }

}

