package ayushi.com.iit_jee_2018;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by AYUSHI SONI on 10-12-2017.
 */

public class PreprationFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_prepration,null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        WebView wv2;
        wv2=(WebView) view.findViewById(R.id.wv2);
        wv2.loadUrl("https://www.careerorbits.com/iit-jee-advanced-preparation-courses.html");
        wv2.getSettings().setJavaScriptEnabled(true);
        wv2.setWebViewClient(new WebViewClient());
    }
}
