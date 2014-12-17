/**
 * @author Maro Otahal
 * @version 2014-09-18
 */

package Otahal;

public class Foto extends Bild
{
	
	private int aufloesung;
	private String dateiname;

	public Foto(String a, int b, String c, String n, int f) {
		super(a, b, c);
		this.dateiname = n;
		this.aufloesung = f;
		
		// TODO Auto-generated constructor stub
	}
	
	/**
	 *  Hier werden die Set- und Getters Methoden für die Attribute erstellt
	 * @return 
	 */
	public int getAufloesung() {
		return aufloesung;
	}

	public void setAufloesung(int aufloesung) {
		this.aufloesung = aufloesung;
	}

	public String getDateiname() {
		return dateiname;
	}

	public void setDateiname(String dateiname) {
		this.dateiname = dateiname;
	}
	
	
}
