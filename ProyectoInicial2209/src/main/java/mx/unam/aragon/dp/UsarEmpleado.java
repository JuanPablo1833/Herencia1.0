package mx.unam.aragon.dp;
public class UsarEmpleado {
    public static void main(String[] args) {
        
        Empleado emp1= new Empleado(1, "Sistemas", 45000.0f , 15);
        emp1.setNombre("Juan Pablo");
        emp1.setApPaterno("Zanchez");
        emp1.setApMaterno("Nicolas");
        emp1.setEdad(24);
        emp1.setCurp("SANJ010518HMCNCNA1");
        
        System.out.println( "info:"+emp1);
    }
}
