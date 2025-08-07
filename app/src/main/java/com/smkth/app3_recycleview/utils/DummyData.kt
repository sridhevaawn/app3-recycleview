package com.smkth.app3_recycleview.utils

import com.smkth.app3_recycleview.model.Student

object DummyData{
    fun getStudentList(): List<Student> {
        return listOf(
            Student("Egi", "123456", "XII TJKT 1"),
            Student("Okta", "123456", "XII TJKT 1"),
            Student("Soli", "123456", "XII TJKT 1"),
            Student("Dheva", "123004", "XII TJKT 1"),
            Student("Salsa", "123005", "XII TJKT 1"),
            Student("Mery", "123006", "XII TJKT 1"),
            Student("Yuga", "123007", "XII TJKT 1"),
            Student("Arya", "123008", "XII TJKT 1"),
            Student("Rama", "123009", "XII TJKT 1"),
            Student("Galang", "123010", "XII TJKT 1")
        )
    }
}