package net.imperium.imperious.space.utils;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.view.Window;
import android.view.WindowManager;

import net.imperium.imperious.space.R;
import net.imperium.imperious.space.activities.BaseActivity;
import net.imperium.imperious.space.enums.Colors;

/**
 * Created by blaze on 9/20/2016.
 */

public class Utils {

    public static int[] colorTypes(Colors colors, Context context) {
        int[] colorArray = new int[3];
        switch (colors) {
            case COLOR_RED:
                colorArray[0] = ContextCompat.getColor(context, R.color.md_red_300);
                colorArray[1] = ContextCompat.getColor(context, R.color.firebrick);
                colorArray[2] = ContextCompat.getColor(context, R.color.firebrickDark);
                return colorArray;
            case COLOR_BLUE:
                colorArray[0] = ContextCompat.getColor(context, R.color.md_blue_300);
                colorArray[1] = ContextCompat.getColor(context, R.color.md_blue_500);
                colorArray[2] = ContextCompat.getColor(context, R.color.md_blue_700);
                return colorArray;
            case COLOR_GREEN:
                colorArray[0] = ContextCompat.getColor(context, R.color.md_green_300);
                colorArray[1] = ContextCompat.getColor(context, R.color.md_green_500);
                colorArray[2] = ContextCompat.getColor(context, R.color.md_green_700);
                return colorArray;
            case COLOR_ORANGE:
                colorArray[0] = ContextCompat.getColor(context, R.color.md_orange_300);
                colorArray[1] = ContextCompat.getColor(context, R.color.md_orange_500);
                colorArray[2] = ContextCompat.getColor(context, R.color.md_orange_700);
                return colorArray;
            case COLOR_PURPLE:
                colorArray[0] = ContextCompat.getColor(context, R.color.md_purple_300);
                colorArray[1] = ContextCompat.getColor(context, R.color.md_purple_500);
                colorArray[2] = ContextCompat.getColor(context, R.color.md_purple_700);
                return colorArray;
            case COLOR_TEAL:
                colorArray[0] = ContextCompat.getColor(context, R.color.md_teal_300);
                colorArray[1] = ContextCompat.getColor(context, R.color.md_teal_500);
                colorArray[2] = ContextCompat.getColor(context, R.color.md_teal_700);
                return colorArray;
            default:
                return null;
        }
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public static void animate(final BaseActivity activity, final int[] colors) {
        int currentColorPrimary = ((ColorDrawable) activity.getToolbar().getBackground()).getColor();
        int currentColorPrimaryDark = activity.getWindow().getStatusBarColor();
        int currentColorPrimaryAccent = activity.getFab().getBackgroundTintList().getDefaultColor();
        ValueAnimator colorAnimationPrimaryAccent = ValueAnimator.ofObject(new ArgbEvaluator(), currentColorPrimaryAccent, colors[0]);
        ValueAnimator colorAnimationPrimary = ValueAnimator.ofObject(new ArgbEvaluator(), currentColorPrimary, colors[1]);
        ValueAnimator colorAnimationPrimaryDark = ValueAnimator.ofObject(new ArgbEvaluator(), currentColorPrimaryDark, colors[2]);
        colorAnimationPrimaryAccent.setDuration(750);
        colorAnimationPrimary.setDuration(750);
        colorAnimationPrimaryDark.setDuration(750);
        colorAnimationPrimary.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animator) {
                activity.getToolbar().setBackgroundColor((int) animator.getAnimatedValue());
                activity.getTabLayout().setBackgroundColor((int) animator.getAnimatedValue());
                activity.getAppBarLayout().setBackgroundColor((Integer) animator.getAnimatedValue());
            }
        });
        colorAnimationPrimaryDark.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Window window = activity.getWindow();
                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                window.setStatusBarColor((Integer) valueAnimator.getAnimatedValue());
            }
        });
        colorAnimationPrimaryAccent.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                activity.getFab().setBackgroundTintList(ColorStateList.valueOf((Integer) valueAnimator.getAnimatedValue()));
            }
        });
        colorAnimationPrimary.start();
        colorAnimationPrimaryDark.start();
        colorAnimationPrimaryAccent.start();
    }
}