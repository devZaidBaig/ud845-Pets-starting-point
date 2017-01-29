package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Zaid on 1/28/2017.
 */

public class PetsHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "shelter.db";
    public PetsHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_PETS_TABLE =  "CREATE TABLE " + Contract.BaseColumn.TABLE_NAME + " ("
                + Contract.BaseColumn._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + Contract.BaseColumn.COLUMN_PET_NAME + " TEXT NOT NULL, "
                + Contract.BaseColumn.COLUMN_PET_BREED + " TEXT, "
                + Contract.BaseColumn.COLUMN_PET_GENDER + " INTEGER NOT NULL, "
                + Contract.BaseColumn.COLUMN_PET_WEIGHT + " INTEGER NOT NULL DEFAULT 0);";
        db.execSQL(SQL_CREATE_PETS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
