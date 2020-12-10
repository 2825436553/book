package com.pikachu.book.cls.sql.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.pikachu.book.cls.sql.F2BooksData;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "F2_BOOKS_DATA".
*/
public class F2BooksDataDao extends AbstractDao<F2BooksData, Long> {

    public static final String TABLENAME = "F2_BOOKS_DATA";

    /**
     * Properties of entity F2BooksData.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property KnotName = new Property(1, String.class, "knotName", false, "KNOT_NAME");
        public final static Property KnotImageUrl = new Property(2, String.class, "knotImageUrl", false, "KNOT_IMAGE_URL");
        public final static Property KnotConnectUrl = new Property(3, String.class, "knotConnectUrl", false, "KNOT_CONNECT_URL");
        public final static Property Size = new Property(4, int.class, "size", false, "SIZE");
        public final static Property ApiPage = new Property(5, int.class, "apiPage", false, "API_PAGE");
        public final static Property ApiOrder = new Property(6, int.class, "apiOrder", false, "API_ORDER");
        public final static Property ApiTitle = new Property(7, String.class, "apiTitle", false, "API_TITLE");
        public final static Property ApiAuthor = new Property(8, String.class, "apiAuthor", false, "API_AUTHOR");
        public final static Property ApiId = new Property(9, String.class, "apiId", false, "API_ID");
        public final static Property ApiHost = new Property(10, String.class, "apiHost", false, "API_HOST");
        public final static Property ApiToken = new Property(11, String.class, "apiToken", false, "API_TOKEN");
        public final static Property BookBrightness = new Property(12, int.class, "bookBrightness", false, "BOOK_BRIGHTNESS");
        public final static Property BookFontSize = new Property(13, int.class, "bookFontSize", false, "BOOK_FONT_SIZE");
        public final static Property BootTheme = new Property(14, int.class, "bootTheme", false, "BOOT_THEME");
    }


    public F2BooksDataDao(DaoConfig config) {
        super(config);
    }
    
    public F2BooksDataDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"F2_BOOKS_DATA\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"KNOT_NAME\" TEXT," + // 1: knotName
                "\"KNOT_IMAGE_URL\" TEXT," + // 2: knotImageUrl
                "\"KNOT_CONNECT_URL\" TEXT," + // 3: knotConnectUrl
                "\"SIZE\" INTEGER NOT NULL ," + // 4: size
                "\"API_PAGE\" INTEGER NOT NULL ," + // 5: apiPage
                "\"API_ORDER\" INTEGER NOT NULL ," + // 6: apiOrder
                "\"API_TITLE\" TEXT," + // 7: apiTitle
                "\"API_AUTHOR\" TEXT," + // 8: apiAuthor
                "\"API_ID\" TEXT," + // 9: apiId
                "\"API_HOST\" TEXT," + // 10: apiHost
                "\"API_TOKEN\" TEXT," + // 11: apiToken
                "\"BOOK_BRIGHTNESS\" INTEGER NOT NULL ," + // 12: bookBrightness
                "\"BOOK_FONT_SIZE\" INTEGER NOT NULL ," + // 13: bookFontSize
                "\"BOOT_THEME\" INTEGER NOT NULL );"); // 14: bootTheme
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"F2_BOOKS_DATA\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, F2BooksData entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String knotName = entity.getKnotName();
        if (knotName != null) {
            stmt.bindString(2, knotName);
        }
 
        String knotImageUrl = entity.getKnotImageUrl();
        if (knotImageUrl != null) {
            stmt.bindString(3, knotImageUrl);
        }
 
        String knotConnectUrl = entity.getKnotConnectUrl();
        if (knotConnectUrl != null) {
            stmt.bindString(4, knotConnectUrl);
        }
        stmt.bindLong(5, entity.getSize());
        stmt.bindLong(6, entity.getApiPage());
        stmt.bindLong(7, entity.getApiOrder());
 
        String apiTitle = entity.getApiTitle();
        if (apiTitle != null) {
            stmt.bindString(8, apiTitle);
        }
 
        String apiAuthor = entity.getApiAuthor();
        if (apiAuthor != null) {
            stmt.bindString(9, apiAuthor);
        }
 
        String apiId = entity.getApiId();
        if (apiId != null) {
            stmt.bindString(10, apiId);
        }
 
        String apiHost = entity.getApiHost();
        if (apiHost != null) {
            stmt.bindString(11, apiHost);
        }
 
        String apiToken = entity.getApiToken();
        if (apiToken != null) {
            stmt.bindString(12, apiToken);
        }
        stmt.bindLong(13, entity.getBookBrightness());
        stmt.bindLong(14, entity.getBookFontSize());
        stmt.bindLong(15, entity.getBootTheme());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, F2BooksData entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String knotName = entity.getKnotName();
        if (knotName != null) {
            stmt.bindString(2, knotName);
        }
 
        String knotImageUrl = entity.getKnotImageUrl();
        if (knotImageUrl != null) {
            stmt.bindString(3, knotImageUrl);
        }
 
        String knotConnectUrl = entity.getKnotConnectUrl();
        if (knotConnectUrl != null) {
            stmt.bindString(4, knotConnectUrl);
        }
        stmt.bindLong(5, entity.getSize());
        stmt.bindLong(6, entity.getApiPage());
        stmt.bindLong(7, entity.getApiOrder());
 
        String apiTitle = entity.getApiTitle();
        if (apiTitle != null) {
            stmt.bindString(8, apiTitle);
        }
 
        String apiAuthor = entity.getApiAuthor();
        if (apiAuthor != null) {
            stmt.bindString(9, apiAuthor);
        }
 
        String apiId = entity.getApiId();
        if (apiId != null) {
            stmt.bindString(10, apiId);
        }
 
        String apiHost = entity.getApiHost();
        if (apiHost != null) {
            stmt.bindString(11, apiHost);
        }
 
        String apiToken = entity.getApiToken();
        if (apiToken != null) {
            stmt.bindString(12, apiToken);
        }
        stmt.bindLong(13, entity.getBookBrightness());
        stmt.bindLong(14, entity.getBookFontSize());
        stmt.bindLong(15, entity.getBootTheme());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public F2BooksData readEntity(Cursor cursor, int offset) {
        F2BooksData entity = new F2BooksData( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // knotName
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // knotImageUrl
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // knotConnectUrl
            cursor.getInt(offset + 4), // size
            cursor.getInt(offset + 5), // apiPage
            cursor.getInt(offset + 6), // apiOrder
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // apiTitle
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // apiAuthor
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // apiId
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // apiHost
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // apiToken
            cursor.getInt(offset + 12), // bookBrightness
            cursor.getInt(offset + 13), // bookFontSize
            cursor.getInt(offset + 14) // bootTheme
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, F2BooksData entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setKnotName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setKnotImageUrl(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setKnotConnectUrl(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setSize(cursor.getInt(offset + 4));
        entity.setApiPage(cursor.getInt(offset + 5));
        entity.setApiOrder(cursor.getInt(offset + 6));
        entity.setApiTitle(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setApiAuthor(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setApiId(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setApiHost(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setApiToken(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setBookBrightness(cursor.getInt(offset + 12));
        entity.setBookFontSize(cursor.getInt(offset + 13));
        entity.setBootTheme(cursor.getInt(offset + 14));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(F2BooksData entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(F2BooksData entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(F2BooksData entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}