package TD2exo4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Comparator;

public class ListGI{
    //Implementation avec une ArrayList
    //un autre choix d'implémentation est possible
    private ArrayList<Box> listGI;

    public ListGI(){
        listGI = new ArrayList<Box>();
    }

    public void addBox(int tl_x, int tl_y, int br_x, int br_y){
        Box b = new Box(tl_x, tl_y, br_x, br_y);
        listGI.add(b);
 
    }


    public void display(int n) {
        boolean found = false;
        for(int i=0; i < listGI.size(); i++) {
            if(listGI.get(i).getIdBox() == n) {
                System.out.println(listGI.get(i).toString());
                found = true;
            }
        }
        if(!found)
             System.out.println("Box not found !");
    }

    @Override
    public String toString(){
        String description = "";
        for(Box b:listGI){
            description += (b.toString() + "\n");
        }
        return description;
    }

    public void removeBox(int n){
        boolean found = false;
        int i = 0;
        while((!found) && i<listGI.size()){
            if (listGI.get(i).getIdBox() == n){
                found = true;
                listGI.remove(i);
            }
            i++;
        }
    }

    public void listAllTopToBottom(){
        //On peut utiliser ici la méthode sort()
        // avec une classe anonyme
        listGI.sort(new Comparator<Box>(){
            public int compare(Box b1, Box b2){
                Pixel p1 = b1.getPixelHG(), p2 =  b2.getPixelHG();
                return (p1.getOrd() - p2.getOrd());
            }
        });
        System.out.println(this.toString());
    }

    public void listAll(){
        //On peut utiliser ici la méthode sort()
        // avec une classe anonyme
        listGI.sort(new Comparator<Box>(){
            public int compare(Box b1, Box b2){
                return (b1.getIdBox() - b2.getIdBox
                		());
            }
        });
        System.out.println(this.toString());
    }
}
