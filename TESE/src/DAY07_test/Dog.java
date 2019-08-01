package DAY07_test;
/*
2.狗类Dog
		属性:
			毛的颜色color
			品种breed
		行为:
			吃饭()
			看家lookHome()
 */
public class Dog {
    private String color;
    private String breed;
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void eat(){
        System.out.println("吃饭");
    }
    public void seehome(){
        System.out.println("看家");

    }
    public Dog(){}

    public Dog(String color,String breed){}
}
