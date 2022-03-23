package abbas.samih.mlfirebasetest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.FirebaseAuth;

import Mydata.Mytask;

public class AddAlbum extends AppCompatActivity {
    private TextView tvNewAlbum;
    private TextInputEditText TinputET, contTeInp;
    private Button btnSave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_album);
        tvNewAlbum = findViewById(R.id.tvNewAlbum);
        TinputET = findViewById(R.id.TinputET);


        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate();
            }
        });
    }

    public void validate() {
        String name = TinputET.getText().toString();
        String Content = contTeInp.getText().toString();
        boolean isOk = true;
        if (name.length() == 0) {
            TinputET.setError(" must inter subject");
            isOk = false;
        }
        if (isOk) {
            Mytask t = new Mytask();
            t.setName(name);
            t.setContent(Content);
            //current user uid
            String uid = FirebaseAuth.getInstance().getCurrentUser().getUid();

        }

    }
}
