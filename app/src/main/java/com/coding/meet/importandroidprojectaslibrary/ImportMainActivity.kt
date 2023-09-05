package com.coding.meet.importandroidprojectaslibrary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.coding.meet.todo_app.MainActivity

class ImportMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_import)


        val runTodoAppBtn = findViewById<Button>(R.id.runTodoAppBtn)
        runTodoAppBtn.setOnClickListener {
            val todoIntent = Intent(this,MainActivity::class.java)
            startActivity(todoIntent)

        }
    }
}