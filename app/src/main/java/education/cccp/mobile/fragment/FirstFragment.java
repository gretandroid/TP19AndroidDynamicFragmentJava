package education.cccp.mobile.fragment;

import static education.cccp.mobile.fragment.R.layout.first_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

public class FirstFragment extends Fragment {

    @SuppressWarnings("FieldCanBeLocal")
    private FirstViewModel mViewModel;

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mViewModel = new ViewModelProvider(this)
                .get(FirstViewModel.class);

        return inflater.inflate(first_fragment,
                container,
                false);
    }

}