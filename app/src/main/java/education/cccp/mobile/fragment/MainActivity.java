package education.cccp.mobile.fragment;

import static education.cccp.mobile.fragment.R.id.menuItemFirstFragId;
import static education.cccp.mobile.fragment.R.id.mainFrameId;
import static education.cccp.mobile.fragment.R.id.menuItemSecondFragId;
import static education.cccp.mobile.fragment.R.layout.activity_main;
import static education.cccp.mobile.fragment.R.menu.main_menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

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
                .add(mainFrameId, firstFragment)
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
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(mainFrameId, firstFragment)
                        .commit();
                return true;
            case menuItemSecondFragId:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(mainFrameId, secondFragment)
                        .commit();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}