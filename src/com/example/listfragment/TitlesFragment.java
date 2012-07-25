package com.example.listfragment;

import android.app.ListFragment;
import android.os.Bundle;
import android.app.FragmentTransaction;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
	//list�� ������ ������
public class TitlesFragment extends ListFragment {
	@Override
	public void onActivityCreated(Bundle savedInstanceState){
		super.onActivityCreated(savedInstanceState);
		
		setListAdapter(new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,Info.TITLES));
		
	}
	
	//list ���� item�� Ŭ�� ���� �� ȣ��Ǵ� �޼ҵ�
	@Override
	public void onListItemClick(ListView l , View v, int position, long id){
		super.onListItemClick(l, v, position, id);
		
		DetailsFragment details = (DetailsFragment)getFragmentManager().findFragmentById(R.id.details);
		
		if(details ==null || details.getPosition()!=position){
			details = DetailsFragment.newInstance(position);
			
			FragmentTransaction ft = getFragmentManager().beginTransaction();
			ft.replace(R.id.details, details);
			ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
			ft.commit();
		}
	}
}
