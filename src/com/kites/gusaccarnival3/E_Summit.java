package com.kites.gusaccarnival3;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBar.Tab;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class E_Summit extends ActionBarActivity implements ActionBar.TabListener {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide fragments for each of the
     * three primary sections of the app. We use a {@link android.support.v4.app.FragmentPagerAdapter}
     * derivative, which will keep every loaded fragment in memory. If this becomes too memory
     * intensive, it may be best to switch to a {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    AppSectionsPagerAdapter mAppSectionsPagerAdaptera;

    /**
     * The {@link ViewPager} that will display the three primary sections of the app, one at a
     * time.
     */
    ViewPager mViewPagera;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.esummit);

        // Create the adapter that will return a fragment for each of the three primary sections
        // of the app.
        mAppSectionsPagerAdaptera = new AppSectionsPagerAdapter(getSupportFragmentManager());

        // Set up the action bar.
        final ActionBar actionBar = getSupportActionBar();

        // Specify that the Home/Up button should not be enabled, since there is no hierarchical
        // parent.
        actionBar.setHomeButtonEnabled(false);

        // Specify that we will be displaying tabs in the action bar.
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        // Set up the ViewPager, attaching the adapter and setting up a listener for when the
        // user swipes between sections.
        mViewPagera = (ViewPager) findViewById(R.id.esummitpager);
        mViewPagera.setAdapter(mAppSectionsPagerAdaptera);
        mViewPagera.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                // When swiping between different app sections, select the corresponding tab.
                // We can also use ActionBar.Tab#select() to do this if we have a reference to the
                // Tab.
                actionBar.setSelectedNavigationItem(position);
            }
        });

        // For each of the sections in the app, add a tab to the action bar.
        for (int i = 0; i < mAppSectionsPagerAdaptera.getCount(); i++) {
            // Create a tab with text corresponding to the page title defined by the adapter.
            // Also specify this Activity object, which implements the TabListener interface, as the
            // listener for when this tab is selected.
            actionBar.addTab(
                    actionBar.newTab()
                            .setText(mAppSectionsPagerAdaptera.getPageTitle(i))
                            .setTabListener(this));
        }
    
    }

    @Override
    public void onTabUnselected(Tab tab, FragmentTransaction ft) {
    }

    @Override
    public void onTabSelected(Tab tab, FragmentTransaction ft) {
        mViewPagera.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabReselected(Tab tab, FragmentTransaction ft) {
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to one of the primary
     * sections of the app.
     */
    public static class AppSectionsPagerAdapter extends FragmentPagerAdapter {

        public AppSectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            switch (i) {
              

                case 0:
                	return new Speakers();
                case 1:
                	return new Spotlightevents();

                case 2:
                	return new EWorkshops();

                case 3:
                	return new Startupexpo();
                case 4:
                	return new Contactus();
               
                	default:
                		return new  Speakers();

            }
        }

        @Override
        public int getCount() {
            return 5;
        }

        @Override
        public CharSequence getPageTitle(int position) {
        	switch(position)
        	{
        	
        	case 0:
        		return "Speakers";
        	case 1:
        		return "SpotLightEvents";
        	case 2:
        		return "Workshops";
        	case 3:
        		return "Startupexpo";
        	case 4:
        		return "Contact";
        	
        		
        	}
            return "Section " + (position + 1);
        }
    }
    public static class Speakers extends Fragment {
    	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    	        Bundle savedInstanceState) {
    	        // Inflate the layout for this fragment
    	        return inflater.inflate(R.layout.espeakers, container, false);
    	    }
    }
   
    
    public static class Spotlightevents extends Fragment {
    	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    	        Bundle savedInstanceState) {
    	        // Inflate the layout for this fragment
    	        return inflater.inflate(R.layout.spotlightevents, container, false);
    	    }
    }
    public static class EWorkshops extends Fragment {
    	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    	        Bundle savedInstanceState) {
    	        // Inflate the layout for this fragment
    	        return inflater.inflate(R.layout.eworkshops, container, false);
    	    }
    }
    public static class Startupexpo extends Fragment {
    	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    	        Bundle savedInstanceState) {
    	        // Inflate the layout for this fragment
    	        return inflater.inflate(R.layout.startupexpo, container, false);
    	    }
    }
    public static class Contactus extends Fragment {
    	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    	        Bundle savedInstanceState) {
    	        // Inflate the layout for this fragment
    	        return inflater.inflate(R.layout.econtact, container, false);
    	    }
    }
   
    
   
	
}
