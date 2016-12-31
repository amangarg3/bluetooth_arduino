package com.example.android.bluetoothchat;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Toast;

import com.example.android.DatabaseClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import static android.R.attr.delay;

public class Main2Activity extends AppCompatActivity {

    Records r;
   // DatabaseHelper dbhelper = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        r = new Records();

        Calendar cal1 = Calendar.getInstance();
        SimpleDateFormat time = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

        String stime = time.format(cal1.getTime());

        r.setId(5);
        r.setDatenTime(stime);
        r.setValue("8");

        DatabaseClass insData = new DatabaseClass(this);
        insData.open();
        insData.insertdata(r);
        insData.close();

      /*  //dbhelper.onCreate(SQ);
        r = new Records();

        Calendar cal1 = Calendar.getInstance();
        SimpleDateFormat time = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

        String stime = time.format(cal1.getTime());

        r.setId(1);
        r.setDatenTime(stime);
        r.setValue("10");

        dbhelper.insertdata(r);

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat time1 = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

        String stime1 = time1.format(cal1.getTime());
        r.setId(2);
        r.setDatenTime(stime1);
        r.setValue("12");

        //  Toast.makeText(this, stime, Toast.LENGTH_LONG).show();

        dbhelper.insertdata(r);

        Calendar cal2 = Calendar.getInstance();
        SimpleDateFormat time2 = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

        String stime2 = time2.format(cal1.getTime());
        r.setId(3);
        r.setDatenTime(stime2);
        r.setValue("7");

        Toast.makeText(this, stime, Toast.LENGTH_LONG).show();

        dbhelper.insertdata(r);
        */
    }

    public void view_graph(View v){
        Intent i = new Intent(this,display_graph.class);
        startActivity(i);
    }

    public void bargraph(View view) {
        Intent i = new Intent(this, BGraph.class);
        startActivity(i);
    }

    public void line_chart(View view) {
        Intent i = new Intent(this, lineChartClass.class);
        startActivity(i);
    }

    public void piechart(View view) {
        Intent i = new Intent(this, PieChartClass.class);
        this.startActivity(i);
    }

    public void connect(View view) {
        Intent serverIntent = new Intent(this, DeviceListActivity.class);
        startActivityForResult(serverIntent, 1);
    }

    public void update(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void displaydata(View view) {
        Intent i = new Intent(this, disData.class);
        startActivity(i);
    }

    public void mainpage(View v){
        Intent i = new Intent(this, Main3Activity.class);
        startActivity(i);
    }

}
