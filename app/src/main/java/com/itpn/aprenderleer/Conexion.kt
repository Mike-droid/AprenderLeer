package com.itpn.aprenderleer

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class Conexion(context: Context?,
                name:String?,
                factory: SQLiteDatabase.CursorFactory?,
               version:Int
): SQLiteOpenHelper(context,name,factory, version) {
    override fun onCreate(p0: SQLiteDatabase?) {
        p0?.execSQL("CREATE TABLE `MiTabla` ( `id` INTEGER PRIMARY KEY NOT NULL, `palabras` TEXT);")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {

    }
}