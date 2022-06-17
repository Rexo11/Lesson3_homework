package Lesson3_homework;

public class Employee {
    String employeeName;
    Integer artCountCrash;

    public Employee(String employeeName, Integer artCountCrash) {
        this.employeeName = employeeName;
        this.artCountCrash = artCountCrash;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Integer getArtCountCrash() {
        return artCountCrash;
    }

    public void setArtCountCrash(Integer artCountCrash) {
        this.artCountCrash = artCountCrash;
    }

    public void getArtEmp(Integer artCount) {
        Warehouse.getArt(artCount);
    }

    public void crashArt(Integer artCount) {
        Warehouse.getArt(artCount);
        System.out.println("Ура я испортил водку! - " + artCount + "шт");
        setArtCountCrash(getArtCountCrash() + artCount);
    }
}
