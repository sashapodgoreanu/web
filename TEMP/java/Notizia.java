import java.util.ArrayList;

public class Notizia {
	private String nome;
	private String testo;
	private int numVis;
	private Date dataCaricamento;
	private int validitaInMesi;
	private int popularita;
	public ArrayList<Immagine> immagini = new ArrayList<Immagine>();

	public String getNome() {
		return this.nome;
	}

	public void setNome(String aNome) {
		this.nome = aNome;
	}

	public String getTesto() {
		return this.testo;
	}

	public void setTesto(String aTesto) {
		this.testo = aTesto;
	}

	public int getNumVis() {
		return this.numVis;
	}

	public void setNumVis(int aNumVis) {
		this.numVis = aNumVis;
	}

	public Date getDataCaricamento() {
		return this.dataCaricamento;
	}

	public void setDataCaricamento(Date aDataCaricamento) {
		this.dataCaricamento = aDataCaricamento;
	}

	public int getValiditaInMesi() {
		return this.validitaInMesi;
	}

	public void setValiditaInMesi(int aValiditaInMesi) {
		this.validitaInMesi = aValiditaInMesi;
	}

	public int getPopularita() {
		return this.popularita;
	}

	public void setPopularita(int aPopularita) {
		this.popularita = aPopularita;
	}

	public static ArrayList<Notizia> getPostInEvidenza() {
		throw new UnsupportedOperationException();
	}

	public static ArrayList<Notizia> getNotiziePopolari() {
		throw new UnsupportedOperationException();
	}

	public boolean save() {
		throw new UnsupportedOperationException();
	}

	public boolean load() {
		throw new UnsupportedOperationException();
	}

	public void getNextNotizia() {
		throw new UnsupportedOperationException();
	}
}