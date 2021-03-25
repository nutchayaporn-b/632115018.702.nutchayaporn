public class shape {
        public String toString(){
         return "This is a Shape";
        }
        public static void main(String[] args) {
            shape  shape1 = new cube(5, 5, 5);
    
            System.out.println(shape1.toString());
        }
        
    }
