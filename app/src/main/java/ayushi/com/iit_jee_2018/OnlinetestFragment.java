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

public class OnlinetestFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_onlinetest,null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        WebView wv3;
        wv3=(WebView) view.findViewById(R.id.wv3);
        wv3.loadUrl("http://www.onlinetestseries.in/allenkota/jee-advanced-exam/mock-test-papers-leader");
        wv3.getSettings().setJavaScriptEnabled(true);
        wv3.setWebViewClient(new WebViewClient());
    }
}
