package net.imperium.imperious.space.activities;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by blaze on 9/20/2016.
 */

public abstract class BaseActivity extends AppCompatActivity {

    public abstract TabLayout getTabLayout();

    public abstract FloatingActionButton getFab();

    public abstract Toolbar getToolbar();

    public abstract AppBarLayout getAppBarLayout();
}
