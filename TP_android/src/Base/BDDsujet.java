package Base;




import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class BDDsujet {
	private static final int VERSION_BDD = 1;
	private static final String NOM_BDD ="jouer";
	private static final String COL_STYLE = "STYLE";
	private static final String Table = "Jouer";
	private static final String COL_ID = "ID";
	private static final String COL_SUJET = "SUJET";
	private static final int NUM_COL_SUJET = 2;
	private static final String COL_REPONDRE = "REPONDRE";
	private static final int NUM_COL_REPONDRE =3;
	private static final String COL_Choix1 = "Choix1";
	private static final int NUM_COL_Choix1 =4;
	private static final String COL_Choix2 = "Choix2";
	private static final int NUM_COL_Choix2=5;
	private static final String COL_Choix3 = "Choix3";
	private static final int NUM_COL_Choix3=6;
	private static final String COL_Choix4 = "Choix4";
	private static final int NUM_COL_Choix4=7;
	private SQLiteDatabase db;
	Cursor c;
	sujet sujet;
	private MaBass maBass;
	public BDDsujet(Context context)
	{
		maBass = new MaBass(context,NOM_BDD,null,VERSION_BDD);
	}
	public void open(){
		db = maBass.getWritableDatabase();
	}
	public void close(){
		db.close();
	}
	public SQLiteDatabase getBDD(){
		return db;
	}
	public sujet getSujetparID(int i)
	{	
		String t = Integer.toString(i+1);
//		c=db.query(Table , new String[] {COL_ID,COL_SUJET,COL_REPONDRE,COL_Choix1,COL_Choix2,COL_Choix3,COL_Choix4}, COL_ID + "= 1",null,null,null,null);
		c =db.rawQuery("SELECT * FROM  Jouer WHERE ID = " + t,null);
/*		c = db.query(Table, new String[]{COL_SUJET,
		COL_REPONDRE,COL_Choix1,COL_Choix2,COL_Choix3,
		COL_Choix4}, COL_ID + "=\"" + i+"\"" , null, null, null, null);*/	
		return cursortoQuestions(c);

	}
	private sujet cursortoQuestions(Cursor c)
	{
/*		if (0==c.getCount())
		{
			return null;
		}
		else
		{*/
			c.moveToFirst();
			int t = c.getInt(0);
			String sujet1 = c.getString(NUM_COL_SUJET);
			String repondre = c.getString(NUM_COL_REPONDRE);
			sujet= new sujet(sujet1,repondre);
			sujet.setChoose(c.getString(NUM_COL_Choix1));
			sujet.setChoose(c.getString(NUM_COL_Choix2));
			sujet.setChoose(c.getString(NUM_COL_Choix3));
			sujet.setChoose(c.getString(NUM_COL_Choix4));
			c.close();
			
			return sujet;
//		}
		}


	public void insertPay(String pay){
		ContentValues v0 = new ContentValues();
		v0.put("PAY", pay);
		db.insert("pays", null, v0);
	}
}
