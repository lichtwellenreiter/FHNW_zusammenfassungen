package ch.fhnw.edu.helloworld;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    	View view = inflater.inflate(
    			R.layout.fragment_main,
    			container,
    			false); //!!! this is important
    	return view;
    }
}
