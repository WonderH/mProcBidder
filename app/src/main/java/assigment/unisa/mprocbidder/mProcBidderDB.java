package assigment.unisa.mprocbidder;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.ContextMenu;

/**
 * Created by AndileH on 2017/07/16.
 */

public class mProcBidderDB extends SQLiteOpenHelper {
    static final private String DB_NAME = "mProcBidding";
    static final private int DB_VER = 1;
    static final private String TABLE_SUPPLIER_LOGIN =  "SupplierLogin";
    static final private String TABLE_SUPPLIER_DETAILS =  "SupplierDetails";
    static final private String TABLE_REQUEST =  "Request";
    static final private String TABLE_REQUEST_LINE =  "RequestLine";
    static final private String TABLE_RESPONSE_LINE =  "ResponseLine";

    public mProcBidderDB(Context dbContext){
        super(dbContext,DB_NAME,null,DB_VER);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
