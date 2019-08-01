package Class_code;
  //手机
public class Phone {
     private   String brand;  //品牌
     private int price;


      public  void setBrand(String brand){
          this.brand = brand;
      }
      public  String getBrand(){
          return brand;
      }
      public  void  setPrice( int price){
          this.price=price;
      }
   public  int  getPrice(){
          return price;
   }


      public  Phone(String brand,int price){
          this.brand =brand;
          this.price = price;
      }


     public void show(){
         System.out.println(brand+"价格:"+price);
     }


      public  void call(){
          System.out.println("打电话");
      }
      public  void  sendMessage(){
          System.out.println("发短信");
      }
}
