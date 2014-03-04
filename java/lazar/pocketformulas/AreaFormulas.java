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
public class AreaFormulas extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
        View v = inflater.inflate(R.layout.areaformulas, container, false);
        ActionBar bar = getActivity().getActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.BrightBlue)));
        bar.setTitle("Area Formulas");

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "Bariol.otf");
        TextView square = (TextView) v.findViewById(R.id.tvSquareArea);
        square.setTypeface(font);
        TextView rectangle = (TextView) v.findViewById(R.id.tvRectangleArea);
        rectangle.setTypeface(font);
        TextView parallelogram = (TextView) v.findViewById(R.id.tvParallelogramArea);
        parallelogram.setTypeface(font);
        TextView trapezoid = (TextView) v.findViewById(R.id.tvTrapezoidArea);
        trapezoid.setTypeface(font);
        TextView circle = (TextView) v.findViewById(R.id.tvCircleArea);
        circle.setTypeface(font);
        TextView ellipse = (TextView) v.findViewById(R.id.tvEllipseArea);
        ellipse.setTypeface(font);
        TextView triangle = (TextView) v.findViewById(R.id.tvTriangleArea);
        triangle.setTypeface(font);
        TextView equilateralTriangle = (TextView) v.findViewById(R.id.tvEquilateralTriangleArea);
        equilateralTriangle.setTypeface(font);

        final WebView wvSquare = (WebView) v.findViewById(R.id.wvSquare);
        wvSquare.getSettings().setJavaScriptEnabled(true);
        wvSquare.setBackgroundColor(0x00000000);
        wvSquare.loadDataWithBaseURL("http://bar", "<script type='text/x-mathjax-config'>"
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
        wvSquare.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                if (!url.startsWith("http://bar")) return;

                //Replace the formula string below!!!
                wvSquare.loadUrl("javascript:document.getElementById('prva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.areaFormulasSquare)) + "\\\\]';");
                wvSquare.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");
            }
        });
        final WebView wvRectangle = (WebView) v.findViewById(R.id.wvRectangle);
        wvRectangle.getSettings().setJavaScriptEnabled(true);
        wvRectangle.setBackgroundColor(0x00000000);
        wvRectangle.loadDataWithBaseURL("http://bar", "<script type='text/x-mathjax-config'>"
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
        wvRectangle.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                if (!url.startsWith("http://bar")) return;

                //Replace the formula string below!!!
                wvRectangle.loadUrl("javascript:document.getElementById('prva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.areaFormulasRectangle)) + "\\\\]';");
                wvRectangle.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");
            }
        });
        final WebView wvParallelogram = (WebView) v.findViewById(R.id.wvParallelogram);
        wvParallelogram.getSettings().setJavaScriptEnabled(true);
        wvParallelogram.setBackgroundColor(0x00000000);
        wvParallelogram.loadDataWithBaseURL("http://bar", "<script type='text/x-mathjax-config'>"
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
        wvParallelogram.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                if (!url.startsWith("http://bar")) return;

                //Replace the formula string below!!!
                wvParallelogram.loadUrl("javascript:document.getElementById('prva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.areaFormulasParallelogram)) + "\\\\]';");
                wvParallelogram.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");
            }
        });
        final WebView wvTrapezoid = (WebView) v.findViewById(R.id.wvTrapezoid);
        wvTrapezoid.getSettings().setJavaScriptEnabled(true);
        wvTrapezoid.setBackgroundColor(0x00000000);
        wvTrapezoid.loadDataWithBaseURL("http://bar", "<script type='text/x-mathjax-config'>"
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
        wvTrapezoid.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                if (!url.startsWith("http://bar")) return;

                //Replace the formula string below!!!
                wvTrapezoid.loadUrl("javascript:document.getElementById('prva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.areaFormulasTrapezoid)) + "\\\\]';");
                wvTrapezoid.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");
            }
        });
        final WebView wvCircle = (WebView) v.findViewById(R.id.wvCircle);
        wvCircle.getSettings().setJavaScriptEnabled(true);
        wvCircle.setBackgroundColor(0x00000000);
        wvCircle.loadDataWithBaseURL("http://bar", "<script type='text/x-mathjax-config'>"
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
        wvCircle.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                if (!url.startsWith("http://bar")) return;

                //Replace the formula string below!!!
                wvCircle.loadUrl("javascript:document.getElementById('prva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.areaFormulasCircle)) + "\\\\]';");
                wvCircle.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");
            }
        });
        final WebView wvEllipse = (WebView) v.findViewById(R.id.wvEllipse);
        wvEllipse.getSettings().setJavaScriptEnabled(true);
        wvEllipse.setBackgroundColor(0x00000000);
        wvEllipse.loadDataWithBaseURL("http://bar", "<script type='text/x-mathjax-config'>"
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
        wvEllipse.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                if (!url.startsWith("http://bar")) return;

                //Replace the formula string below!!!
                wvEllipse.loadUrl("javascript:document.getElementById('prva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.areaFormulasEllipse)) + "\\\\]';");
                wvEllipse.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");
            }
        });
        final WebView wvTriangle = (WebView) v.findViewById(R.id.wvTriangle);
        wvTriangle.getSettings().setJavaScriptEnabled(true);
        wvTriangle.setBackgroundColor(0x00000000);
        wvTriangle.loadDataWithBaseURL("http://bar", "<script type='text/x-mathjax-config'>"
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
        wvTriangle.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                if (!url.startsWith("http://bar")) return;

                //Replace the formula string below!!!
                wvTriangle.loadUrl("javascript:document.getElementById('prva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.areaFormulasTriangle)) + "\\\\]';");
                wvTriangle.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");
            }
        });
        final WebView wvEquilateralTriangle = (WebView) v.findViewById(R.id.wvEquilateralTriangle);
        wvEquilateralTriangle.getSettings().setJavaScriptEnabled(true);
        wvEquilateralTriangle.setBackgroundColor(0x00000000);
        wvEquilateralTriangle.loadDataWithBaseURL("http://bar", "<script type='text/x-mathjax-config'>"
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
        wvEquilateralTriangle.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                if (!url.startsWith("http://bar")) return;

                //Replace the formula string below!!!
                wvEquilateralTriangle.loadUrl("javascript:document.getElementById('prva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.areaFormulasEquilateralTriangle)) + "\\\\]';");
                wvEquilateralTriangle.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");
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
