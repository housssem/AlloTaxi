package com.ISITCOM.allotaxii.Menu;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ISITCOM.allotaxii.R;

public class FideliteDao extends Fragment {

	public FideliteDao() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_whats_hot,
				container, false);

		return rootView;
	}
}
