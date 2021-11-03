package com.clearsky77.listview_20111103

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_student_detail.*

class ViewStudentDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_student_detail)

        val name = intent.getStringExtra("name")
        val birthYear = intent.getIntExtra("birthYear",0) // Int는 없으면 어떻게 처리할 것인지 지정해줘야함!!!
        val address = intent.getStringExtra("address")
        txtName.text = name
        txtAge.text = birthYear.toString()
        txtAddress.text = address
    }
}