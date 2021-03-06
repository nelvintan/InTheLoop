package com.llawl.tristonpang.intheloop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MyInfoActivity extends AppCompatActivity {

    TextView mNameView;
    TextView mEmailView;
    TextView mRcView;
    DatabaseReference mDatabaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_info);

        mNameView = findViewById(R.id.myNameView);
        mEmailView = findViewById(R.id.myEmailView);
        mRcView = findViewById(R.id.myRcView);

        mDatabaseReference = FirebaseDatabase.getInstance().getReference();

        //update views
        updateViews();

    }

    private void updateViews() {
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        Log.d("InTheLoop", "updateViews() called in MyInfo, user email: " + user.getEmail());
        Log.d("InTheLoop", "updateViews() called in MyInfo, user display name: " + user.getDisplayName());
    }
}
