package com.kites.gusaccarnival3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class TechEvents extends Activity {
	
	
	  @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.techevents);
	        GridView gridview = (GridView) findViewById(R.id.gridview);
	        gridview.setAdapter(new ImageAdapter(this));

	        gridview.setOnItemClickListener(new OnItemClickListener() {
	            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
	            	switch(position)
	            	{
	            	case 0:
	            		Intent te_cae=new Intent(TechEvents.this,TEcae.class);
	     	    	   startActivity(te_cae);
	     	    	   break;
	            	case 1:
	            		Intent te_pp=new Intent(TechEvents.this,TEpp.class);
		     	    	   startActivity(te_pp);
		     	    	   break;
	            	case 2:
	            		Intent te_dab=new Intent(TechEvents.this,TEdab.class);
		     	    	   startActivity(te_dab);
		     	    	   break;
	            	case 3:
	            		Intent te_quizes=new Intent(TechEvents.this,TEquizes.class);
		     	    	   startActivity(te_quizes);
		     	    	   break;
	            	}

	            }
	        });
	       }
	  public class ImageAdapter extends BaseAdapter {
		    private Context mContext;

		    public ImageAdapter(Context c) {
		        mContext = c;
		    }

		    public int getCount() {
		        return mThumbIds.length;
		    }

		    public Object getItem(int position) {
		        return null;
		    }

		    public long getItemId(int position) {
		        return 0;
		    }

		    // create a new ImageView for each item referenced by the Adapter
		    public View getView(int position, View convertView, ViewGroup parent) {
		        ImageView imageView;
		        if (convertView == null) {  // if it's not recycled, initialize some attributes
		            imageView = new ImageView(mContext);
		            imageView.setLayoutParams(new GridView.LayoutParams(
		                    (int) mContext.getResources().getDimension(R.dimen.width),                                                                                   
		                    (int) mContext.getResources().getDimension(R.dimen.height)));
		            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
		            imageView.setPadding(8, 8, 8, 8);
		        } else {
		            imageView = (ImageView) convertView;
		        }

		        imageView.setImageResource(mThumbIds[position]);
		        return imageView;
		    }

		    // references to our images
		    private Integer[] mThumbIds = {
		            R.drawable.tepart_01, R.drawable.tepart_02,
		            R.drawable.tepart_03, R.drawable.tepart_04,
		            
		    };
		}
}