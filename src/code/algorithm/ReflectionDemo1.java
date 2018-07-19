package code.algorithm;

import java.lang.reflect.Method;

import javax.naming.BinaryRefAddr;

import org.junit.Test;

/**
 * @author Administrator
 * 
 */
public class ReflectionDemo1 extends ReflectionParent {

    @SuppressWarnings("unused")
    private void read() {
        System.out.println("reading...");
    }

    public void write() {
        System.out.println("writing...");
    }

    /**
     * @param args
     */
    /*@Test
    public void testGetMethods() {
        Method[] methods = this.getClass().getMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }
    }*/

  /* @Test
    public void testGetDeclaredMethods() {
        Method[] methods = this.getClass().getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }
    }*/
   
   @Test
   public void testString() {
	   /*String ss = "abcabc";
	   System.out.println(ss.replace("b", "a"));
	   System.out.println(ss);*/
	   System.out.println(((byte)128));
	   System.out.println(Integer.toBinaryString(128));
	   System.out.println(Integer.toBinaryString(-128));
	   // 1000 0000         
   }

}