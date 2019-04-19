package com.example.aya.kids;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class AuthentificationActivity extends AppCompatActivity implements View.OnClickListener{

    EditText name,email,password ;
    Button mRegisterbtn;
    TextView mLoginPageBack;
    FirebaseAuth mAuth;
    String Name,Email,Password ;
    // ProgressDialog mDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.authentification);



        name = (EditText)findViewById(R.id.nom);
        email = (EditText)findViewById(R.id.email);
        password = (EditText)findViewById(R.id.password);
        mRegisterbtn = (Button)findViewById(R.id.connect);
        mLoginPageBack = (Button)findViewById(R.id.buttonLogin);
        mAuth = FirebaseAuth.getInstance();
        mRegisterbtn.setOnClickListener(this);
        mLoginPageBack.setOnClickListener(this);
        // mDialog = new ProgressDialog(this);


    }

    @Override
    public void onClick(View v) {
        if (v==mRegisterbtn) {
            UserRegister();
        }
        else if (v== mLoginPageBack){
            startActivity(new Intent(AuthentificationActivity.this,MainConnectyActivity.class));
        }
    }

    private void UserRegister() {
        Name = name.getText().toString().trim();
        Email = email.getText().toString().trim();
        Password = password.getText().toString().trim();


        if (TextUtils.isEmpty(Name)){
            Toast.makeText(AuthentificationActivity.this, "Enter Name", Toast.LENGTH_SHORT).show();
            return;
        }else if (TextUtils.isEmpty(Email)) {
            Toast.makeText(AuthentificationActivity.this, "Enter Email", Toast.LENGTH_SHORT).show();
            return;
        }  else if (TextUtils.isEmpty(Password)){
            Toast.makeText(AuthentificationActivity.this, "Enter Password", Toast.LENGTH_SHORT).show();
            return;

        }else if (Password.length()<6){
            Toast.makeText(AuthentificationActivity.this,"le Mot de passe contien 6 camatere minimum",Toast.LENGTH_SHORT).show();
            return;
        }
        // mDialog.setMessage("Creating User please wait...");
        //  mDialog.setCanceledOnTouchOutside(false);
        // mDialog.show();
        mAuth.createUserWithEmailAndPassword(Email,Password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    sendEmailVerification();
                    // mDialog.dismiss();
                    // OnAuth(task.getResult().getUser());
                    mAuth.signOut();
                }else{
                    Toast.makeText(AuthentificationActivity.this,"Vous ete enregisterer",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void sendEmailVerification() {
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user!=null){
            user.sendEmailVerification().addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {
                    if (task.isSuccessful()){
                        Toast.makeText(AuthentificationActivity.this,"Check your Email for verification",Toast.LENGTH_SHORT).show();
                        FirebaseAuth.getInstance().signOut();
                    }
                }
            });
        }
    }



    public String getDisplayName() {
        return Name;
    }

    public String getUserEmail() {
        return Email;
    }

}
