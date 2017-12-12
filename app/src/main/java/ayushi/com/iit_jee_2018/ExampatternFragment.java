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

public class ExampatternFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_exampattern, null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        WebView wv4;
        wv4=(WebView) view.findViewById(R.id.wv4);
        wv4.loadUrl("https://engineering.careers360.com/articles/jee-advanced-exam-pattern");
        wv4.getSettings().setJavaScriptEnabled(true);
        wv4.setWebViewClient(new WebViewClient());
    }
}
