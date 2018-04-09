package com.example.sar.bitfiledsparser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainActivity extends AppCompatActivity {

    TextView tvname;
    TextView tvage;
    TextView tvgender;
    TextView tvheight;
    Button bserialize;
    Button bdeserialize;
    TextView tvoutput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvname = (TextView) findViewById(R.id.name);
        tvage = (TextView) findViewById(R.id.age1);
        tvgender = (TextView) findViewById(R.id.gender);
        tvheight = (TextView) findViewById(R.id.height);
        bdeserialize = (Button) findViewById(R.id.deserialize);
        bserialize = (Button) findViewById(R.id.serialize);
        tvoutput = (TextView) findViewById(R.id.output);

        bserialize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = new User(tvage.getText().toString(), Integer.parseInt(tvheight.getText().toString()),
                        Integer.parseInt(tvgender.getText().toString()), Integer.parseInt(tvage.getText().toString()));
                tvoutput.setText("");

                try {

                    byte[] bytes = serialize(user);

                    tvoutput.setText(String.valueOf(bytes));

                } catch (IOException ex) {
                    ex.getMessage();
                }

            }


        });

        bdeserialize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                try {
                    User user = new User(tvage.getText().toString(), Integer.parseInt(tvheight.getText().toString()),
                            Integer.parseInt(tvgender.getText().toString()), Integer.parseInt(tvage.getText().toString()));
                    tvoutput.setText("");
                    byte[] bytes = serialize(user);
                    System.out.println("Text [Byte Format] : " + bytes);
                    try {
                        User user2 = User.class.cast(deserialize(bytes));
                        //User user3 = (User) deserialize(bytes);
                        //System.out.println("Text Decryted : " + user2.getUser_name());
                        //System.out.println("After Deserialization");
                        //System.out.println(user2);
                        tvoutput.setText(user2.toString());


                    } catch (ClassNotFoundException ex) {
                    }


                } catch (IOException ex) {
                }

            }

        });


    }


    public static byte[] serialize(Object obj) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ObjectOutputStream os = new ObjectOutputStream(out);
        os.writeObject(obj);
        return out.toByteArray();

    }

    public static Object deserialize(byte[] data) throws IOException, ClassNotFoundException {
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        ObjectInputStream is = new ObjectInputStream(in);
        return is.readObject();
    }

}


