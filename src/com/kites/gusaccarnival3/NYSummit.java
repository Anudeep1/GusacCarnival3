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
public class NYSummit extends ActionBarActivity implements ActionBar.TabListener {

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
        setContentView(R.layout.nysummit);

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
        mViewPager = (ViewPager) findViewById(R.id.nysummitpager);
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
                    return new YuvaSabhaFragment();

                case 1:
                	return new OpenDebateFragment();
                case 2:
                	return new SilicoFragment();

                case 3:
                	return new CriminalInvestigationFragment();

                case 4:
                	return new InGlotFragment();
                case 5:
                	return new TheTrialFragment();
                
            
                	default:
                		return new YuvaSabhaFragment();

            }
        }

        @Override
        public int getCount() {
            return 6;
        }

        @Override
        public CharSequence getPageTitle(int position) {
        	switch(position)
        	{
        	case 0:
        		return "YuvaSabha";
        	case 1:
        		return "OpenDebate";
        	case 2:
        		return "Silico";
        	case 3:
        		return "CriminalInvestigation";
        	case 4:
        		return "InGlot";
        	case 5:
        		return "TheTrial";
        		
        	}
            return "Section " + (position + 1);
        }
    }
    public static class YuvaSabhaFragment extends Fragment {
    	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    	        Bundle savedInstanceState) {
    	        // Inflate the layout for this fragment
    	        return inflater.inflate(R.layout.nysyuvasabha, container, false);
    	    }
    }
    public static class SilicoFragment extends Fragment {
    	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    	        Bundle savedInstanceState) {
    	        // Inflate the layout for this fragment
    	        return inflater.inflate(R.layout.nyssilico, container, false);
    	    }
    }
    public static class CriminalInvestigationFragment extends Fragment {
    	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    	        Bundle savedInstanceState) {
    	        // Inflate the layout for this fragment
    	        return inflater.inflate(R.layout.nyscriminalinvestigation, container, false);
    	    }
    }
    public static class InGlotFragment extends Fragment {
    	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    	        Bundle savedInstanceState) {
    	        // Inflate the layout for this fragment
    	        return inflater.inflate(R.layout.nysinglot, container, false);
    	    }
    }
    public static class TheTrialFragment extends Fragment {
    	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    	        Bundle savedInstanceState) {
    	        // Inflate the layout for this fragment
    	        return inflater.inflate(R.layout.nysthetrial, container, false);
    	    }
    }
    	public static class OpenDebateFragment extends Fragment {
        	public View onCreateView(LayoutInflater inflater, ViewGroup container,
        	        Bundle savedInstanceState) {
        	        // Inflate the layout for this fragment
        	        return inflater.inflate(R.layout.nysopendebate, container, false);
        	    }
    }
    
    }
  
