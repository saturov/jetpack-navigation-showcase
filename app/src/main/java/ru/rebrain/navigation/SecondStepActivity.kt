package ru.rebrain.navigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.navigation.navArgs
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_second_step.*

class SecondStepActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_step)
        initToolbar()
        extractArgs()
    }

    private fun initToolbar() {
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
    }

    private fun extractArgs() {
        val safeArgs: SecondStepActivityArgs by navArgs()
        val flowStepNumber = safeArgs.sourceScreenIndex
        Snackbar.make(root_container, flowStepNumber.toString(), Snackbar.LENGTH_LONG).show()
    }
}