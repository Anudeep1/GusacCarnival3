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

public class GuestLectures extends ActionBarActivity implements ActionBar.TabListener {

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
        setContentView(R.layout.guestlectures);

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
                    return new Srijanpal();

                case 1:
                	return new Susanthpatnaik();
                case 2:
                	return new Durjoydatta();

                case 3:
                	return new Rpskahlon();

                case 4:
                	return new Santhoshpanda();
                case 5:
                	return new Prabhukishore();
                case 6:
                	return new Srinivassarakadam();
                case 7:
                	return new Kvsnprasad();
                case 8:
                	return new Yugandhar();
                case 9:
                	return new Kamalkiran();
                case 10:
                	return new Harimenon();
                case 11:
                	return new Chandrasiddharth();
                case 12:
                	return new Manoharmaganthi();
                case 13:
                	return new Bommarillu();
                case 14:
                	return new Srikanth();
                case 15:
                	return new Marthandk();
                case 16:
                	return new Nilamadhab();
                case 17:
                	return new Nani();
                	
            
                	default:
                		return new Srijanpal();

            }
        }

        @Override
        public int getCount() {
            return 18;
        }

        @Override
        public CharSequence getPageTitle(int position) {
        	switch(position)
        	{
        	case 0:
        		return "Mr.SrijanPalSingh";
        	case 1:
        		return "SusantPattnaik";
        	case 2:
        		return "DurjoyDatta";
        	case 3:
        		return "Shri.R.P.S Kahlon:";
        	case 4:
        		return "Mr.SantoshPanda";
        	case 5:
        		return "Mr.VPrabhuKishore";
        	case 6:
        		return "Srinivas Sarakadam";
        	case 7:
        		return "KVSNPrasad";
        	case 8:
        		return "YugandharTammareddy,CEO,Pixelloid";
        	case 9:
        		return "Kamal Kiran";
        	case 10:
        		return "HariMenon";
        	case 11:
        		return "ChandraSiddhartha:";
        	case 12:
        		return "ManoharMaganthi";
        	case 13:
        		return "BommarilluBhaskar";
        	case 14:
        		return "SrikanthAddala";
        	case 15:
        		return "MarthandKVenkatesh";
        	case 16:
        		return "NilaMadhabPanda";
        	case 17:
        		return "Nani";
        		
        	}
            return "Section " + (position + 1);
        }
    }
    public static class Srijanpal extends Fragment {
    	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    	        Bundle savedInstanceState) {
    	        // Inflate the layout for this fragment
    	        return inflater.inflate(R.layout.srijanpalsingh, container, false);
    	    }
    }
    public static class Susanthpatnaik extends Fragment {
    	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    	        Bundle savedInstanceState) {
    	        // Inflate the layout for this fragment
    	        return inflater.inflate(R.layout.susanthpatnaik, container, false);
    	    }
    }
    public static class Durjoydatta extends Fragment {
    	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    	        Bundle savedInstanceState) {
    	        // Inflate the layout for this fragment
    	        return inflater.inflate(R.layout.durjodatta, container, false);
    	    }
    }
    public static class Rpskahlon extends Fragment {
    	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    	        Bundle savedInstanceState) {
    	        // Inflate the layout for this fragment
    	        return inflater.inflate(R.layout.rpskahlon, container, false);
    	    }
    }
    public static class Santhoshpanda extends Fragment {
    	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    	        Bundle savedInstanceState) {
    	        // Inflate the layout for this fragment
    	        return inflater.inflate(R.layout.santhoshpanda, container, false);
    	    }
    }
    
    public static class Prabhukishore extends Fragment {
    	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    	        Bundle savedInstanceState) {
    	        // Inflate the layout for this fragment
    	        return inflater.inflate(R.layout.prabhukishore, container, false);
    	    }
    }
    
    public static class Srinivassarakadam extends Fragment {
    	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    	        Bundle savedInstanceState) {
    	        // Inflate the layout for this fragment
    	        return inflater.inflate(R.layout.srinivassarakadam, container, false);
    	    }
    }
    
    public static class Kvsnprasad extends Fragment {
    	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    	        Bundle savedInstanceState) {
    	        // Inflate the layout for this fragment
    	        return inflater.inflate(R.layout.kvsnprasad, container, false);
    	    }
    }
    
    public static class Yugandhar extends Fragment {
    	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    	        Bundle savedInstanceState) {
    	        // Inflate the layout for this fragment
    	        return inflater.inflate(R.layout.yugandhar, container, false);
    	    }
    }
    
    public static class Kamalkiran extends Fragment {
    	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    	        Bundle savedInstanceState) {
    	        // Inflate the layout for this fragment
    	        return inflater.inflate(R.layout.kamalkiran, container, false);
    	    }
    }
    
    public static class Harimenon extends Fragment {
    	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    	        Bundle savedInstanceState) {
    	        // Inflate the layout for this fragment
    	        return inflater.inflate(R.layout.harimenon, container, false);
    	    }
    }
    
    public static class Chandrasiddharth extends Fragment {
    	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    	        Bundle savedInstanceState) {
    	        // Inflate the layout for this fragment
    	        return inflater.inflate(R.layout.chandrasiddarth, container, false);
    	    }
    }
    
    public static class Manoharmaganthi extends Fragment {
    	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    	        Bundle savedInstanceState) {
    	        // Inflate the layout for this fragment
    	        return inflater.inflate(R.layout.manoharmaganthi, container, false);
    	    }
    }
    
    public static class Bommarillu extends Fragment {
    	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    	        Bundle savedInstanceState) {
    	        // Inflate the layout for this fragment
    	        return inflater.inflate(R.layout.bommarillu, container, false);
    	    }
    }
    
    public static class Srikanth extends Fragment {
    	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    	        Bundle savedInstanceState) {
    	        // Inflate the layout for this fragment
    	        return inflater.inflate(R.layout.srikanth, container, false);
    	    }
    }
    
    public static class Nilamadhab extends Fragment {
    	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    	        Bundle savedInstanceState) {
    	        // Inflate the layout for this fragment
    	        return inflater.inflate(R.layout.nilamadhab, container, false);
    	    }
    }
    
    public static class Marthandk extends Fragment {
    	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    	        Bundle savedInstanceState) {
    	        // Inflate the layout for this fragment
    	        return inflater.inflate(R.layout.marthandk, container, false);
    	    }
    }
    
    public static class Nani extends Fragment {
    	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    	        Bundle savedInstanceState) {
    	        // Inflate the layout for this fragment
    	        return inflater.inflate(R.layout.nanni, container, false);
    	    }
    }
    
  
    
    }