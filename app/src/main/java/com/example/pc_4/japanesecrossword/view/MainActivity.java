package com.example.pc_4.japanesecrossword.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.pc_4.japanesecrossword.R;
import com.example.pc_4.japanesecrossword.view.recyclerview.ItemObject;
import com.example.pc_4.japanesecrossword.view.recyclerview.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewItems;

    private int withNonogram = 7;
    private int heighNonogram = 5;

    private GridLayoutManager lLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewItems = (RecyclerView) findViewById(R.id.recycler_view);

        //staticMonthYear = monthYear;

        //Log.d(TAG, "From MainContentFragment.SetupData monthYear = "+ monthYear);

        List<ItemObject> rowListItem = getAllItemList();
        lLayout = new GridLayoutManager(this, withNonogram);


        //recyclerViewItems.setHasFixedSize(true);
        recyclerViewItems.setLayoutManager(lLayout);

        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(this, rowListItem);
        recyclerViewItems.setAdapter(rcAdapter);

    }


    private List<ItemObject> getAllItemList() {
        List<ItemObject> allItems = new ArrayList<>();

        /*DatabaseHelper dbHelper = OpenHelperManager.getHelper(getContext(), DatabaseHelper.class);
        RuntimeExceptionDao<Note, Integer> noteDao = dbHelper.getNoteDao();*/

        //Log.d(TAG, "getAllItemList    monthYear = " + monthYear);

       /* String[] monthYearArray = getResources().getStringArray(R.array.months_years_array);

        int selectedMonthYear = 0;
        int dayToday;

        for(int n = 0; n < monthYearArray.length; n++ ){

            //Log.d(TAG, "monthYearArray[" + n + "] = " + monthYearArray[n] + "\n");

            if(monthYearArray[n].equals(monthYear)) {
                selectedMonthYear = n;
            }
        }*/
       /* int selectedYear = selectedMonthYear / 12 + 2016;
        int selectedMonth = selectedMonthYear % 12;

        Calendar calendar = Calendar.getInstance();
        calendar.set(selectedYear, selectedMonth, 1);
        int daysOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        int firstDayofWeekInMonth = calendar.get(Calendar.DAY_OF_WEEK);

        //Определение текущей даты сравнивая текущий год и месяц
        Calendar toCalendar = Calendar.getInstance();
        if(toCalendar.get(Calendar.MONTH) == selectedMonth && toCalendar.get(Calendar.YEAR) == selectedYear){
            dayToday = toCalendar.get(Calendar.DAY_OF_MONTH);
        }
        else {
            dayToday = 32;
        }

        for (int n = 2 - firstDayofWeekInMonth; n <= daysOfMonth; n++) {
            if (n < 1) {
                allItems.add(new ItemObject(0, false, false));
            }
            else if (n == dayToday) {
                allItems.add(new ItemObject(n, true, false));
            }
            else {
                try{
                    List<Note> notes = noteDao.queryForEq("date", n + " " + monthYear);
                    if(!notes.isEmpty()){
                        allItems.add(new ItemObject(n, false, true));
                    } else{
                        allItems.add(new ItemObject(n, false, false));
                        // Log.d("demo","n = " + n);
                    }
                }catch (Throwable t){
                    Log.d("demo", "Argument for 'date' is null");
                    //Log.d("demo","n = " + n);
                }
            }
        }*/

        for(int n = 0; n < 49; n++ ){
            allItems.add(new ItemObject(0, "white"));
        }
        //OpenHelperManager.releaseHelper();
        //Log.d(TAG, "firstDayofWeekInMonth = " + firstDayofWeekInMonth + "\n daysOfMonth = " + daysOfMonth);

        return allItems;
    }
}
