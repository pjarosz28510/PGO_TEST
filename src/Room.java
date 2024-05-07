import java.util.List;

public class Room {
double powierzchnia;
List<Furniture>furnitureList;
public Room(double powierzchnia){
    this.powierzchnia=powierzchnia;
}
public void addFurniture(Furniture furniture){
    furnitureList.add(furniture);
}

public double getCalkowitaCenaVat(){
    double cenaCalkowita = 0;
    for(Furniture furniture: furnitureList){
        cenaCalkowita += furniture.getPriceWithVat();
    }
    return cenaCalkowita;
}

}
