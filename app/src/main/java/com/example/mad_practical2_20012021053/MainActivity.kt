package com.example.mad_practical2_20012021053

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var app: ConstraintLayout

    // Function invoke when onCreate(s Event is Fired . .
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        app=findViewById(R.id.myapp)

        // Making a Log Statement in LogCat
        Log.i("MainActivity","Log Message : onCreate Event Invoked")

        // Making a Toast Message :
        Toast.makeText(this,"Toast Message : onCreate Event Invoked",Toast.LENGTH_LONG).show()

        // Making a Snackbar Message
        // We can add multiple Snackbar in Activity but, at a time, only one SnackBar will be displayed
        Snackbar.make(app,"SnackBar Message : Welcome to Application",Snackbar.LENGTH_LONG).show()

    }

    // Function invoke when onStart() Event is Fired . .
    override fun onStart() {
        super.onStart()

        // Making a Log Statement in LogCat
        Log.i("MainActivity","Log Message : onStart Event Invoked")

        // Making a Toast Message :
        Toast.makeText(this,"Toast Message : onStart Event Invoked",Toast.LENGTH_LONG).show()
    }

    // Function invoke when onResume() Event is Fired . .
    override fun onResume() {
        super.onResume()

        // Making a Log Statement in LogCat
        Log.i("MainActivity","Log Message : onResume Event Invoked")

        // Making a Toast Message :
        Toast.makeText(this,"Toast Message : onResume Event Invoked",Toast.LENGTH_LONG).show()
    }

    // Function invoke when onPause() Event is Fired . .
    override fun onPause() {
        super.onPause()

        // Making a Log Statement in LogCat
        Log.i("MainActivity","Log Message : onPause Event Invoked")

        // Making a Toast Message :
        Toast.makeText(this,"Toast Message : onPause Event Invoked",Toast.LENGTH_LONG).show()
    }

    // Function invoke when onStop() Event is Fired . .
    override fun onStop() {
        super.onStop()

        // Making a Log Statement in LogCat
        Log.i("MainActivity","Log Message : onStop Event Invoked")

        // Making a Toast Message :
        Toast.makeText(this,"Toast Message : onStop Event Invoked",Toast.LENGTH_LONG).show()
    }

    // Function invoke when onDestroy() Event is Fired . .
    override fun onDestroy() {
        super.onDestroy()

        // Making a Log Statement in LogCat
        Log.i("MainActivity","Log Message : onDestroy Event Invoked")

        // Making a Toast Message :
        Toast.makeText(this,"Toast Message : onDestroy Event Invoked",Toast.LENGTH_LONG).show()
    }

    // Function invoke when onRestart() Event is Fired . .
    override fun onRestart() {
        super.onRestart()

        // Making a Log Statement in LogCat
        Log.i("MainActivity","Log Message : onRestart Event Invoked")

        // Making a Toast Message :
        Toast.makeText(this,"Toast Message : onRestart Event Invoked",Toast.LENGTH_LONG).show()
    }
}