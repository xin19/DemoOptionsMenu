package com.xin19.demooptionsmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.editText1);
        et2 = findViewById(R.id.editText2);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    String text = "" ;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
      switch (item.getItemId()){
          case R.id.item_copy:
            text = et1.getText().toString();
            break;
          case R.id.item_paste:
              et2.setText(text);
              break;
          case R.id.item_about:

              break;
          case R.id.item_exit:

              break;




      }



        return super.onOptionsItemSelected(item);
    }


}
