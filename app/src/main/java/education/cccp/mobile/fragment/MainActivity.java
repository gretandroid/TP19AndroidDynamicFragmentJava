package education.cccp.mobile.fragment;

import static education.cccp.mobile.fragment.R.id.mainFrameLayOutId;
import static education.cccp.mobile.fragment.R.id.menuItemFirstFragId;
import static education.cccp.mobile.fragment.R.id.menuItemSecondFragId;
import static education.cccp.mobile.fragment.R.layout.activity_main;
import static education.cccp.mobile.fragment.R.menu.main_menu;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @SuppressWarnings("FieldCanBeLocal")
    private FirstFragment firstFragment;
    private SecondFragment secondFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        firstFragment = new FirstFragment();
        secondFragment = new SecondFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .add(mainFrameLayOutId, firstFragment)
                .commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(
                main_menu,
                menu
        );
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case menuItemFirstFragId:
                if (!firstFragment.isVisible())
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(mainFrameLayOutId, firstFragment)
                            .addToBackStack(null)
                            .commit();
                return true;
            case menuItemSecondFragId:
                if (!secondFragment.isVisible())
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(mainFrameLayOutId, secondFragment)
                            .addToBackStack(null)
                            .commit();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void onClickCreateFirstItemMenu(MenuItem item) {
        Log.d(this.getClass().getSimpleName(),"onClickCreateFirstItemMenu");
    }
}