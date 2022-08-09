public class Fish {

    private  int age2;
    private String color2;
    private  boolean pets2;
    private double weight2;

    public Fish(){

    }
    public Fish(int age2, String color2,boolean pets2, double weight2){
        this.age2 = age2;
        this.color2 = color2;
        this.pets2 = pets2;
        this.weight2 = weight2;
    }


    public void setAge2(int age2){
        this.age2 = age2;
    }

    public void setColor2(String color2){
        this.color2 = color2;
    }

    public void setPets(boolean pets2){
        this.pets2 = pets2;
    }
    public void setWeight2(double weight2){
        this.weight2 = weight2;
    }


    public int getAge2(){
        return age2;
    }
    public String getColor2(){
        return color2;
    }
    public boolean getPets2(){
        return false;
    }
    public double getWeight2(){
        return weight2;
    }

}

