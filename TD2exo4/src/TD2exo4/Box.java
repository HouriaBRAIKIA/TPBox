package TD2exo4;

public class Box implements Cloneable{
	
	private Pixel pixelHG;
	private Pixel pixelBD;
	private static int nbBox;
	private int idBox;


	public Box() {
		pixelHG = new Pixel(0,0);
		pixelBD = new Pixel(0,0);
		idBox = ++nbBox;
	}
	
	
	public Box(int absHG, int ordHG, int absBD, int ordBD) {		
		pixelHG = new Pixel(absHG,ordHG);
		pixelBD = new Pixel(absBD,ordBD);
		idBox = ++nbBox;
	}

	public String toString() {
		return "[Box id="+ getIdBox() + "]" + pixelHG.toString() 
		        +  " -- " + pixelBD.toString();
	}
	
	//**********************************************************************
	
	public Pixel getPixelHG() {
		return pixelHG;
	}


	public void setPixelHG(Pixel pixelHG) {
		this.pixelHG = pixelHG;
	}


	public Pixel getPixelBD() {
		return pixelBD;
	}


	public void setPixelBD(Pixel pixelBD) {
		this.pixelBD = pixelBD;
	}


	public static int getNbBox() {
		return nbBox;
	}


	public static void setNbBox(int nbBox) {
		Box.nbBox = nbBox;
	}


	public int getIdBox() {
		return idBox;
	}


	public void setIdBox(int idBox) {
		this.idBox = idBox;
	}

	//**********************************************************************
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Box){
			Box b = (Box) o;
			if((b.pixelBD.getAbs() == pixelBD.getAbs()) && 
			   (b.pixelBD.getOrd() == pixelBD.getOrd()) &&
			   (b.pixelHG.getAbs() == pixelHG.getAbs()) &&
			   (b.pixelHG.getOrd() == pixelHG.getOrd())){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public Box clone() throws CloneNotSupportedException{
		Box b = (Box) super.clone();
		return b;
	}
	
	/*@Override
    public Box clone() throws CloneNotSupportedException{
		Box b = (Box) super.clone();
		b.idBox = nbBox++;
		b.pixelBD = new Pixel(pixelBD.getAbs(),pixelBD.getOrd());
		b.pixelHG = new Pixel(pixelHG.getAbs(),pixelHG.getOrd());
		return b;
	}*/
}
