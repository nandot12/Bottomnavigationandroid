package id.co.digitalindo.bottomnavigationandroid;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class FirstFragment extends Fragment {

    public FirstFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_blank, container, false);

     ListView list =  v.findViewById(R.id.listview);

     String [] data = {"nando","kece"};

             ArrayAdapter adapter =    new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,data);
            list.setAdapter(adapter);
        return v;

    }

}
