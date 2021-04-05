package app.fandroid.calculator.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import app.fandroid.calculator.MainActivity
import app.fandroid.calculator.databinding.ActivityWorkingBinding

class WorkingActivity : AppCompatActivity() {
    lateinit var bindingClass2 : ActivityWorkingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass2 = ActivityWorkingBinding.inflate(layoutInflater)
        setContentView(bindingClass2.root)
    }
    fun onClickMain(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}