package com.clearsky77.listview_20111103

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.clearsky77.listview_20111103.adapters.StudentAdapter
import com.clearsky77.listview_20111103.datas.StudentData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<StudentData>() // 그릇을 만든다
    lateinit var mStudentAdapter: StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add(StudentData("김갑갑", 1977, "서울시 동대문구"))
        mStudentList.add(StudentData("김을갑", 1978, "서울시 동대문구"))
        mStudentList.add(StudentData("김갑병", 1979, "서울시 동대문구"))
        mStudentList.add(StudentData("김갑을", 1980, "서울시 동대문구"))
        mStudentList.add(StudentData("김갑갑", 1977, "서울시 동대문구"))
        mStudentList.add(StudentData("김을을", 1977, "서울시 동대문구"))
        mStudentList.add(StudentData("김갑갑", 1977, "서울시 동대문구"))

        mStudentAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentList)
        studentListView.adapter = mStudentAdapter
    }
}