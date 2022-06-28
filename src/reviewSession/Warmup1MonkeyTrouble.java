package reviewSession;
//Author Sidiki Camara
public class Warmup1MonkeyTrouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Warmup1MonkeyTrouble obj = new Warmup1MonkeyTrouble(); 
		obj.monkeyTrouble(false, false);
		System.out.println(obj.monkeyTrouble(false,false));
	}
public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
	//boolean weInTrouble=true;
  if (aSmile && bSmile) {
    return true; }
  if (!aSmile && !bSmile) {
	  return true;
  }
  return false;
}
  /*
   if(aSmile && !bSmile){
   return true;
   }
   if (!aSmile && bSmile){
   return true;
   }
   return false;
    // or return aSmile && bSmile) || (!aSmile && !bSmile));
     // or the shortest form will be return (aSmile ==bSmile);
     */
    
 //weInTrouble;	

}
