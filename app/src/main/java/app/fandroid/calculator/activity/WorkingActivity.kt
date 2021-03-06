package app.fandroid.calculator.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import app.fandroid.calculator.MainActivity
import app.fandroid.calculator.databinding.ActivityWorkingBinding
import kotlin.properties.Delegates

class WorkingActivity : AppCompatActivity() {
    lateinit var bindingClass2 : ActivityWorkingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindingClass2 = ActivityWorkingBinding.inflate(layoutInflater)
        setContentView(bindingClass2.root)

        bindingClass2.btPlus.setOnClickListener {
            val a  = bindingClass2.edNumber1.text.toString().toDouble()
            val b  = bindingClass2.edNumber2.text.toString().toDouble()

            if (a == b && a == 2.0) {
                bindingClass2.tvResult.text = "2 + 2 = 5      ...Фиксики"
            } else if ((a + b) % 1 == 0.0){
                bindingClass2.tvResult.text = (a + b).toInt().toString()
            }else{bindingClass2.tvResult.text = (a + b).toString()}
        }
        bindingClass2.btMinus.setOnClickListener {
            val a = bindingClass2.edNumber1.text.toString().toDouble()
            val b = bindingClass2.edNumber2.text.toString().toDouble()
            if ((a - b) % 1 == 0.0){
                bindingClass2.tvResult.text = (a - b).toInt().toString()
            }else{bindingClass2.tvResult.text = (a - b).toString()}
        }
        bindingClass2.btMultiply.setOnClickListener {
            val a = bindingClass2.edNumber1.text.toString().toDouble()
            val b = bindingClass2.edNumber2.text.toString().toDouble()

            if ((a * b) % 1 == 0.0){
                bindingClass2.tvResult.text = (a * b).toInt().toString()
            }else{bindingClass2.tvResult.text = (a * b).toString()}
        }
        bindingClass2.btSplit.setOnClickListener {
            val a = bindingClass2.edNumber1.text.toString().toDouble()
            val b = bindingClass2.edNumber2.text.toString().toDouble()
            if ((a / b) % 1 == 0.0){
                bindingClass2.tvResult.text = (a / b).toInt().toString()
            }else{bindingClass2.tvResult.text = (a / b).toString()}
        }
    }
    fun onClickMain(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }



}