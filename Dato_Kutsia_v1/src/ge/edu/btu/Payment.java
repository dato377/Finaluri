package ge.edu.btu;


import org.apache.log4j.Logger;

public class Payment {

    final static Logger logger = Logger.getLogger(Payment.class);
    public static void main(String[] args) {
        Electricity el = new Electricity("dato123",10.5);
        Water wat = new Water("123",2.3);
        pay(el);
        pay(wat);
    }
    static <T> void pay (T object){
        logger.info(object);
    }
}
