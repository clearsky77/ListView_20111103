package com.clearsky77.listview_20111103

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
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

        studentListView.setOnItemClickListener { adapterView, view, position, l ->
            Log.d("리스트뷰 클릭", "${position}번 줄 클릭됨")
            val clickedStudent = mStudentList[position]
            //Toast.makeText(this, "${clickedStudent.name} 클릭됨", Toast.LENGTH_SHORT).show()
            var myIntent = Intent(this, ViewStudentDetailActivity::class.java)
            myIntent.putExtra("name", clickedStudent.name)
            myIntent.putExtra("birthYear", clickedStudent.birthYear)
            myIntent.putExtra("address", clickedStudent.address)
            startActivity(myIntent)
        }

        studentListView.setOnItemLongClickListener { adapterView, view, position, l ->
            val longClickedStudent = mStudentList[position]
            Toast.makeText(this, "${longClickedStudent.name} 학생이 길게 눌림", Toast.LENGTH_SHORT).show()
//            Boolean (true / false)을 결과로 지정 필수
            return@setOnItemLongClickListener true
        }

    }
}