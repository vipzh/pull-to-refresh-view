package com.miloisbadboy;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class DataAdapter extends BaseAdapter{
		Context mContext;
		public DataAdapter(Context context){
			mContext = context;
		}
		@Override
		public int getCount() {
			return 20;
		}

		@Override
		public Object getItem(int position) {
			return position;
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			if(convertView == null){
				TextView textView = new TextView(mContext);
				AbsListView.LayoutParams params = new AbsListView.LayoutParams(LayoutParams.WRAP_CONTENT, 80);
				textView.setTextSize(20);
				textView.setLayoutParams(params);
				
				textView.setText("test");
				convertView = textView;
			}
			return convertView;
		}
		
	}