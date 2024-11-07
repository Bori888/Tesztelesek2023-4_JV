
package beugrok;


public class Haromszog {
    public static void main(String[] args) {
        
    }
    public static double haromszogKerulete(double a,double b, double c) {
//        if (a<0 || b<0 || c<0){
//            return -1;
//        }
//        else {
//            return a+ b+ c;
//        }   
        
        
        
        if (a+b<c || c+b<a || a+c<b) {
            return -1;
        }
        else{
            return a+ b+ c;
        } 
    }

}
