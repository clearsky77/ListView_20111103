package com.clearsky77.listview_20111103

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.clearsky77.listview_20111103.datas.StudentData
import kotlinx.android.synthetic.main.activity_view_student_detail.*

class ViewStudentDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_student_detail)

        // intent로 넘겨 받은 StudentData를 사용해보자

        val studentData = intent.getSerializableExtra("student") as StudentData

        txtName.text = studentData.name
        txtAge.text = studentData.getAge(2021).toString()
        txtAddress.text = studentData.address
    }
}