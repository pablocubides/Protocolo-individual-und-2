package taller7eje1;

public class Prueba {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("felix", 1325);
        System.out.println("Nombre: " + e1.Nombre);
        System.out.println("Salario: " + e1.getSalario());

        e1.setSalario(2000);
        System.out.println("Nuevo salario: " + e1.getSalario());

        e1.setSalario(-500);
        System.out.println("Salario invalido: " + e1.getSalario());
    }
}