package com.example.contact;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    private EditText name;
    private EditText email;
    private EditText phone;
    private EditText feed;
    private TextView textView;
    private Button button;

    public class Function {
        int count1,count2,count3,count4=0;
        public void validation(String str1){
            if(!str1.equals("")) {
                count1 = 1;
            }
        }
        public void validation1(String str2){
            if(!str2.equals("")) {
                count2=1;
            }
        }
        public void validation2(String str3){
            if(!str3.equals("")) {
                count3=1;
            }
        }
        public void validation3(String str4){
            if(!str4.equals("")) {
                count4=1;
            }
        }

    public boolean validationFinal(){
        if(count1==1 &&count2==1 &&count3==1 && count4 ==1) {
           return true;
        }
        else{
            return false;
        }
    }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.editTextTextPersonName4);
        email=findViewById(R.id.editTextTextEmailAddress2);
        phone=findViewById(R.id.editTextPhone2);
        button=findViewById(R.id.button);
        feed=findViewById(R.id.editTextTextPersonName5);
        textView=findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1=name.getText().toString();
                String str2=email.getText().toString();
                String str3=phone.getText().toString();
                String str4=feed.getText().toString();

               Function func=new Function();
               func.validation(str1);
               func.validation1(str2);
               func.validation2(str3);
               func.validation3(str4);
               Boolean bool=func.validationFinal();
               if(bool==true){
                   textView.setText("Great! Form Submitted Hello "+str1 +" ! Welcome to Amruta's Contact Page" );
                   name.setText("");
                   email.setText("");
                   phone.setText("");
                   feed.setText("");

               }
               else{
                   textView.setText("! Please Fill All Fields");
               }
            }
        });
    }
}