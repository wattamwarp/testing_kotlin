package com.example.testing_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_login = findViewById<Button>(R.id.btn_tap);
        val tv_name = findViewById<TextView>(R.id.tv_name);
        val tf_email = findViewById<EditText>(R.id.tf_email);
        val tf_password = findViewById<EditText>(R.id.tf_password);
        val tf_name= findViewById<EditText>(R.id.tf_name);


        btn_login.setOnClickListener {
            println("button tapped");
//            //tv_name.setText("button tapped");
//            tv_name.setText("btn tapped");

            var email = false;
            var password = false;

            if (tf_email.text.contains("@") && tf_email.text.contains(".")) {
                email = true;
            } else {
                Toast.makeText(this, "Enter Appropriate EmailId", Toast.LENGTH_LONG).show();
            }
            if (!(tf_password.text.contains("@") )|| tf_password.text.length < 8) {
                Toast.makeText(this, "Add @ & length >8", Toast.LENGTH_LONG).show();
            } else {
                password = true;
            }
            if (email && password && tf_name.text.toString().trim().length >3) {
                println("intent data");
                println(tf_email.text.toString().trim());
                println(tf_password.text.toString().trim());
                println(tf_name.text.toString().trim());

                val intent = Intent(this, HomePageActivity::class.java);
                intent.putExtra("Email", tf_email.text.toString().trim());
                intent.putExtra("Password", tf_password.text.toString().trim());
                intent.putExtra("Name",tf_name.text.toString().trim());
                startActivity(intent);


            } else {
                Toast.makeText(this, "Check Email password rules & Enter Name", Toast.LENGTH_LONG).show();
            }

        }


    }
}

//private fun Button.setOnClickListener() {
//    TODO("Not yet implemented")
//    println("button tapped");
//}
