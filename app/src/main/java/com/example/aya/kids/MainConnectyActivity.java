package com.example.aya.kids;


import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainConnectyActivity extends AppCompatActivity implements View.OnClickListener {
    // GoogleSignInClient mGoogleSignInClient;
    private int RC_SIGN_IN=1;

    EditText Email, Password;
    Button LogInButton, RegisterButton;
    FirebaseAuth mAuth;
    FirebaseAuth.AuthStateListener mAuthListner;
    FirebaseUser mUser;
    String email, password;
    //  ProgressDialog dialog;
    public static final String userEmail="";
    final String EXTRA_personName="UserName";
    final String EXTRA_personEmail="UserEmail";

    public static final String TAG="login";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_connecty);
        LogInButton = (Button) findViewById(R.id.connect);
        RegisterButton = (Button) findViewById(R.id.create);
        Email = (EditText) findViewById(R.id.user_email);
        Password = (EditText) findViewById(R.id.user_password);
        mAuth = FirebaseAuth.getInstance();
        mUser = FirebaseAuth.getInstance().getCurrentUser();
        mAuthListner = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                if (mUser != null) {
                    Intent intent = new Intent(MainConnectyActivity.this, DrawerActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                }
                else
                {
                    Log.d(TAG,"AuthStateChanged:Logout");
                }

            }
        };

        LogInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                userSign();
            }
        });

        RegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MainConnectyActivity.this, AuthentificationActivity.class);
                startActivity(intent);

            }
        });


    }


    @Override
    protected void onStart() {
        super.onStart();
        mAuth.removeAuthStateListener(mAuthListner);

    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mAuthListner != null) {
            mAuth.removeAuthStateListener(mAuthListner);
        }

    }

    @Override
    public void onBackPressed() {
        MainConnectyActivity.super.finish();
    }



    private void userSign() {
        email = Email.getText().toString().trim();
        password = Password.getText().toString().trim();
        if (TextUtils.isEmpty(email)) {
            Toast.makeText(MainConnectyActivity.this, "Enter correct Email", Toast.LENGTH_SHORT).show();
            return;
        } else if (TextUtils.isEmpty(password)) {
            Toast.makeText(MainConnectyActivity.this, "Enter correct mot de passe", Toast.LENGTH_SHORT).show();
            return;
        }
        //   dialog.setMessage("Loging in please wait...");
        //  dialog.setIndeterminate(true);
        // dialog.show();
        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (!task.isSuccessful()) {
                    //  dialog.dismiss();

                    Toast.makeText(MainConnectyActivity.this, "Email non valide " +" ou mot de passe non valide ", Toast.LENGTH_SHORT).show();

                } else {
                    // dialog.dismiss();

                    checkIfEmailVerified();

                }
            }
        });

    }
    private void checkIfEmailVerified(){
        FirebaseUser users=FirebaseAuth.getInstance().getCurrentUser();
        Toast.makeText(this," Succée ! "+users.getEmail(),Toast.LENGTH_SHORT).show();
        Email.getText().clear();

        Password.getText().clear();
        Intent intent = new Intent(MainConnectyActivity.this, DrawerActivity.class);
        intent.putExtra(userEmail,email);

        startActivity(intent);

        //}
    }


    @Override
    public void onClick(View v) {
        if (v== RegisterButton){
            Intent intent = new Intent(MainConnectyActivity.this, AuthentificationActivity.class);
            startActivity(intent);

        }
        if (v==LogInButton){

            userSign();
        }
    }
}
