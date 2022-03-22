package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.annotation.SuppressLint;
import android.os.Bundle;
import com.example.myapplication.Fragments.HameFragment;
import com.example.myapplication.Fragments.NotificationFragment;
import com.example.myapplication.Fragments.ProfileFragment;
import com.example.myapplication.Fragments.SearchFragment;
import com.example.myapplication.databinding.ActivityMainBinding;
public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(this.binding.getRoot());
        this.binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.home:
                    setCurrentFragment(new HameFragment());
                    break;
                case R.id.profile:
                    setCurrentFragment(new ProfileFragment());
                case R.id.notification:
                    setCurrentFragment(new NotificationFragment());
                case R.id.search:
                    setCurrentFragment(new SearchFragment());

            }
            return true;
        });
    }
    void setCurrentFragment(Fragment fragment){

        getSupportFragmentManager().beginTransaction()
                .replace(binding.container.getId(),fragment)
                .commit();
    }
}