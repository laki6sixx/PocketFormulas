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
public class PerimeterFormulas extends Fragment {

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
        View v = inflater.inflate(R.layout.perimeterformulas, container, false);
        ActionBar bar = getActivity().getActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.RedPerimeter)));
        bar.setTitle("Perimeter Formulas");

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "Bariol.otf");
        TextView square = (TextView) v.findViewById(R.id.tvSquarePer);
        square.setTypeface(font);
        TextView rectangle = (TextView) v.findViewById(R.id.tvRectanglePer);
        rectangle.setTypeface(font);
        TextView triangle = (TextView) v.findViewById(R.id.tvTrianglePer);
        triangle.setTypeface(font);
        TextView circle = (TextView) v.findViewById(R.id.tvCirclePer);
        circle.setTypeface(font);

        final WebView wvSquarePer = (WebView) v.findViewById(R.id.wvSquarePer);
        wvSquarePer.getSettings().setJavaScriptEnabled(true);
        wvSquarePer.setBackgroundColor(0x00000000);

        wvSquarePer.loadDataWithBaseURL("http://bar", "<script type='text/x-mathjax-config'>"
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
        wvSquarePer.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(final WebView view, String url) {

                if (!url.startsWith("http://bar")) return;

                //Replace the formula string below!!!
                wvSquarePer.loadUrl("javascript:document.getElementById('prva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.perimeterFormulasSquare)) + "\\\\]';");
                wvSquarePer.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");
            }
        });
        final WebView wvRectanglePer = (WebView) v.findViewById(R.id.wvRectanglePer);
        wvRectanglePer.getSettings().setJavaScriptEnabled(true);
        wvRectanglePer.setBackgroundColor(0x00000000);

        wvRectanglePer.loadDataWithBaseURL("http://bar", "<script type='text/x-mathjax-config'>"
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
        wvRectanglePer.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(final WebView view, String url) {

                if (!url.startsWith("http://bar")) return;

                //Replace the formula string below!!!
                wvRectanglePer.loadUrl("javascript:document.getElementById('prva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.perimeterFormulasRectangle)) + "\\\\]';");
                wvRectanglePer.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");
            }
        });
        final WebView wvTrianglePer = (WebView) v.findViewById(R.id.wvTrianglePer);
        wvTrianglePer.getSettings().setJavaScriptEnabled(true);
        wvTrianglePer.setBackgroundColor(0x00000000);

        wvTrianglePer.loadDataWithBaseURL("http://bar", "<script type='text/x-mathjax-config'>"
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
        wvTrianglePer.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(final WebView view, String url) {

                if (!url.startsWith("http://bar")) return;

                //Replace the formula string below!!!
                wvTrianglePer.loadUrl("javascript:document.getElementById('prva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.perimeterFormulasTriangle)) + "\\\\]';");
                wvTrianglePer.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");
            }
        });
        final WebView wvCirclePer = (WebView) v.findViewById(R.id.wvCirclePer);
        wvCirclePer.getSettings().setJavaScriptEnabled(true);
        wvCirclePer.setBackgroundColor(0x00000000);

        wvCirclePer.loadDataWithBaseURL("http://bar", "<script type='text/x-mathjax-config'>"
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
        wvCirclePer.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(final WebView view, String url) {

                if (!url.startsWith("http://bar")) return;

                //Replace the formula string below!!!
                wvCirclePer.loadUrl("javascript:document.getElementById('prva').innerHTML='\\\\["
                        + doubleEscapeTeX(getResources().getString(R.string.perimeterFormulasCircle)) + "\\\\]';");
                wvCirclePer.loadUrl("javascript:MathJax.Hub.Queue(['Typeset',MathJax.Hub]);");
            }
        });

        return v;
    }
    @Override
    public void onResume() {
        super.onResume();
    }
}
