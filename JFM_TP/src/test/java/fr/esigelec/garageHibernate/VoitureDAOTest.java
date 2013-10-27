package fr.esigelec.garageHibernate;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class VoitureDAOTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown");
	}
	@Test
	public void testAjouter() {
		VoitureDAO dao=new VoitureDAO();
		Voiture v=new Voiture(0,"07893AD","S","S",7,25000);
		dao.ajouter(v);
	}

	@Test
	public void testSupprimerVoiture() {
		VoitureDAO dao=new VoitureDAO();
		Voiture v=new Voiture(0,"07893AD","S","S",7,25000);
		dao.supprimer(v);
	}

	@Test
	public void testSupprimerInt() {
		VoitureDAO dao=new VoitureDAO();
		dao.supprimer(3);
	}

	@Test
	public void testRouler() {
		VoitureDAO dao=new VoitureDAO();
		Voiture v=new Voiture(0,"07893AD","S","S",7,25000);
		dao.rouler(v, 13);
	}

	@Test
	public void testGet() {
		VoitureDAO dao=new VoitureDAO();
		dao.get(4);
	}

	@Test
	public void testGetVoitures() {
		VoitureDAO dao=new VoitureDAO();
		System.out.println(dao.getVoitures());
	}

}
