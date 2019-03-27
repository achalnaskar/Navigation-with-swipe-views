package in.naskar.achal.satyanusaranbengali;
 
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.app.ActionBar;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

public class ListNav extends Fragment {

	@Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file 
        //change R.layout.yourlayoutfilename for each of your fragments
        return inflater.inflate(R.layout.nav_lis_layout, container, false);

    }
 
 @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        FragmentManager fm=getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.fragment12, new ListNavAdapter());
        ft.commit();

        //////////////////////////////

     

        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Satyanusaran All List");
    }



}