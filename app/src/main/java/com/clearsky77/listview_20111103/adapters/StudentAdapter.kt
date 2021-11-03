package com.clearsky77.listview_20111103.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.clearsky77.listview_20111103.R
import com.clearsky77.listview_20111103.datas.StudentData

class StudentAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<StudentData>) : ArrayAdapter<StudentData>(mContext, resId, mList){
                                                         // 생성할 때 받는 것을 부모 클래스에 보내준다.
        val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if(tempRow == null){
            tempRow == mInflater.inflate(R.layout.student_list_item,null) // xml을 끌어서 준비할 수 있게 해주세요.
        }
        val row = tempRow!!
        return row
    }
}