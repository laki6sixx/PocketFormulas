package lazar.pocketformulas;

import android.app.ActionBar;
import android.app.Fragment;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

/**
 * Created by Lazar on 2/16/14.
 */
public class SurfaceAreaFormulas extends Fragment {

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
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '\'') t += '\\';
            if (s.charAt(i) != '\n') t += s.charAt(i);
            if (s.charAt(i) == '\\') t += "\\";
        }
        return t;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.surfaceareaformulas, container, false);
        ActionBar bar = getActivity().getActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.GreenSurface)));
        bar.setTitle("Surface Area Formulas");
        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "Bariol.otf");
        TextView cube = (TextView) v.findViewById(R.id.tvCube);
        cube.setTypeface(font);
        TextView cylinder = (TextView) v.findViewById(R.id.tvCylinder);
        cylinder.setTypeface(font);
        TextView rectangularPrism = (TextView) v.findViewById(R.id.tvRectangularPrism);
        rectangularPrism.setTypeface(font);
        TextView anyPrism = (TextView) v.findViewById(R.id.tvAnyPrism);
        anyPrism.setTypeface(font);
        TextView sphere = (TextView) v.findViewById(R.id.tvSphere);
        sphere.setTypeface(font);

        final WebView wCube = (WebView) v.findViewById(R.id.wvCube);
        wCube.getSettings().setJavaScriptEnabled(true);
        wCube.setBackgroundColor(0x00000000);

        wCube.loadDataWithBaseURL("http://bar", "<script type='text/x-mathjax-config'>"
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
                + "<span id='prva'>", "text/html", "utf-8", ""
        );
        wCube.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                if (!url.startsWith("http://bar")) return;

                //Replace the formula string below!!!
                wCube.loadUrl("javascript:document.getElementById('prva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.surfaceAreaFormulasCube)) + "\\\\]';");
                wCube.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");
            }
        });
        final WebView wvRectangularPrism = (WebView) v.findViewById(R.id.wvRectangularPrism);
        wvRectangularPrism.getSettings().setJavaScriptEnabled(true);
        wvRectangularPrism.setBackgroundColor(0x00000000);

        wvRectangularPrism.loadDataWithBaseURL("http://bar", "<script type='text/x-mathjax-config'>"
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
                + "<span id='prva'>", "text/html", "utf-8", ""
        );
        wvRectangularPrism.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                if (!url.startsWith("http://bar")) return;

                //Replace the formula string below!!!
                wvRectangularPrism.loadUrl("javascript:document.getElementById('prva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.surfaceAreaFormulasRectangularPrism)) + "\\\\]';");
                wvRectangularPrism.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");
            }
        });
        final WebView wvAnyPrism = (WebView) v.findViewById(R.id.wvAnyPrism);
        wvAnyPrism.getSettings().setJavaScriptEnabled(true);
        wvAnyPrism.setBackgroundColor(0x00000000);

        wvAnyPrism.loadDataWithBaseURL("http://bar", "<script type='text/x-mathjax-config'>"
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
                + "<span id='prva'>", "text/html", "utf-8", ""
        );
        wvAnyPrism.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                if (!url.startsWith("http://bar")) return;

                //Replace the formula string below!!!
                wvAnyPrism.loadUrl("javascript:document.getElementById('prva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.surfaceAreaFormulasAnyPrism)) + "\\\\]';");
                wvAnyPrism.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");
            }
        });

        final WebView wvSphere = (WebView) v.findViewById(R.id.wvSphere);
        wvSphere.getSettings().setJavaScriptEnabled(true);
        wvSphere.setBackgroundColor(0x00000000);

        wvSphere.loadDataWithBaseURL("http://bar", "<script type='text/x-mathjax-config'>"
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
                + "<span id='prva'>", "text/html", "utf-8", ""
        );
        wvSphere.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                if (!url.startsWith("http://bar")) return;

                //Replace the formula string below!!!
                wvSphere.loadUrl("javascript:document.getElementById('prva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.surfaceAreaFormulasSphere)) + "\\\\]';");
                wvSphere.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");
            }
        });
        final WebView wvCylinder = (WebView) v.findViewById(R.id.wvCylinder);
        wvCylinder.getSettings().setJavaScriptEnabled(true);
        wvCylinder.setBackgroundColor(0x00000000);

        wvCylinder.loadDataWithBaseURL("http://bar", "<script type='text/x-mathjax-config'>"
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
                + "<span id='prva'>", "text/html", "utf-8", ""
        );
        wvCylinder.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                if (!url.startsWith("http://bar")) return;

                //Replace the formula string below!!!
                wvCylinder.loadUrl("javascript:document.getElementById('prva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.surfaceAreaFormulasCylinder)) + "\\\\]';");
                wvCylinder.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");
            }
        });
        return v;
    }
}
