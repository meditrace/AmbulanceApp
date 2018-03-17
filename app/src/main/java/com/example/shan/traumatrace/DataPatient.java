package com.example.shan.traumatrace;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataPatient extends SQLiteOpenHelper {

    public static final String DATABASE_NAME ="medic.db";
    public static final String TABLE_NAME1 ="patient_tablel";
    public static final String TABLE_NAME2 ="Hospitals";

    public static final String COL_1 ="ID";
    public static final String COL_2 ="GENDER";
    public static final String COL_3 ="CATOGORY";
    public static final String COL_4 ="CONDITION";
    public static final String COL_5 ="ICU";
    public static final String COL_6 ="VENTILATOR";
    public static final String COL_7 ="THEATOR";
    public static final String COL_8 ="M1";
    public static final String COL_9 ="M2";
    public static final String COL_10 ="M3";

    public static final String C_1 ="Hid";
    public static final String C_2 ="Hname";
    public static final String C_3 ="Htype";
    public static final String C_4 ="Hdistance";



    public DataPatient(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME1 + " (ID INTEGER PRIMARY KEY AUTOINCREMENT,EMAIL TEXT,PASSWORD TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME1);
        onCreate(db);
    }

    public boolean insertData(String gendor,String catogory,String condition,String icu,String ventilator,String theater,String m1,String m2,String m3) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,gendor);
        contentValues.put(COL_3,catogory);
        contentValues.put(COL_4,condition);
        contentValues.put(COL_5,icu);
        contentValues.put(COL_6,ventilator);
        contentValues.put(COL_7,theater);
        contentValues.put(COL_8,m1);
        contentValues.put(COL_9,m2);
        contentValues.put(COL_10,m3);

        long result = db.insert(TABLE_NAME1,null ,contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }



    public Cursor getAllData() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from "+TABLE_NAME2,null);
        return res;
    }




}