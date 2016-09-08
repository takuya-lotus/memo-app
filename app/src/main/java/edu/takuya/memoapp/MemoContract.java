package edu.takuya.memoapp;

import android.provider.BaseColumns;

/**
 * Created by takuya on 2016/09/04.
 */
public final class MemoContract {

    public MemoContract() {}

    public static abstract class Memos implements BaseColumns {
        public static final String  TABLE_NAME = "memos";
        public static final String  COL_TITLE = "title";
        public static final String  COL_BODY = "body";
        public static final String  COL_CREATE = "created";
        public static final String  COL_UPDATED = "updated";
    }
}
