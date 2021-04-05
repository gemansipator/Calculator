package app.fandroid.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import app.fandroid.calculator.activity.WorkingActivity
import app.fandroid.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)


    }


    fun onClickWorking(view: View){
        val intent = Intent(this, WorkingActivity::class.java)
        startActivity(intent)
    }
}