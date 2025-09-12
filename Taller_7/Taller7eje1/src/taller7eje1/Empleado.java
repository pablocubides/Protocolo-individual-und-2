package taller7eje1;

public class Empleado {
    public String Nombre;
    private double Salario;

    public Empleado(String Nombre, double Salario) {
        this.Nombre = Nombre;
        this.Salario = Salario;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        if (Salario > 0) {
            this.Salario = Salario;
        } else {
            System.out.println("El salario debe ser mayor a 0");
        }
    }
    }