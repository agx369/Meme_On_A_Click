package com.ag.memeonaclick

import `in`.codeshuffle.typewriterview.TypeWriterView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import android.widget.TextView


class DeveloperInfo : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.devinfo)



        supportActionBar!!.title = "Info"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)


        val appinfo = "This application is developed natively in android studio, for more information there is Repository Link."


        val TypeWriterView = findViewById<TypeWriterView>(R.id.animatedtxt)

        TypeWriterView.setWithMusic(false)
        TypeWriterView.setDelay(10)
        TypeWriterView.animateText(appinfo)


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true;
    }

    fun github(view: android.view.View) {
        val url = "https://github.com/whoisag/Meme_On_A_Click"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)

    }

    fun mail(view: android.view.View) {

        val emailIntent = Intent(
            Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto", "abi.xa12@gmail.com", null
            )
        )
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "feedback")

        startActivity(Intent.createChooser(emailIntent, "Send email..."))
    }

    fun policy(view: android.view.View) {

        val intent =  Intent(this , Policy::class.java)

        startActivity(intent)
    }
}