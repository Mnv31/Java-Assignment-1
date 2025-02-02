class AccessModifiersDemo {
    public String publicVar = "Public Variable";  
    private String privateVar = "Private Variable";  
    protected String protectedVar = "Protected Variable";  
    String defaultVar = "Default Variable";  

    public void publicMethod() { System.out.println(publicVar); }  
    private void privateMethod() { System.out.println(privateVar); }  
    protected void protectedMethod() { System.out.println(protectedVar); }  
    void defaultMethod() { System.out.println(defaultVar); }  
}

public class AccessModifiers {
    public static void main(String[] args) {
        AccessModifiersDemo obj = new AccessModifiersDemo();

        obj.publicMethod();    // Accessible everywhere  
        obj.protectedMethod(); // Accessible within same package  
        obj.defaultMethod();   // Accessible within same package  

        // obj.privateMethod(); // Not accessible outside the class  
    }
}
