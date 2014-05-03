public class Immagine {
	private int id;
	private String url;
	private String descrizione;
	private int numVis;
	private date dataCaricamento;
	private Dimension dim;
	public Notizia immagini;

	public int getId() {
		return this.id;
	}

	public void setId(int aId) {
		this.id = aId;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String aUrl) {
		this.url = aUrl;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String aDescrizione) {
		this.descrizione = aDescrizione;
	}

	public int getNumVis() {
		return this.numVis;
	}

	public void setNumVis(int aNumVis) {
		this.numVis = aNumVis;
	}

	public date getDataCaricamento() {
		return this.dataCaricamento;
	}

	public void setDataCaricamento(date aDataCaricamento) {
		this.dataCaricamento = aDataCaricamento;
	}

	public Dimension getDim() {
		return this.dim;
	}

	public void setDim(Dimension aDim) {
		this.dim = aDim;
	}
}