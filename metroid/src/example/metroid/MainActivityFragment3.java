package example.metroid;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A dummy fragment representing a section of the app, but that simply displays dummy text.
 */
public class MainActivityFragment3 extends Fragment {
    public MainActivityFragment3() {
    }

    public static final String ARG_SECTION_NUMBER = "section_number";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
    	
    	 return inflater.inflate(R.layout.section3, container, false);
    }
}