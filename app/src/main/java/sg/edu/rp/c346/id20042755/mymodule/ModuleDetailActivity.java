package sg.edu.rp.c346.id20042755.mymodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.time.Year;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvCode, tvName, tvYear, tvSemester, tvCredit, tvVenue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);
        tvCode = findViewById(R.id.tvCode);
        tvName = findViewById(R.id.tvName);
        tvYear = findViewById(R.id.tvYear);
        tvSemester = findViewById(R.id.tvSem);
        tvCredit = findViewById(R.id.tvCred);
        tvVenue = findViewById(R.id.tvCred);


        Intent intentReceived = getIntent();
        String ModuleCode = intentReceived.getStringExtra("ModuleCode");
        String ModuleName = intentReceived.getStringExtra("ModuleName");
        int AcademicYear = intentReceived.getIntExtra("AcademicYear", 1999);
        int Semester = intentReceived.getIntExtra("Semester", 0);
        int ModuleCredit = intentReceived.getIntExtra("ModuleCredit", 0);
        String Venue = intentReceived.getStringExtra("Venue");

        tvCode.setText("ModuleCode: " + ModuleCode );
        tvName.setText("ModuleName: " + ModuleName);
        tvYear.setText("Academic Year: " + AcademicYear);
        tvSemester.setText("Semester: " + Semester);
        tvCredit.setText("Credit: " + ModuleCredit);
        tvVenue.setText("Venue" + Venue);




    }
}