package com.justinleesf.androidcalendar;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CalendarView.OnDateChangeListener;
import android.widget.EditText;
import android.widget.Toast;
import android.app.Activity;

public class AndroidCalendar extends Activity implements OnClickListener {
	CalendarView calendar;
	Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// sets the main layout of the activity
		setContentView(R.layout.activity_main);

		// initializes the calendarview
		initializeCalendar();

		// initialize and cast all corresponding objects
		Button enter = (Button) findViewById(R.id.button1);
		enter.setOnClickListener(this);
		Button clear = (Button) findViewById(R.id.button2);
		clear.setOnClickListener(this);


	}

	@Override
	public void onClick(View v) {
		
		EditText input = (EditText) findViewById(R.id.editText1);
		EditText output = (EditText) findViewById(R.id.editText2);

		switch (v.getId()) {

		case R.id.button1:
			//EditText output = (EditText) findViewById(R.id.editText2);
		
			output.setText("hello justin");
			break;

		case R.id.button2:
			
			
			output.setText("");

			break;

		default:
			break;

		}
	}

	public void initializeCalendar() {
		calendar = (CalendarView) findViewById(R.id.calendar);

		// calendar.dateTextAppearance(5);

		// sets whether to show the week number.
		calendar.setShowWeekNumber(false);

		// sets the first day of week according to Calendar.
		// here we set Monday as the first day of the Calendar
		calendar.setFirstDayOfWeek(2);

		// The background color for the selected week.
		//

		// calendar.setSelectedWeekBackgroundColor(getResources().getColor(R.color.red));

		calendar.setWeekSeparatorLineColor(getResources().getColor(R.color.green));

		// sets the color for the dates of an unfocused month.
		calendar.setUnfocusedMonthDateColor(getResources().getColor(R.color.transparent));

		// sets the color for the separator line between weeks.
		// calendar.setWeekSeparatorLineColor(getResources().getColor(R.color.transparent));

		// sets the color for the vertical bar shown at the beginning and at the
		// end of the selected date.
		calendar.setSelectedDateVerticalBar(R.color.red);

		// sets the color for each date in the calendar
		// calendar.setFocusedMonthDateColor(getResources().getColor(R.color.green));

		// sets the listener to be notified upon selected date change.
		calendar.setOnDateChangeListener(new OnDateChangeListener() {
			// show the selected date as a toast

			@Override
			public void onSelectedDayChange(CalendarView view, int year, int month, int day) {
				Toast.makeText(getApplicationContext(), day + "/" + month + "/" + year, Toast.LENGTH_LONG).show();
			}
		});
	}

}