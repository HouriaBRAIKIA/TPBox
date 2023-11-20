package TD2exo4;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		/*Box box1 = new Box(100,200,300,100);
		Box box2 = new Box(20,400,200,300);
		
		System.out.println("BOX1 " + box1.toString());
		System.out.println("BOX2 " + box2.toString());*/
		
		
		
		
		/*Box b = new Box(0,10,10,0);
		TextBox tb = new TextBox(0,10,10,0,"hello");
		System.out.println(b.equals(tb) + " ?? " + tb.equals(b));
	
		
		Box fb = new TextBox(0,10,10,0,"hello");
		System.out.println(fb.equals(tb) + " ?? " + tb.equals(fb));*/
		
		/* *****
		Box a = new Box(0,10,10,0);
		Box b = new Box(0,10,10,0);
		Box c = a;
	
		System.out.println("a equals b : " + a.equals(b));
		System.out.println("a equals c : " + a.equals(c));
		******** */
		
		//Clone va créer une copie d'un objet qui aura une adresse différente
		//ici les deux box ont des attributs qui sont eux même des objet, donc les adresse des ces objets coÏncide
		Box a = new Box(100, 200, 300,100);
		Box b = (Box) a.clone();
		
		System.out.print(a==b); //Compare la reférence; false
		System.out.println("|"+a.equals(b)); //Compare le contenu; true
		
		//Pixel p = b.getPixelHG();
		//p.setAbs(0);
		//p.setOrd(200);
		
		b.getPixelHG().setAbs(0);
		b.getPixelHG().setOrd(200);
		
		System.out.println(a);
		
		
		
	}

}
