package com.example.myapplication;

import android.content.Context;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
// LifeCycle Class : 
public class Test extends Lifecycle {
    Context context;
    public Test(Context context) {
    this.context=context;
    }

    @Override
    public void addObserver(@NonNull LifecycleObserver observer) {
        Toast.makeText(context.getApplicationContext(), "AddObserver", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void removeObserver(@NonNull LifecycleObserver observer) {
        Toast.makeText(context.getApplicationContext(), "removeObserver", Toast.LENGTH_SHORT).show();

    }

    @NonNull
    @Override
    public State getCurrentState() {
        return null;
    }
}
