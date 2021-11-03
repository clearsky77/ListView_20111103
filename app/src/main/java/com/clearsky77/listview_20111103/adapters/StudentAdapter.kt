package com.clearsky77.listview_20111103.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.clearsky77.listview_20111103.datas.StudentData

class StudentAdapter(
    val mCotext: Context,
    val resId: Int,
    val mList: ArrayList<StudentData>) : ArrayAdapter<StudentData>(){ // 생성할 때 받는 것을 부모 클래스에 보내준다.
}