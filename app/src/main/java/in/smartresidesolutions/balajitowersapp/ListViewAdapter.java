package in.smartresidesolutions.balajitowersapp;



import java.util.ArrayList;
import java.util.HashMap;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


public class ListViewAdapter extends BaseAdapter
{
    public ArrayList<HashMap<String,String>> list;
    Context context;

    public ListViewAdapter(Context context, ArrayList<HashMap<String,String>> list) {
        super();
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    private class ViewHolder {
        TextView txtFirst;
        TextView txtSecond;
        TextView txtThird;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub

        // TODO Auto-generated method stub
        ViewHolder holder;
        LayoutInflater inflater = (LayoutInflater) LayoutInflater.from(context);

        if (convertView == null)
        {
            convertView = inflater.inflate(R.layout.list_view_rows,parent,false);
            holder = new ViewHolder();
            holder.txtFirst = (TextView) convertView.findViewById(R.id.FirstText);
            holder.txtSecond = (TextView) convertView.findViewById(R.id.SecondText);
            holder.txtThird = (TextView) convertView.findViewById(R.id.ThirdText);
          //  holder.txtThird = (TextView) convertView.findViewById(R.id.ThirdText);
        //    holder.txtFourth = (TextView) convertView.findViewById(R.id.FourthText);
            convertView.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) convertView.getTag();
        }

        HashMap<String, String> map = list.get(position);
        holder.txtFirst.setText(map.get("First"));
        //Log.i("srmap",map.get(FIRST_COLUMN));
        holder.txtSecond.setText(map.get("Second"));
        holder.txtThird.setText(map.get("Third"));

      //  holder.txtThird.setText((Integer) map.get(THIRD_COLUMN));
       // holder.txtFourth.setText((Integer) map.get(FOURTH_COLUMN));

        return convertView;
    }

}