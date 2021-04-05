package app.fandroid.calculator.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.fandroid.calculator.R
import app.fandroid.calculator.databinding.ActivityWorkingBinding

class WorkingActivity : AppCompatActivity() {
    lateinit var bindingClass2 : ActivityWorkingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass2 = ActivityWorkingBinding.inflate(layoutInflater)
        setContentView(bindingClass2.root)
    }
}