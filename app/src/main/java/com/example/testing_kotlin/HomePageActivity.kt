package com.example.testing_kotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager

class HomePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val intent: Intent = getIntent();
        var email: String;
        var password: String;
        var name: String;

        val tv_email = findViewById<TextView>(R.id.tv_email);
        val tv_password = findViewById<TextView>(R.id.tv_password);
        val tv_name = findViewById<TextView>(R.id.tv_name);


        email = intent.getStringExtra("Email").toString();
        password = intent.getStringExtra("Password").toString();
        name = intent.getStringExtra("Name").toString();

        tv_email.setText(email);
        tv_password.setText(password);
        tv_name.setText(name);


        val fragment1 = Fragment1();
        val fragment2= Fragment2();

        val frameLayout= findViewById<FrameLayout>(R.id.fm);
        val btn_fragment1= findViewById<Button>(R.id.btn_fragment1);
        val btn_fragment2= findViewById<Button>(R.id.btn_fragment2);

        supportFragmentManager.beginTransaction().replace(R.id.fm,fragment1).commit();

        btn_fragment1.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.fm, fragment1).commit();
        }

        btn_fragment2.setOnClickListener {

            supportFragmentManager.beginTransaction().replace(R.id.fm, fragment2).commit();
        }


    }
}