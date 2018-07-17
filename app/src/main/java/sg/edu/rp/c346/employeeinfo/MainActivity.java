package sg.edu.rp.c346.employeeinfo;

import android.media.session.PlaybackState;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvInfo;
    ArrayList<EmployeeInfo> alInfo;
    CustomAdapter caInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvInfo = findViewById(R.id.ListViewInfo);

        alInfo = new ArrayList<>();

        EmployeeInfo info1 = new EmployeeInfo("John", "Software Technical Leader", "3400.0");
        EmployeeInfo info2 = new EmployeeInfo("May", "Programmer", "2200.0");
        alInfo.add(info1);
        alInfo.add(info2);

        caInfo = new CustomAdapter(this, R.layout.employee_info, alInfo);
        lvInfo.setAdapter(caInfo);

    }
}
