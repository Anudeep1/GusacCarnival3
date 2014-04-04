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

public class TEdab extends ActionBarActivity implements ActionBar.TabListener {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide fragments for each of the
     * three primary sections of the app. We use a {@link android.support.v4.app.FragmentPagerAdapter}
     * derivative, which will keep every loaded fragment in memory. If this becomes too memory
     * intensive, it may be best to switch to a {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    AppSectionsPagerAdapter mAppSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will display the three primary sections of the app, one at a
     * time.
     */
    ViewPager mViewPager;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tedab);

        // Create the adapter that will return a fragment for each of the three primary sections
        // of the app.
        mAppSectionsPagerAdapter = new AppSectionsPagerAdapter(getSupportFragmentManager());

        // Set up the action bar.
        final ActionBar actionBar = getSupportActionBar();

        // Specify that the Home/Up button should not be enabled, since there is no hierarchical
        // parent.
        actionBar.setHomeButtonEnabled(false);

        // Specify that we will be displaying tabs in the action bar.
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        // Set up the ViewPager, attaching the adapter and setting up a listener for when the
        // user swipes between sections.
        mViewPager = (ViewPager) findViewById(R.id.workshopspager);
        mViewPager.setAdapter(mAppSectionsPagerAdapter);
        mViewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                // When swiping between different app sections, select the corresponding tab.
                // We can also use ActionBar.Tab#select() to do this if we have a reference to the
                // Tab.
                actionBar.setSelectedNavigationItem(position);
            }
        });

        // For each of the sections in the app, add a tab to the action bar.
        for (int i = 0; i < mAppSectionsPagerAdapter.getCount(); i++) {
            // Create a tab with text corresponding to the page title defined by the adapter.
            // Also specify this Activity object, which implements the TabListener interface, as the
            // listener for when this tab is selected.
            actionBar.addTab(
                    actionBar.newTab()
                            .setText(mAppSectionsPagerAdapter.getPageTitle(i))
                            .setTabListener(this));
        }
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        // When the given tab is selected, switch to the corresponding page in the ViewPager.
        mViewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
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
                    return new ExtremeAdventuresFragment();

                case 1:
                	return new WaterRocketryFragment();
                case 2:
                	return new CompanionBotFragment();

                case 3:
                	return new NavikFragment();

                case 4:
                	return new BobTheBuilderFragment();
                case 5:
                	return new ArtificialIsland();
                case 6:
                	return new RoboCricket();
                case 7:
                	return new ProjectX();
                case 8:
                	return new TomAndJerry();
               
                case 9:
                	return new BehindEnemyLines();
                case 10:
                	return new MouseTrapRace();
                	
            
                	default:
                		return new ExtremeAdventuresFragment();

            }
        }

        @Override
        public int getCount() {
            return 11;
        }

        @Override
        public CharSequence getPageTitle(int position) {
        	switch(position)
        	{
        	case 0:
        		return "ExtremeAdventures";
        	case 1:
        		return "WaterRocketry";
        	case 2:
        		return "CompanionBot";
        	case 3:
        		return "Navik";
        	case 4:
        		return "BobTheBuilder";
        	case 5:
        		return "ArtificialIsland";
        	case 6:
        		return "RoboCricket";
        	case 7:
        		return "ProjectX";
        	case 8:
        		return "TomAndJerry";
        	
        	case 9:
        		return "BehindEnemyLines";
        	case 10:
        		return "MouseTrapRace";
        		
        	}
            return "Section " + (position + 1);
        }
    }
    public static class ExtremeAdventuresFragment extends Fragment {
    	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    	        Bundle savedInstanceState) {
    	        // Inflate the layout for this fragment
    	        return inflater.inflate(R.layout.texextremeadventure, container, false);
    	    }
    }
    public static class WaterRocketryFragment extends Fragment {
    	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    	        Bundle savedInstanceState) {
    	        // Inflate the layout for this fragment
    	        return inflater.inflate(R.layout.texwaterrocketery, container, false);
    	    }
    }
    public static class CompanionBotFragment extends Fragment {
    	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    	        Bundle savedInstanceState) {
    	        // Inflate the layout for this fragment
    	        return inflater.inflate(R.layout.texcompanionbot, container, false);
    	    }
    }
    public static class NavikFragment extends Fragment {
    	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    	        Bundle savedInstanceState) {
    	        // Inflate the layout for this fragment
    	        return inflater.inflate(R.layout.texnavik, container, false);
    	    }
    }
    public static class BobTheBuilderFragment extends Fragment {
    	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    	        Bundle savedInstanceState) {
    	        // Inflate the layout for this fragment
    	        return inflater.inflate(R.layout.texbobthebuilder, container, false);
    	    }
    }
    
    public static class ArtificialIsland extends Fragment {
    	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    	        Bundle savedInstanceState) {
    	        // Inflate the layout for this fragment
    	        return inflater.inflate(R.layout.artificialisland, container, false);
    	    }
    }
    
    public static class RoboCricket extends Fragment {
    	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    	        Bundle savedInstanceState) {
    	        // Inflate the layout for this fragment
    	        return inflater.inflate(R.layout.robocricket, container, false);
    	    }
    }
    
    public static class ProjectX extends Fragment {
    	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    	        Bundle savedInstanceState) {
    	        // Inflate the layout for this fragment
    	        return inflater.inflate(R.layout.projectx, container, false);
    	    }
    }
    
    public static class TomAndJerry extends Fragment {
    	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    	        Bundle savedInstanceState) {
    	        // Inflate the layout for this fragment
    	        return inflater.inflate(R.layout.tomandjerry, container, false);
    	    }
    }
    
   
    
    
    public static class BehindEnemyLines extends Fragment {
    	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    	        Bundle savedInstanceState) {
    	        // Inflate the layout for this fragment
    	        return inflater.inflate(R.layout.behindenemylines, container, false);
    	    }
    }
    
    public static class MouseTrapRace extends Fragment {
    	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    	        Bundle savedInstanceState) {
    	        // Inflate the layout for this fragment
    	        return inflater.inflate(R.layout.mousetrapprace, container, false);
    	    }
    }
    }
  


