package ayushi.com.iit_jee_2018;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

/**
 * Created by AYUSHI SONI on 10-12-2017.
 */
public class AboutFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_about, null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        WebView wv9;
        wv9=(WebView) view.findViewById(R.id.wv9);
        wv9.loadUrl("https://www.jeeadv.ac.in/");
        wv9.getSettings().setJavaScriptEnabled(true);
        wv9.setWebViewClient(new WebViewClient());
    }

}
