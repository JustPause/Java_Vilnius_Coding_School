package com.example.b_daygetter;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public
class MainActivity extends AppCompatActivity {

	String DataBaseUserName = "Justinas";
	String DataBaseUserSurName = "Stankunas";
	String DataBaseUserYear = "2003";
	String DataBaseUserMonth = "06";
	String DataBaseUserDay = "25";

	@Override
	protected
	void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		User_name();
		date();
		init_Data_B_day_countdown();
		age_will_be();
	}

	private
	void init_Data_B_day_countdown() {
		TextView textView = findViewById(R.id.B_day_countdown);

/*
        java.time.LocalDate.of(Integer.parseInt(DataBaseUserYear), Integer.parseInt(DataBaseUserMonth), Integer.parseInt(DataBaseUserDay));
*/
		int NowTimeYear = java.time.LocalDate.now().getYear();
		int NowTimeMonth = java.time.LocalDate.now().getMonthValue();
		int NowTimeDay = java.time.LocalDate.now().getDayOfMonth();

		Log.d("Debug1", NowTimeYear + " " + NowTimeMonth + " " + NowTimeDay);
		Log.d("Debug1", DataBaseUserYear + " " + DataBaseUserMonth + " " + DataBaseUserDay);

		textView.setText(String.valueOf(java.time.LocalDate.now().getDayOfYear()));

		Log.d("Debug2", Integer.toString(java.time.LocalDate.now().getDayOfYear()));
		Log.d("Debug2", Integer.toString(
			java.time.LocalDate.of(Integer.parseInt(DataBaseUserYear), Integer.parseInt(DataBaseUserMonth),
				Integer.parseInt(DataBaseUserDay)).getDayOfYear()));
//        Log.d("Debug3", Integer.toString(java.time.LocalDate.of(
//                Integer.parseInt(DataBaseUserYear),
//                Integer.parseInt(DataBaseUserMonth),
//                Integer.parseInt(DataBaseUserDay)
//        ).getDayOfYear() + java.time.LocalDate.now()
//                .getDayOfYear()));

		Log.d("Debug3", Integer.toString((java.time.LocalDate.now().getDayOfYear() -
			java.time.LocalDate.of(Integer.parseInt(DataBaseUserYear), Integer.parseInt(DataBaseUserMonth),
				Integer.parseInt(DataBaseUserDay)).getDayOfYear())));
	}

	@SuppressLint("SetTextI18n")
	protected
	void User_name() {
		TextView textView = findViewById(R.id.User_name);
		textView.setText("Justinas Stankunas");
	}

	@SuppressLint("SetTextI18n")
	protected
	void date() {
		TextView textView = findViewById(R.id.Date);
		textView.setText(DataBaseUserYear + " " + DataBaseUserMonth + " " + DataBaseUserDay);
	}

	@SuppressLint("SetTextI18n")
	protected
	void age_will_be() {
		TextView textView = findViewById(R.id.Age_will_be);
		textView.setText("21");
	}
}