package com.example.listfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

//�� list�� item�� �ش��ϴ� ������ �����ִ� fragment
public class DetailsFragment extends Fragment {
	public static DetailsFragment newInstance(int position){
		DetailsFragment df = new DetailsFragment();
		
		Bundle args = new Bundle();
		args.putInt("position", position);
		df.setArguments(args);
		
		return df;
	}
	
	public int getPosition(){
		return getArguments().getInt("position",0);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View v = inflater.inflate(R.layout.detailview, container, false);
		
		TextView textView = (TextView) v.findViewById(R.id.details);
		textView.setText(Info.DETAILS[getPosition()]);
		
		return v;
	}
}
