package com.kites.gusaccarnival3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class Mainmenu extends Activity {
	 private ListView listView1;

	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.mainmenu);
	        
	        ItemIntialize item_data[] = new ItemIntialize[]
	        {
	            new ItemIntialize(R.drawable.m_01),
	            new ItemIntialize(R.drawable.m_02),
	            new ItemIntialize(R.drawable.m_03),
	            new ItemIntialize(R.drawable.m_04),
	            new ItemIntialize(R.drawable.m_05),
	            new ItemIntialize(R.drawable.m_06),
	            new ItemIntialize(R.drawable.m_07),
	            new ItemIntialize(R.drawable.m_08),
	            new ItemIntialize(R.drawable.m_09),
	            new ItemIntialize(R.drawable.m_10),
	            new ItemIntialize(R.drawable.m_11),
	            new ItemIntialize(R.drawable.m_12),
	          

	        };
	        
	        CAAdapter adapter = new CAAdapter(this, 
	                R.layout.listitem, item_data);
	        
	        
	        listView1 = (ListView)findViewById(R.id.MainMenu);
	        
	        listView1.setAdapter(adapter);
	        listView1.setOnItemClickListener(new OnItemClickListener() {
	            @Override
	            public void onItemClick(AdapterView<?> parent, View view, int position,
	                    long id) {
	       //String selected= (String)(listView1.getItemIdAtPosition(position));
	           // String title=((TextView)view.findViewById(R.id.MainMenu)).getText();
            	//TextView txtProduct = (TextView) findViewById(R.id.MainMenu);
	       switch(position)
	       {
	       case 0:
	    	   Intent main_updates=new Intent(Mainmenu.this,TestDatabaseActivity.class);
	    	   startActivity(main_updates);
	    	   break;
	       case 1:
	    	   Intent main_techevents=new Intent(Mainmenu.this,TechEvents.class);
	    	   startActivity(main_techevents);
	    	   break;
	       case 2:
	    	   Intent main_workshops=new Intent(Mainmenu.this,Workshops.class);
	    	   startActivity(main_workshops);
	    	   break;
	       case 3:
	    	   Intent main_esummit=new Intent(Mainmenu.this,E_Summit.class);
	    	   startActivity(main_esummit);
	    	   break;
	       case 4:
	    	   Intent main_filmfest=new Intent(Mainmenu.this,FilmFestival.class);
	    	   startActivity(main_filmfest);
	    	   break;
	       case 5:
	    	   Intent main_guestlectures=new Intent(Mainmenu.this,GuestLectures.class);
	    	   startActivity(main_guestlectures);
	    	   break;
	       case 6:
	    	   Intent main_literaryfest=new Intent(Mainmenu.this,LiteraryFest.class);
	    	   startActivity(main_literaryfest);
	    	   break;
	       case 7:
	    	   Intent main_nys=new Intent(Mainmenu.this,NYSummit.class);
	    	   startActivity(main_nys);
	    	   break;
	       case 8:
	    	   Intent main_vision2020=new Intent(Mainmenu.this,Vision2020.class);
	    	   startActivity(main_vision2020);
	    	   break;
	       case 9:
	    	   Intent main_hive=new Intent(Mainmenu.this,Sponsors.class);
	    	   startActivity(main_hive);
	    	   break;
	       case 10:
	    	   Intent main_sponsors=new Intent(Mainmenu.this,Contacts.class);
	    	   startActivity(main_sponsors);
	    	   break;
	       case 11:
	    	   Intent main_contact=new Intent(Mainmenu.this,Credits.class);
	    	   startActivity(main_contact);
	    	   break;
	      
	      

	       }
	               
	            
	            }});
	        }
}