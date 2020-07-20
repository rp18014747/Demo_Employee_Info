package sg.edu.rp.c346.id18014747.demoemployeeinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvEmployees;
    ArrayList<EmployeeInfo> employeeList;
    ArrayAdapter<EmployeeInfo> aaEmployees;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployees = findViewById(R.id.listViewEmployees);

        employeeList = new ArrayList<>();
        employeeList.add(new EmployeeInfo("John", "Software Technical Leader", 3400.0));
        employeeList.add(new EmployeeInfo("May", "Programmer", 2200.1));

        aaEmployees = new CustomAdapter(this, R.layout.row, employeeList);
        lvEmployees.setAdapter(aaEmployees);
    }
}