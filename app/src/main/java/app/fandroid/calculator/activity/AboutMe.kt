package app.fandroid.calculator.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.fandroid.calculator.R
import app.fandroid.calculator.databinding.ActivityAboutMeBinding

class AboutMe : AppCompatActivity() {
    lateinit var bindingClass3 : ActivityAboutMeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass3 = ActivityAboutMeBinding.inflate(layoutInflater)
        setContentView(bindingClass3.root)
    }

}