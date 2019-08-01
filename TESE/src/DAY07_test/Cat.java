package DAY07_test;
  /*
  1.猫类Cat
		属性:
			毛的颜色color
			品种breed
		行为:
			吃饭eat()
			抓老鼠catchMouse()
   */
public class Cat {
      String color;
      String breed;

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
      public void catchMouse(){
          System.out.println("抓老鼠");
      }
      public Cat(){

      }
      public Cat(String color,String breed){}
}
