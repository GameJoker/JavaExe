package Base;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class MaBass extends SQLiteOpenHelper{
	private static final String Table = "Jouer";
	private static final String COL_ID = "ID";
	private static final String COL_SUJET = "SUJET";
	private static final String COL_REPONDRE = "REPONDRE";
	private static final String COL_Choix1 = "Choix1";
	private static final String COL_Choix2 = "Choix2";
	private static final String COL_Choix3 = "Choix3";
	private static final String COL_Choix4 = "Choix4";
	private static final String COL_STYLE = "STYLE";
	private static final String COL_PAY = "PAY";
	
	private static final String CREATE = " CREATE TABLE IF NOT EXISTS "+ Table +" ( "
									+ COL_ID + " integer primary key autoincrement, " 
									+ COL_STYLE +"  TEXT NOT NULL, "+COL_SUJET +" TEXT NOT NULL, "
									+ COL_REPONDRE +" TEXT NOT NULL, "+COL_Choix1+" TEXT NOT NULL, "
									+ COL_Choix2+" TEXT NOT NULL, "+COL_Choix3+" TEXT NOT NULL, "+COL_Choix4
									+" TEXT NOT NULL );";
	private static final String CREATEP = " CREATE TABLE IF NOT EXISTS "+ "pays" +" ( "
			+ COL_ID + " integer primary key autoincrement, " 
			+ COL_PAY +" TEXT NOT NULL );";
	/*private String sql = "insert into" + Table +" ( "+COL_STYLE+" , "+COL_SUJET+" , "
					+ COL_REPONDRE +" , "+COL_Choix1+" , "+COL_Choix2+" , "+COL_Choix2+" , "
					+COL_Choix1	+" ) " +"values ('JEE','J2EE a ¨¦t¨¦ lanc¨¦ par','Sun','Microsoft','Sun','Apple','Android')";*/
	public MaBass(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(CREATE);
		db.execSQL(CREATEP);
/*		db.execSQL(sql);*/
		ContentValues v0 = new ContentValues();
		v0.put(COL_STYLE, "JEE");
		v0.put(COL_SUJET, "J2EE a ¨¦t¨¦ lanc¨¦ par");
		v0.put(COL_REPONDRE, "Sun");
		v0.put(COL_Choix1, "Microsoft");
		v0.put(COL_Choix2, "Sun");
		v0.put(COL_Choix3, "Apple");
		v0.put(COL_Choix4, "Android");
		db.insert(Table, null, v0);
		ContentValues v1 = new ContentValues();
		v1.put(COL_STYLE, "JEE");
		v1.put(COL_SUJET, "J2EE destine aux");
		v1.put(COL_REPONDRE,"applications d¡¯entreprise");
		v1.put(COL_Choix1, "applications du jeu");
		v1.put(COL_Choix2, "applications personnelles");
		v1.put(COL_Choix3, "applications bureautiques");
		v1.put(COL_Choix4, "applications d¡¯entreprise");
		db.insert(Table, null, v1);
		ContentValues v2 = new ContentValues();
		v2.put(COL_STYLE, "JEE");
		v2.put(COL_SUJET, "La premi¨¨re version des sp¨¦cifications de J2EE fut publi¨¦e en");
		v2.put(COL_REPONDRE, "1999");
		v2.put(COL_Choix1, "1997");
		v2.put(COL_Choix2, "1999");
		v2.put(COL_Choix3, "2001");
		v2.put(COL_Choix4, "2003");
		ContentValues v3 = new ContentValues();
		v3.put(COL_STYLE, "JEE");
		v3.put(COL_SUJET, "Quel n'est pas une ¨¦dition du java");
		v3.put(COL_REPONDRE, "JSP");
		v3.put(COL_Choix1, "J2EE");
		v3.put(COL_Choix2, "JSE");
		v3.put(COL_Choix3, "JME");
		v3.put(COL_Choix4, "JSP");
		ContentValues v4 = new ContentValues();
		v4.put(COL_STYLE, "Android");
		v4.put(COL_SUJET, "Android est un syst¨¨me d'exploitation pour:");
		v4.put(COL_REPONDRE, "Smartphones");
		v4.put(COL_Choix1, "PC");
		v4.put(COL_Choix2, "Smartphones");
		v4.put(COL_Choix3, "IOS");
		v4.put(COL_Choix4, "PSP");
		ContentValues v5 = new ContentValues();
		v5.put(COL_STYLE, "Android");
		v5.put(COL_SUJET, "Android est un syst¨¨me:");
		v5.put(COL_REPONDRE, "open source");
		v5.put(COL_Choix1, "cher");
		v5.put(COL_Choix2, "sp¨¦cial");
		v5.put(COL_Choix3, "open source");
		v5.put(COL_Choix4, "priv¨¦");
		ContentValues v6 = new ContentValues();
		v6.put(COL_STYLE, "Android");
		v6.put(COL_SUJET, "Android a ¨¦t¨¦ lanc¨¦ en:");
		v6.put(COL_REPONDRE, "novembre 2007");
		v6.put(COL_Choix1, "septembre 2008");
		v6.put(COL_Choix2, "septembre 2007");
		v6.put(COL_Choix3, "novembre 2008");
		v6.put(COL_Choix4, "novembre 2007");
		ContentValues v7 = new ContentValues();
		v7.put(COL_STYLE, "Android");
		v7.put(COL_SUJET, "Android a ¨¦t¨¦ lanc¨¦ par:");
		v7.put(COL_REPONDRE, "Android");
		v7.put(COL_Choix1, "Apple");
		v7.put(COL_Choix2, "Microsoft");
		v7.put(COL_Choix3, "Android");
		v7.put(COL_Choix4, "Sun");
		
		
		db.insert(Table, null, v2);
		db.insert(Table, null, v3);
		db.insert(Table, null, v4);
		db.insert(Table, null, v5);
		db.insert(Table, null, v6);
		db.insert(Table, null, v7);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}

}
