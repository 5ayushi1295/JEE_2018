package ayushi.com.iit_jee_2018;

import android.content.Context;
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

public class EligibilityFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_eligibility, null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        WebView wv5;
        wv5=(WebView) view.findViewById(R.id.wv5);
        wv5.loadUrl("https://www.sarvgyan.com/articles/jee-advanced-2018");
        wv5.getSettings().setJavaScriptEnabled(true);
        wv5.setWebViewClient(new WebViewClient());
    }
}

