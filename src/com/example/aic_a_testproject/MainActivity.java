package com.example.aic_a_testproject;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;


public class MainActivity extends Activity {
<<<<<<< HEAD
	
	public static final String TAG ="myTag"; 

=======
private static final String TAG = "TAG";
	
>>>>>>> 5fbe7cfbbc78559f955037b6f3c9811137aeb9ab
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.d(TAG,"(゜∀。)ﾜﾋｬﾋｬﾋｬﾋｬﾋｬﾋｬ");
<<<<<<< HEAD
		//俺がガンダムだ！！
		
		//テスト城
=======
>>>>>>> 5fbe7cfbbc78559f955037b6f3c9811137aeb9ab
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
