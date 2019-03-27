package in.naskar.achal.satyanusaranbengali;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v7.widget.Toolbar;

public class MyPagerAdapter extends FragmentStatePagerAdapter {
    private Context context;

    //private String[] tabTitleArray = null;
    private String[] tabTitlesArray = null;
    public MyPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        //tabTitleArray = context.getResources().getStringArray(R.array.tab_title);
        tabTitlesArray = context.getResources().getStringArray(R.array.tab_titles);
        this.context= context;
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = new AFragment();
        Bundle args = new Bundle();
        // Our object is just an integer :-P
        args.putString(AFragment.ARG_OBJECT, tabTitlesArray[i]);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getCount() {
        return tabTitlesArray.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        //return tabTitleArray[position];
        return "OBJECT " + (position + 1);
    }
}
