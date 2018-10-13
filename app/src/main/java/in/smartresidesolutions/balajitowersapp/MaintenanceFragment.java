package in.smartresidesolutions.balajitowersapp;



import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class MaintenanceFragment extends Fragment {
    private ArrayList<HashMap<String, String>> list;
    public static final String FIRST_COLUMN = "Column 1";
    public static final String SECOND_COLUMN = "Column 2";

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_maintenance_fragment, container, false);
    return view;


        //return view;


    }



    private void populateList() {

        list = new ArrayList<HashMap<String, String>>();

        //HashMap<String, String> temp3 = new HashMap<String, String>();
        //temp3.put("First","House Number");
        //temp3.put("Second", "Name");
        //temp3.put("Third", "Payment Status");
        //list.add(temp3);

        HashMap<String, String> temp = new HashMap<String, String>();
        temp.put("First","Paid");
        temp.put("Second", "A 204");
        temp.put("Third", "Navneet");
        list.add(temp);

        HashMap<String, String> temp1 = new HashMap<String, String>();
        temp1.put("First","Pending");
        temp1.put("Second", "B 345");
        temp1.put("Third", "Harish");
        list.add(temp1);

        HashMap<String, String> tempy = new HashMap<String, String>();
        tempy.put("First","Paid");
        tempy.put("Second", "C 502");
        tempy.put("Third", "Lalitha");
        list.add(tempy);

        HashMap<String, String> temp6 = new HashMap<String, String>();
        temp6.put("First","Pending");
        temp6.put("Second", "D 607");
        temp6.put("Third", "Trijani");
        list.add(temp6);

        HashMap<String, String> temp4 = new HashMap<String, String>();
        temp4.put("First","Paid");
        temp4.put("Second", "C 256");
        temp4.put("Third", "Jaydeep");
        list.add(temp4);

        HashMap<String, String> temp8 = new HashMap<String, String>();
        temp8.put("First","Paid");
        temp8.put("Second", "A 106");
        temp8.put("Third", "Ramesh");
        list.add(temp8);

        HashMap<String, String> temp9 = new HashMap<String, String>();
        temp9.put("First","Paid");
        temp9.put("Second", "B 206");
        temp9.put("Third", "Abhinav");
        list.add(temp9);

        HashMap<String, String> temp10 = new HashMap<String, String>();
        temp10.put("First","Pending");
        temp10.put("Second", "A 706");
        temp10.put("Third", "Karthik");
        list.add(temp10);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ListView lview = (ListView)view.findViewById(R.id.listview);
        populateList();
        ListViewAdapter adapter = new ListViewAdapter(getContext(), list);
        lview.setAdapter(adapter);

    }

}




