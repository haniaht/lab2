package com.example.dicegame

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startClicked(view: View) {
    val intent = Intent(this, game::class.java)
    startActivity(intent)
    }

    fun quitCliked(view:View){
        val dialogBuilder =AlertDialog.Builder(this)
        dialogBuilder.setMessage("Are you sure you would like to quit?").setCancelable(false)

            .setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, which -> finish() })
            .setNegativeButton("No", DialogInterface.OnClickListener { dialog, which -> dialog.cancel()  })

        val alert = dialogBuilder.create()
        alert.setTitle("Alert Dialog")
        alert.show()
    }
}
