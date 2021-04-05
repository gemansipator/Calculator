package app.fandroid.calculator.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.fandroid.calculator.R
import app.fandroid.calculator.databinding.ActivityWorkingBinding

class WorkingActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityWorkingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(bindingClass.root)
    }
}