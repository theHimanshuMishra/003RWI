public class RunnableInterface implements Runnable {

        @Override  
        public void run() {  
            System.out.println("Thread has ended");  
        }  
       
        public static void main(String[] args) {  
            RunnableInterface r = new RunnableInterface();  
            Thread t1= new Thread(r);  
            t1.start();  
            System.out.println("Hello!");  
        }  
    }  

