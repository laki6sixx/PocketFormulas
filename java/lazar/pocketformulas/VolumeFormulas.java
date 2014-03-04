package lazar.pocketformulas;

import android.app.ActionBar;
import android.app.Fragment;
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
public class VolumeFormulas extends Fragment {

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
        View v = inflater.inflate(R.layout.volumeformulas, container, false);
        ActionBar bar = getActivity().getActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.YellowVolume)));
        bar.setTitle("Volume Formulas");

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "Bariol.otf");
        TextView cube = (TextView) v.findViewById(R.id.tvCubeVol);
        cube.setTypeface(font);
        TextView rectangularPrism = (TextView) v.findViewById(R.id.tvRectangularPrismVolume);
        rectangularPrism.setTypeface(font);
        TextView irregularPrism = (TextView) v.findViewById(R.id.tvIrregularPrismVol);
        irregularPrism.setTypeface(font);
        TextView cylinder = (TextView) v.findViewById(R.id.tvCylinderVol);
        cylinder.setTypeface(font);
        TextView pyramid = (TextView) v.findViewById(R.id.tvPyramidVol);
        pyramid.setTypeface(font);
        TextView cone = (TextView) v.findViewById(R.id.tvConePer);
        cone.setTypeface(font);
        TextView sphere = (TextView) v.findViewById(R.id.tvSphereVol);
        sphere.setTypeface(font);
        TextView ellipsoid = (TextView) v.findViewById(R.id.tvEllipsoidVol);
        ellipsoid.setTypeface(font);

        final WebView wvCubeVolume = (WebView) v.findViewById(R.id.wvCubeVolume);
        wvCubeVolume.getSettings().setJavaScriptEnabled(true);
        wvCubeVolume.setBackgroundColor(0x00000000);
        wvCubeVolume.loadDataWithBaseURL("http://bar", "<script type='text/x-mathjax-config'>"
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
        wvCubeVolume.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                if (!url.startsWith("http://bar")) return;

                //Replace the formula string below!!!
                wvCubeVolume.loadUrl("javascript:document.getElementById('prva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.volumeFormulasCube)) + "\\\\]';");
                wvCubeVolume.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");
            }
        });
        final WebView wvRectangularPrismVolume = (WebView) v.findViewById(R.id.wvRectangularPrismVol);
        wvRectangularPrismVolume.getSettings().setJavaScriptEnabled(true);
        wvRectangularPrismVolume.setBackgroundColor(0x00000000);
        wvRectangularPrismVolume.loadDataWithBaseURL("http://bar", "<script type='text/x-mathjax-config'>"
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
        wvRectangularPrismVolume.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                if (!url.startsWith("http://bar")) return;

                //Replace the formula string below!!!
                wvRectangularPrismVolume.loadUrl("javascript:document.getElementById('prva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.volumeFormulasRectangularPrism)) + "\\\\]';");
                wvRectangularPrismVolume.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");
            }
        });
        final WebView wvIrregularPrismVolume = (WebView) v.findViewById(R.id.wvIrregularPrismVolume);
        wvIrregularPrismVolume.getSettings().setJavaScriptEnabled(true);
        wvIrregularPrismVolume.setBackgroundColor(0x00000000);
        wvIrregularPrismVolume.loadDataWithBaseURL("http://bar", "<script type='text/x-mathjax-config'>"
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
        wvIrregularPrismVolume.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                if (!url.startsWith("http://bar")) return;

                //Replace the formula string below!!!
                wvIrregularPrismVolume.loadUrl("javascript:document.getElementById('prva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.volumeFormulasIrregularPrism)) + "\\\\]';");
                wvIrregularPrismVolume.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");
            }
        });
        final WebView wvCylinderVolume = (WebView) v.findViewById(R.id.wvCylinderVolume);
        wvCylinderVolume.getSettings().setJavaScriptEnabled(true);
        wvCylinderVolume.setBackgroundColor(0x00000000);
        wvCylinderVolume.loadDataWithBaseURL("http://bar", "<script type='text/x-mathjax-config'>"
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
        wvCylinderVolume.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                if (!url.startsWith("http://bar")) return;

                //Replace the formula string below!!!
                wvCylinderVolume.loadUrl("javascript:document.getElementById('prva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.volumeFormulasCylinder)) + "\\\\]';");
                wvCylinderVolume.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");
            }
        });
        final WebView wvPyramidVolume = (WebView) v.findViewById(R.id.wvPyramidVolume);
        wvPyramidVolume.getSettings().setJavaScriptEnabled(true);
        wvPyramidVolume.setBackgroundColor(0x00000000);
        wvPyramidVolume.loadDataWithBaseURL("http://bar", "<script type='text/x-mathjax-config'>"
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
        wvPyramidVolume.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                if (!url.startsWith("http://bar")) return;

                //Replace the formula string below!!!
                wvPyramidVolume.loadUrl("javascript:document.getElementById('prva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.volumeFormulasPyramid)) + "\\\\]';");
                wvPyramidVolume.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");
            }
        });
        final WebView wvConeVolume = (WebView) v.findViewById(R.id.wvConeVolume);
        wvConeVolume.getSettings().setJavaScriptEnabled(true);
        wvConeVolume.setBackgroundColor(0x00000000);
        wvConeVolume.loadDataWithBaseURL("http://bar", "<script type='text/x-mathjax-config'>"
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
        wvConeVolume.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                if (!url.startsWith("http://bar")) return;

                //Replace the formula string below!!!
                wvConeVolume.loadUrl("javascript:document.getElementById('prva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.volumeFormulasCone)) + "\\\\]';");
                wvConeVolume.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");
            }
        });
        final WebView wvSphereVolume = (WebView) v.findViewById(R.id.wvSphereVolume);
        wvSphereVolume.getSettings().setJavaScriptEnabled(true);
        wvSphereVolume.setBackgroundColor(0x00000000);
        wvSphereVolume.loadDataWithBaseURL("http://bar", "<script type='text/x-mathjax-config'>"
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
        wvSphereVolume.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                if (!url.startsWith("http://bar")) return;

                //Replace the formula string below!!!
                wvSphereVolume.loadUrl("javascript:document.getElementById('prva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.volumeFormulasSphere)) + "\\\\]';");
                wvSphereVolume.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");
            }
        });
        final WebView wvEllipsoidVolume = (WebView) v.findViewById(R.id.wvEllipsoidVolume);
        wvEllipsoidVolume.getSettings().setJavaScriptEnabled(true);
        wvEllipsoidVolume.setBackgroundColor(0x00000000);
        wvEllipsoidVolume.loadDataWithBaseURL("http://bar", "<script type='text/x-mathjax-config'>"
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
        wvEllipsoidVolume.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                if (!url.startsWith("http://bar")) return;

                //Replace the formula string below!!!
                wvEllipsoidVolume.loadUrl("javascript:document.getElementById('prva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.volumeFormulasEllipsoid)) + "\\\\]';");
                wvEllipsoidVolume.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");
            }
        });

        return v;
    }
    @Override
    public void onResume() {
        super.onResume();
    }
}
