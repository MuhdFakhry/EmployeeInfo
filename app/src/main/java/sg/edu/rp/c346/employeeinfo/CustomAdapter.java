package sg.edu.rp.c346.employeeinfo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 15007803 on 17/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int Layout_id;
    ArrayList<EmployeeInfo> InfoList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<EmployeeInfo> objects) {
        super(context, resource, objects);
        parent_context = context;
        Layout_id = resource;
        InfoList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(Layout_id, parent, false);
        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvTitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvSalary = rowView.findViewById(R.id.textViewSalary);
        EmployeeInfo currentItem = InfoList.get(position);
        String name = currentItem.getName();
        String title = currentItem.getTitle();
        String salary = currentItem.getSalary();
        tvName.setText(name);
        tvTitle.setText(title);
        tvSalary.setText(salary);
        return rowView;

    }
}
