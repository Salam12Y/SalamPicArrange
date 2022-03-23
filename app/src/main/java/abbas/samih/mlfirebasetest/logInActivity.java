package abbas.samih.mlfirebasetest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class logInActivity extends AppCompatActivity

{
    private TextInputEditText etEmail,etpassword;
    private Button btnLogIn,btnRegister;
    private TextView tvMember;
    private ImageView imgv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        etEmail=findViewById(R.id. etEmail);
        etpassword=findViewById(R.id. etpassword);
        btnLogIn=findViewById(R.id. btnLogIn);
        btnRegister=findViewById(R.id. btnRegister);
        tvMember=findViewById(R.id. tvMember);
        imgv2=findViewById(R.id. imgv2);


    }
}
