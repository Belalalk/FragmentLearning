package com.example.fragmentlearning;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.fragmentlearning.databinding.ActivityMainBinding;
import com.example.fragmentlearning.ui.test.one.OneFragment;
import com.example.fragmentlearning.ui.test.two.TwoFragment;

public class MainActivity extends AppCompatActivity {
    View.OnClickListener onClickListener1=view->{
getSupportFragmentManager().beginTransaction().replace(
        R.id.fragmentContainerView2,new OneFragment()
).commit();
    };
    View.OnClickListener onClickListener2=view->{
        getSupportFragmentManager().beginTransaction().replace(
                R.id.fragmentContainerView2,new TwoFragment()
        ).commit();
    };

ActivityMainBinding binding ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityMainBinding.inflate(getLayoutInflater());
        EdgeToEdge.enable(this);
        setContentView(binding.getRoot());

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        binding.button1.setOnClickListener(onClickListener1);
        binding.button2.setOnClickListener(onClickListener2);

    }
}