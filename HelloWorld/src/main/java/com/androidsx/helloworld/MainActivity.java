package com.androidsx.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import com.androidsx.library.LibraryActivity;
import com.androidsx.library.LibraryUtil;

/**
 * Main activity for our sample application.
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTextUsingLibraryMethod((TextView) findViewById(R.id.my_text_view));
    }

    private void setTextUsingLibraryMethod(TextView textView) {
        final String librarySays = LibraryUtil.sayHello();
        textView.setText(librarySays);
    }

    /**
     * Starts an activity that is defined in the library module.
     * <p>
     * This method is called from our layout.
     */
    public void dispatchToActivity(View v) {
        startActivity(new Intent(this, LibraryActivity.class));
    }
}
