package com.maps.instagramclone.Utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;

import com.maps.instagramclone.LikesActivity;
import com.maps.instagramclone.MainActivity;
import com.maps.instagramclone.ProfileActivity;
import com.maps.instagramclone.R;
import com.maps.instagramclone.SearchActivity;
import com.maps.instagramclone.ShareActivity;

public class BottomNavigationViewHelper {
    private static final String TAG = "BottomNavigationView";

    public static void enableNavigation(final Context context, BottomNavigationView view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.ic_house:
                        Intent intent4 = new Intent(context, MainActivity.class);
                        context.startActivity(intent4);
                        break;
                    case R.id.ic_search:
                        Intent intent5 = new Intent(context, SearchActivity.class);
                        context.startActivity(intent5);
                        break;
                    case R.id.ic_circle:
                        Intent intent3 = new Intent(context, ShareActivity.class);
                        context.startActivity(intent3);
                        break;
                    case R.id.ic_alert:
                        Log.d(TAG, "onNavigationItemSelected: Clicked on alert");
                        Intent intent1 = new Intent(context, LikesActivity.class);
                        context.startActivity(intent1);
                        break;
                    case R.id.ic_android:
                        Intent intent2 = new Intent(context, ProfileActivity.class);
                        context.startActivity(intent2);
                        break;
                }
                return false;
            }
        });
    }
}
