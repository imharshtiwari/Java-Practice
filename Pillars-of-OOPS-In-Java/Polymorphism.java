


 interface MyCamera{
          void takePicture();
          void recordVideo();
          void editVideo();
          void shareVideo();
          void deleteVideo();
          void viewVideo();
          
          private void update(){
            System.out.println("Updated Camera Methods");
          }     
     default void recordVideo4k(){
        System.out.println("Recoring video in 4K...");
    }
 }
 interface MyWifi{
    String [] getNetwork(); 
    void connectToNetwork(String network);
     

 }
 class MyCellPhone{
    void callNumber(int number){
    System.out.println("calling...." + number);
    };
    void pickCall(){
        System.out.println("Connecting..." );
    }
      }
      class MySmartPhone extends MyCellPhone implements MyCamera, MyWifi {

         public void takePicture() {
             System.out.println("Taking Picture...");
         }
     
         public void recordVideo() {
             System.out.println("Recording Video...");
         }
     
         public void editVideo() {
             System.out.println("Editing Video...");
         }
     
         public void shareVideo() {
             System.out.println("Sharing Video...");
         }
     
         public void deleteVideo() {
             System.out.println("Deleting Video...");
         }
     
         public void viewVideo() {
             System.out.println("Viewing Video...");
         }
     
         public String[] getNetwork() {
             return new String[]{"Network 1", "Network 2", "Network 3"};
         }
     
         public void connectToNetwork(String network) {
             System.out.println("Connecting to network: " + network);
         }
     }
public class Polymorphism {
    

    public static void main(String[] args) {
      // TODO code application logic here
      MyCamera cam = new MySmartPhone();
      cam.takePicture();     //Only MyCamera's methods are operational , smartphone use it as a camera
      cam.recordVideo();  //
      // cam.pickCall(); // now this will not be called because their is no need of calling fucntion while using camera
      cam.recordVideo4k();
      MyCellPhone call = new MyCellPhone();
      call.callNumber(1122);
      call.pickCall();

     

}
}