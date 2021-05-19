package sg.edu.rp.c346.id20042755.mymodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView tvModulel, tvModule2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvModulel = findViewById(R.id.textViewModule1);
        tvModule2 = findViewById(R.id.textViewModule2);

        tvModulel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode","C346");
                intent.putExtra("ModuleName","Android Programming");
                intent.putExtra("AcademicYear", "2020");
                intent.putExtra("Semester", "1");
                intent.putExtra("ModuleCredit", "4");
                intent.putExtra("Venue", "W66M");
                startActivity(intent);
        }
    });
        tvModule2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode","C349");
                intent.putExtra("ModuleName","Ipad Programming");
                intent.putExtra("AcademicYear",2020);
                intent.putExtra("Semester",1);
                intent.putExtra("ModuleCredit","6");
                intent.putExtra("Venue","W65M");
                startActivity(intent);

            }
        });

}
}