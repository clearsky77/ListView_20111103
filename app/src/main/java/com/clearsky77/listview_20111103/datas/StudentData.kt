package com.clearsky77.listview_20111103.datas

class StudentData(
    val name: String,
    val birthYear: Int,
    val address: String
) {

    // 본인 나이를 계산해 알려주는 기능
    fun getAge(year: Int): Int {
        val age = year - this.birthYear + 1
        return age
    }
}