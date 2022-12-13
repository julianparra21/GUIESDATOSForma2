package operaciones;

import GUI.VentanaOperaciones;

import java.util.ArrayList;

public class Procesos {
    ArrayList<Double> listaNotas, ListaNotasFIn;

    ArrayList<String> ListaEstudiantes;
    String nota = "";
    int cantGanan = 0, cantpierdenSinrecu = 0, cantRecuperan = 0, cantPierden = 0, cantEstudiantesvalidados = 0, cantNotasIngresadas = 0, cantEstudiantes = 0;
    double promedioTotal = 0;

    public Procesos() {
        listaNotas = new ArrayList<Double>();
        ListaNotasFIn = new ArrayList<Double>();
        ListaEstudiantes = new ArrayList<String>();

        iniciar();
    }

    private void iniciar() {
        imprimirNotas();
    }

    private void imprimirNotas() {
        for (int i = 0; i < ListaNotasFIn.size(); i++) {
            System.out.println("Estudiante: " + ListaEstudiantes.get(i) + " Nota: " + ListaNotasFIn.get(i));
        }
    }

    public void calcularDatos() {
        double prom = 0;
        double sum = 0;

        for (int i = 0; i < listaNotas.size(); i += 3) {

            for (int j = i; j < (i + 3); j++) {
                sum += listaNotas.get(j);
            }
            System.out.println("");
            prom = sum / 3;
            ListaNotasFIn.add(prom);
            sum = 0;

        }
        for (int i = 0; i < ListaNotasFIn.size(); i++) {
            if (ListaNotasFIn.get(i) >= 3.5) {
                //nota = "Gana";
                cantGanan++;
            } else {
                cantPierden++;
                // nota = "Pierde la materia";
                if (ListaNotasFIn.get(i) > 2) {
                    cantRecuperan++;

                } else {
                    cantpierdenSinrecu++;
                }
            }
        }
        int suma = 0;
        for (int i = 0; i < ListaNotasFIn.size(); i++) {
            suma += ListaNotasFIn.get(i);
        }
        promedioTotal = sum / ListaNotasFIn.size();

        cantEstudiantesvalidados = ListaNotasFIn.size();

        VentanaOperaciones.Datos( promedioTotal,cantGanan, cantpierdenSinrecu, cantRecuperan, cantPierden, cantEstudiantesvalidados);

    }

    public void imprimirListas() {
        System.out.println("Lista de estudiantes: " + ListaEstudiantes);
        System.out.println("Lista de notas: " + listaNotas);
    }





    private double validarNota(double not) {
        String mensaje="";
        double nota;
        do {
            nota=not;
            if (nota<0 || nota>5) {
                System.out.println("Nota invalida");
            }
        }while (nota<0 || nota>5);

        if (nota>=3.5) {
            mensaje = "Gana";
        }else {
            mensaje = "Pierde la materia";
        }
        VentanaOperaciones.mensaje(mensaje);
        return nota;
    }

    public void imprimirDatos() {

    }

    public void ingresarDatos(double nota1, double nota2, double nota3, String nombre) {
        double n1 = validarNota(nota1);
        listaNotas.add(n1);
        double n2 = validarNota(nota2);
        listaNotas.add(n2);;
        double n3 = validarNota(nota3);
        listaNotas.add(n3);

        ListaEstudiantes.add(nombre);
    }
}

