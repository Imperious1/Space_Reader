package net.imperium.imperious.space.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import net.imperium.imperious.space.R;

public class ArticleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setTheme(chooseTheme(getIntent().getIntExtra("color", R.style.AppThemeRed)));
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_article);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        if (getSupportActionBar() != null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(null);
        TextView content = (TextView) findViewById(R.id.article_content_final);
        content.setText("NASA has turned one of its aerial instruments toward Australia's Great Barrier Reef, in an effort to study the destruction of this natural wonder and other coral reefs around the world. \n" +
                "\n" +
                "The agency's aptly titled CORAL mission (short for COral Reef Airborne Laboratory) will study four major coral-reef systems using data gathered by an instrument mounted in the belly of an airplane.\n" +
                "\n" +
                "The CORAL team set up camp in Australia earlier this month, and after some bad-weather days, the first science flights over the Great Barrier Reef took place Sept. 9, a NASA representative told Space.com. [Images: Colorful Corals of the Deep Barrier Reef]\n" +
                "\n" +
                "\n" +
                " Changing oceans\n" +
                "\n" +
                "The Great Barrier Reef covers an area of about 133,000 square miles (344,400 square kilometers), and is the largest structure on Earth made by living organisms, according to a statement from NASA. But this natural wonder, like many other coral reefs around the world, is showing serious signs of decline. As corals die, they are replaced with flat beds of algae and sand; this is a natural occurrence, but typically new corals also appear to replace the old ones. Instead, coral reefs are \"degrading at alarming rates due to human-induced factors and global change,\" thestatement said. \n" +
                "\n" +
                "Efforts to assess the damage are sparse, and data sets that do exist aren't uniform, making it hard to see the bigger picture.\n" +
                "\n" +
                "\"Virtually all reef assessments to date rely on in-water survey techniques that are laborious, expensive and limited in spatial scope,\" Eric Hochberg, CORAL principal investigator, said in the statement. \"Very little of Earth's reef area has been directly surveyed.\"\n" +
                "\n" +
                "Hochberg, an associate professor at the Bermuda Institute of Ocean Sciences (BIOS), said scientists also need to build models that can help scientists predict how these reefs will react to \"the full range of biological and environmental factors that affect them.\" To that end, Hochberg said CORAL addresses \"an urgent need in the face of ongoing worldwide reef degradation.\" \n" +
                "\n" +
                "\n" +
                " The CORAL mission will include some in-water data collection, but that will mainly be used to validate the data taken aerially with the Portable Remote Imaging Spectrometer (PRISM). The instrument is built into a modified Gulfstream IV aircraft, built by Tempus Solutions. The plane is about the size of a small commercial aircraft. Other Gulfstream IV's have been modified by NOAA and used to study hurricanes and cyclones. \n" +
                "\n" +
                "The PRISM instrument collects sunlight reflected off the reefs \"in the specific regions of the electromagnetic spectrum important to coral reef scientists,\" according to the statement. The data will be analyzed \"against data for 10 key biological and environmental factors affecting coral reef ecosystems, acquired from pre-existing data sources.\"\n" +
                "\n" +
                "The CORAL team will continue to collect data on the Great Barrier Reef through the end of October. Later this year, the program will move to study reefs around the Hawaiian Islands; in the spring of 2017, the mission will take aerial observations of the reefs around two island archipelagos east of the Philippines: the Mariana Islands and Palau. From that comprehensive data set, scientists will be able to search for widespread trends between the state of coral reefs, and the factors (both natural and human-produced) that affect their health.\n" +
                "\n" +
                "Follow Calla Cofield @callacofield. Follow us @Spacedotcom, Facebook and Google+. Original article on Space.com.");
    }

    private int chooseTheme(int id) {
        switch (id) {
            case 0:
                return R.style.AppThemeRed;
            case 1:
                return R.style.AppThemeBlue;
            case 2:
                return R.style.AppThemePurple;
            case 3:
                return R.style.AppThemeGreen;
            case 4:
                return R.style.AppThemeOrange;
            case 5:
                return R.style.AppThemeTeal;
            default:
                return R.style.AppThemeRed;
        }
    }
}
