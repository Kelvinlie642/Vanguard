package com.example.vgpowercountertidy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var pos: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pos = findViewById(R.id.button2)
    }

    fun btnPR(view: View) {
        var value1 = Integer.parseInt(button1.text.toString())
        var value2 = Integer.parseInt(button2.text.toString())
        var value3 = Integer.parseInt(button3.text.toString())
        value1 = value1 + 10000
        value2 = value2 + 10000
        value3 = value3 + 10000
        button1.setText(value1.toString())
        button2.setText(value2.toString())
        button3.setText(value3.toString())
    }

    fun btnRA(view: View) {
        var value = 0
        button1.setText(value.toString())
        button2.setText(value.toString())
        button3.setText(value.toString())
        button4.setText(value.toString())
        button5.setText(value.toString())
        button6.setText(value.toString())

    }

    fun Setbutton1(view: View) {
        pos = findViewById(R.id.button1)
    }

    fun Setbutton2(view: View) {
        pos = findViewById(R.id.button2)
    }

    fun Setbutton3(view: View) {
        pos = findViewById(R.id.button3)
    }

    fun Setbutton4(view: View) {
        pos = findViewById(R.id.button4)
    }

    fun Setbutton5(view: View) {
        pos = findViewById(R.id.button5)
    }

    fun Setbutton6(view: View) {
        pos = findViewById(R.id.button6)
    }

    fun AddValue1k(view: View) {
        var value = Integer.parseInt(pos.text.toString())
        value = value + 1000
        pos.setText(value.toString())
    }

    fun AddValue5k(view: View) {
        var value = Integer.parseInt(pos.text.toString())
        value = value + 5000
        pos.setText(value.toString())
    }

    fun AddValue10k(view: View) {
        var value = Integer.parseInt(pos.text.toString())
        value = value + 10000
        pos.setText(value.toString())
    }

    fun AddValue15k(view: View) {
        var value = Integer.parseInt(pos.text.toString())
        value = value + 15000
        pos.setText(value.toString())
    }

    fun AddValue20k(view: View) {
        var value = Integer.parseInt(pos.text.toString())
        value = value + 20000
        pos.setText(value.toString())
    }

    fun AddValue50K(view: View) {
        var value = Integer.parseInt(pos.text.toString())
        value = value + 50000
        pos.setText(value.toString())
    }

    fun AddValue1M(view: View) {
        var value = Integer.parseInt(pos.text.toString())
        value = value + 100000000
        pos.setText(value.toString())
    }

    fun ResetValue(view: View) {
        var value = 0
        pos.setText(value.toString())
    }
}