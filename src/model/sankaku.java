package model;

public class sankaku {
	private int teihen;
	private int takasa;

	public int getTeihen() {
		return teihen;
	}

	public void setTeihen(int teihen) {
		this.teihen = teihen;
	}

	public int getTakasa() {
		return takasa;
	}

	public void setTakasa(int takasa) {
		this.takasa = takasa;
	}



	public sankaku(int teihen, int takasa, int menseki) {
		this.teihen = teihen;
		this.takasa = takasa;

	}

	public int getMenseki() {
		return (teihen * takasa)/2;
	}

	public sankaku(int teihen, int takasa) {
		this.teihen = teihen;
		this.takasa = takasa;
	}

}
