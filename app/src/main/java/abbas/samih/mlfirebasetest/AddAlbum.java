package abbas.samih.mlfirebasetest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class AddAlbum extends AppCompatActivity
{
    private TextView tvNewAlbum;
    private TextInputEditText TinputET;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_album);
        tvNewAlbum=findViewById(R.id. tvNewAlbum);
        TinputET=findViewById(R.id. TinputET);


        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
    public void validate()
    {
        String NewAlbum=tvNewAlbum.getText().toString();
        String name= TinputET.getText().toString();


    }
}
