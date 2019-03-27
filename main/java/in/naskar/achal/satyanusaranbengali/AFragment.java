package in.naskar.achal.satyanusaranbengali;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;


public class AFragment extends Fragment {
    public static final String ARG_OBJECT = "object";

    public AFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // The last two arguments ensure LayoutParams are inflated
        // properly.


        View rootView = inflater.inflate(R.layout.fragment_a, container, false);
        Bundle args = getArguments();
        ((TextView) rootView.findViewById(R.id.text1)).setText(args.getString(ARG_OBJECT));
        return rootView;


    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView bigText = (TextView) view.findViewById(R.id.text1);
        bigText.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
    }

}