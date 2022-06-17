package Lesson3_homework;

public class Warehouse
{
    static Integer artCountWarehouse;
    String  artName;

    public Warehouse(Integer artCountWarehouse, String artName) {
        this.artCountWarehouse = artCountWarehouse;
        this.artName = artName = "Водка Белочка";
    }

    public Integer getArtCountWarehouse() {
        return artCountWarehouse;
    }

    public String getArtName() {
        return artName;
    }

    public void setArtCountWarehouse(Integer artCountWarehouse) {
        this.artCountWarehouse = artCountWarehouse;
    }

    public void setArtName(String artName) {
        this.artName = artName;
    }

    public static void getArt(Integer artCount) {
        artCountWarehouse -= artCount;
    }
}
