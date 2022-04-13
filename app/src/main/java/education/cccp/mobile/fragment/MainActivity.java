package education.cccp.mobile.fragment;

import static education.cccp.mobile.fragment.R.id.secondFrameId;
import static education.cccp.mobile.fragment.R.layout.activity_main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @SuppressWarnings("FieldCanBeLocal")
    private FirstFragment firstFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        firstFragment = new FirstFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .add(secondFrameId,firstFragment);
    }
}