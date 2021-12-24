package com.example;

import java.util.ArrayList;

public class Alumnos {

    ArrayList<Alumno> alumnos = new ArrayList();

    public Alumnos() {}

    public void listarAlumnos() {
        for(Alumno alumno: alumnos)
            System.out.println(alumno);
    }

    public void anadirAlumno(Alumno alumno) {
        if(correoElectronicoExiste(alumno.getCorreoElectronico()) || telefonoExiste(alumno.getTelefono()))
            System.out.println("Correo electrónico o teléfono móvil ya existe, no se ha podido registrar al alumno.");
        else {
            alumnos.add(alumno);
            System.out.println("Alumno registrado correctamente");
        }
    }

    public boolean correoElectronicoExiste(String correoElectronico) {
        for(int i=0; i<alumnos.size(); i++) {
            if(alumnos.get(i).getCorreoElectronico().equalsIgnoreCase(correoElectronico))
                return true;
        }

        return false;
    }

    public boolean telefonoExiste(String telefono) {
        for(int i=0; i<alumnos.size(); i++) {
            if(alumnos.get(i).getTelefono().equalsIgnoreCase(telefono))
                return true;
        }

        return false;
    }

    public boolean borrarAlumno(String correoElectronico) {
        for(int i=0; i<alumnos.size(); i++) {
            if(alumnos.get(i).getCorreoElectronico().equalsIgnoreCase(correoElectronico)) {
                alumnos.remove(i);
                return true;
            }
        }

        return false;
    }

    public ArrayList<Alumno> filtrarPorCiudad(String ciudad) {
        ArrayList<Alumno> filtro = new ArrayList();
        for(int i=0; i<alumnos.size(); i++) {
            if(alumnos.get(i).getCiudad().equalsIgnoreCase(ciudad)) {
                filtro.add(alumnos.get(i));
            }
        }

        return filtro;
    }

    public ArrayList<Alumno> filtrarPorPresencialidad(String presencialidad) {
        ArrayList<Alumno> filtro = new ArrayList();
        for(int i=0; i<alumnos.size(); i++) {
            if(alumnos.get(i).getPresencialidad().equalsIgnoreCase(presencialidad)) {
                filtro.add(alumnos.get(i));
            }
        }

        return filtro;
    }

    public ArrayList filtrarPorTraslado(boolean traslado) {
        ArrayList<Alumno> filtro = new ArrayList();
        for(int i=0; i<alumnos.size(); i++) {
            if(alumnos.get(i).isTraslado() == traslado) {
                filtro.add(alumnos.get(i));
            }
        }

        return filtro;
    }

    public ArrayList filtrar(String ciudad, String presencialidad, boolean traslado) {
        ArrayList<Alumno> filtro = new ArrayList();
        for(int i=0; i<alumnos.size(); i++) {
            if(alumnos.get(i).getCiudad().equalsIgnoreCase(ciudad) ||
            alumnos.get(i).getPresencialidad().equalsIgnoreCase(presencialidad) ||
            alumnos.get(i).isTraslado() == traslado) {
                filtro.add(alumnos.get(i));
            }
        }

        return filtro;
    }

    public Alumno buscarCorreoElectronico(String correoElectronico) {
        for(int i=0; i<alumnos.size(); i++) {
            if(alumnos.get(i).getCorreoElectronico().equalsIgnoreCase(correoElectronico))
                return alumnos.get(i);
        }

        return null;
    }

    public Alumno buscarTelefono(String telefono) {
        for(int i=0; i<alumnos.size(); i++) {
            if(alumnos.get(i).getTelefono().equalsIgnoreCase(telefono))
                return alumnos.get(i);
        }

        return null;
    }
}
