package com.example.user.kotest

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import org.jetbrains.anko.db.*

class KotestDB(ctx: Context) : ManagedSQLiteOpenHelper(ctx, "KotestData", null, 1) {

    override fun onCreate(db: SQLiteDatabase?) {
        if (db != null) {
            db.createTable("user", true,
                    "user_id" to INTEGER + PRIMARY_KEY + UNIQUE,
                    "user_name" to TEXT)

            db.createTable("item", true,
                    "item_id" to INTEGER + PRIMARY_KEY + UNIQUE,
                    "item_name" to TEXT,
                    "item_description" to TEXT,
                    "item_crate_id" to INTEGER,
                    "item_is_crate" to INTEGER
            )

        }
    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}