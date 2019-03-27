package in.naskar.achal.satyanusaranbengali;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import android.support.v4.app.Fragment;

public class ListNavAdapter extends ListFragment {

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.nav_list_layout, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.tab_titles, android.R.layout.simple_list_item_1);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(getActivity(), "Item: " + (i +1), Toast.LENGTH_SHORT).show();
                String[] tabTitlesArray = getContext().getResources().getStringArray(R.array.tab_titles);
                Bundle bundle = new Bundle();
                bundle.putString("tab_titles", tabTitlesArray[i].toString());
                // set Fragmentclass Arguments
                SwipeNav fragobj = new SwipeNav();
                fragobj.setArguments(bundle);

                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(((ViewGroup)(getView().getParent())).getId(), fragobj);
                ft.addToBackStack(null);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.commit();

                //Fragment f=getFragmentManager().findFragmentById(R.id.fragment12);
               // if(f==null){
                   // getFragmentManager().beginTransaction().replace(((ViewGroup)(getView().getParent())).getId(), new SwipeNav()).commit();
               // }

            }
        });
    }





      // Toast.makeText(getActivity(), "Item: " + (position +1), Toast.LENGTH_SHORT).show();
        // Create new fragment and transaction



}