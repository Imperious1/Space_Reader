package net.imperium.imperious.space.activities;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import net.imperium.imperious.space.R;
import net.imperium.imperious.space.adapters.SectionsPagerAdapter;
import net.imperium.imperious.space.enums.Colors;
import net.imperium.imperious.space.fragments.PlaceholderFragment;
import net.imperium.imperious.space.models.ArticlePreviewModel;

import static net.imperium.imperious.space.utils.Utils.animate;
import static net.imperium.imperious.space.utils.Utils.colorTypes;

public class MainActivity extends BaseActivity implements TabLayout.OnTabSelectedListener, PlaceholderFragment.OnButtonPressedListener {

    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;
    private TabLayout mTabLayout;
    private AppBarLayout mAppBarLayout;
    private Toolbar toolbar;
    private FloatingActionButton mFab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAppBarLayout = (AppBarLayout) findViewById(R.id.appbar);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        mTabLayout = (TabLayout) findViewById(R.id.tabs);
        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.addOnTabSelectedListener(this);
        mFab = (FloatingActionButton) findViewById(R.id.fab);
        mFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so longis
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    Colors colors[] = {Colors.RED, Colors.BLUE, Colors.PURPLE, Colors.GREEN, Colors.ORANGE, Colors.TEAL};

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        final int position = tab.getPosition();
        System.out.println(position);
        animate(this, colorTypes(colors[position], this));

    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {
    }

    @Override
        public void onTabReselected(TabLayout.Tab tab) {
        System.out.println("reselected");

    }

    @Override
    public void onBtnPressed(ArticlePreviewModel article) {
        startActivity(new Intent(MainActivity.this, ArticleActivity.class)
                .putExtra("title", article.getTitle())
                .putExtra("imageUrl", article.getImageUrl()).putExtra("date", article.getDate()).putExtra("color", mTabLayout.getSelectedTabPosition()));
    }

    @Override
    public TabLayout getTabLayout() {
        return mTabLayout;
    }

    @Override
    public FloatingActionButton getFab() {
        return mFab;
    }

    @Override
    public Toolbar getToolbar() {
        return toolbar;
    }

    @Override
    public AppBarLayout getAppBarLayout() {
        return mAppBarLayout;
    }
}