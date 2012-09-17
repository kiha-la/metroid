package example.metroid;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.NavUtils;
import android.support.v4.view.ViewPager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends FragmentActivity {

	/**
	 * The {@link android.support.v4.view.PagerAdapter} that will provide
	 * fragments for each of the sections. We use a
	 * {@link android.support.v4.app.FragmentPagerAdapter} derivative, which
	 * will keep every loaded fragment in memory. If this becomes too memory
	 * intensive, it may be best to switch to a
	 * {@link android.support.v4.app.FragmentStatePagerAdapter}.
	 */
	SectionsPagerAdapter mSectionsPagerAdapter;

	/**
	 * The {@link ViewPager} that will host the section contents.
	 */
	ViewPager mViewPager;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// Create the adapter that will return a fragment for each of the three
		// primary sections
		// of the app.
		mSectionsPagerAdapter = new SectionsPagerAdapter(
				getSupportFragmentManager());

		// Set up the ViewPager with the sections adapter.
		mViewPager = (ViewPager) findViewById(R.id.pager);
		mViewPager.setAdapter(mSectionsPagerAdapter);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	/**
	 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
	 * one of the primary sections of the app.
	 */
	public class SectionsPagerAdapter extends FragmentPagerAdapter {

		public SectionsPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		/*
		 * //引数iで指定されたページに表示するFragmentインスタントを返す. public Fragment getItem(int i)
		 * { Fragment fragment = new MainActivityFragment(); Bundle args = new
		 * Bundle(); args.putInt(MainActivityFragment.ARG_SECTION_NUMBER, i +
		 * 1); fragment.setArguments(args); return fragment; }
		 */
		@Override
		// 引数iで指定されたページに表示するFragmentインスタントを返す.
		
		/*
		public Fragment getItem(int i) {
			Fragment fragment1 = new MainActivityFragment1();
			Fragment fragment2 = new MainActivityFragment2();
			Fragment fragment3 = new MainActivityFragment3();
			Bundle args = new Bundle();
			args.putInt(MainActivityFragment1.ARG_SECTION_NUMBER, i + 1);

			Fragment fragment = null;
			
			
			fragment.setArguments(args);
			 
			switch (i) {
			case 1:
				return fragment=fragment1; 
			case 2:
				return fragment=fragment2; 
			case 3:
				return fragment=fragment3; 
			}
			
			return fragment;
		

		}
		*/
		
		public Fragment getItem(int i) {
			Fragment fragment1 = new MainActivityFragment1();
			Fragment fragment2 = new MainActivityFragment2();
			Fragment fragment3 = new MainActivityFragment3();
			//Bundle args = new Bundle();
			//args.putInt(MainActivityFragment1.ARG_SECTION_NUMBER, i + 1);

			Fragment fragment = null;
			
			
			//fragment.setArguments(args);
			 
			switch (i) {
			case 0:
				return fragment=fragment1; 
			case 1:
				return fragment=fragment2; 
			case 2:
				return fragment=fragment3; 
			}
			
			
			return fragment1;
		

		}

		@Override
		// ページ数を返す
		public int getCount() {
			return 3;
		}

		@Override
		public CharSequence getPageTitle(int position) {
			switch (position) {
			case 0:
				return getString(R.string.title_section1).toUpperCase();
			case 1:
				return getString(R.string.title_section2).toUpperCase();
			case 2:
				return getString(R.string.title_section3).toUpperCase();
			}
			return null;
		}
	}

}
