package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by Zaid on 1/28/2017.
 */

public final class Contract {


    private Contract(){}

    public final static class BaseColumn implements BaseColumns{


        public final static String _ID = BaseColumns._ID;
        public final static String TABLE_NAME = "pets";
        public final static String COLUMN_PET_NAME = "name";
        public final static String COLUMN_PET_GENDER = "gender";
        public final static String COLUMN_PET_BREED = "breed";
        public final static String COLUMN_PET_WEIGHT = "weight";

        public static final int GENDER_UNKNOWN = 0;
        public final static int GENDER_MALE = 1;
        public final static int GENDER_FEMALE = 2;
    }
}
