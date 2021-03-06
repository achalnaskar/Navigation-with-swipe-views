package in.naskar.achal.satyanusaranbengali;
 
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.view.ViewPager;
 
 
public class SwipeNav extends Fragment {

    private MyPagerAdapter myPagerAdapter;
    private ViewPager viewPager;

	
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file 
        //change R.layout.yourlayoutfilename for each of your fragments
        //String passingString = getArguments().getString("TAG");
        if (getArguments() != null && !getArguments().isEmpty()) {
            Bundle bundle = this.getArguments();
            String myInt = bundle.getString("tab_titles");

            return inflater.inflate(R.layout.nav_swipe, container, false);
        } else {
            return inflater.inflate(R.layout.nav_swipe, container, false);
        }
    }
 

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        myPagerAdapter = new MyPagerAdapter(getChildFragmentManager(),getContext());
        viewPager = (ViewPager) view.findViewById(R.id.pager);
        //viewPager.setId( R.id.pager );
        viewPager.setAdapter(myPagerAdapter);

        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Satyanusaran Bengali");
    }

}