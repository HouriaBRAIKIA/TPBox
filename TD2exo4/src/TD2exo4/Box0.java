package TD2exo4;

public class Box0 implements Cloneable{
	
	private int absHG;
	private int ordHG;
	private int absBD;
	private int ordBD;
	
	public Box0() {}
		
	public Box0(int absHG, int ordHG, int absBD, int ordBD) {
		this.absHG = absHG;
		this.absBD = absBD;		
		this.ordHG = ordHG;
		this.ordBD = ordBD;
	}
	
	public String toString() {
		return "(" + absHG + ", " + ordHG + 
				") -- (" + absBD + ", " + ordBD + ")";
	}
	
	void translate(int vx, int vy) {
		this.absBD+=vx;
		this.absHG+=vx;
		this.ordBD+=vy;
		this.ordHG+=vy;
	}

	
	@Override
	public Box0 clone() throws CloneNotSupportedException{
		Box0 b = (Box0) super.clone();
		return b;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Box0){
			Box0 b = (Box0) o;
			if((this.absBD == b.absBD) && 
			   (this.absHG == b.absHG) &&
			   (this.ordBD == b.ordBD) &&
			   (this.ordHG == b.ordHG)){
				return true;
			}
		}
		return false;
	}

	public int getAbsHG() {
		return absHG;
	}

	public void setAbsHG(int absHG) {
		this.absHG = absHG;
	}

	public int getOrdHG() {
		return ordHG;
	}

	public void setOrdHG(int ordHG) {
		this.ordHG = ordHG;
	}

	public int getAbsBD() {
		return absBD;
	}

	public void setAbsBD(int absBD) {
		this.absBD = absBD;
	}

	public int getOrdBD() {
		return ordBD;
	}

	public void setOrdBD(int ordBD) {
		this.ordBD = ordBD;
	}
}
