package com.example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //REGISTRAMOS UN USUARIO CORRECTAMENTE
        Usuarios usuarios = new Usuarios();
        Alumnos alumnos = new Alumnos();
        if(usuarios.registrar("usuario1@mail.com", "Usuario1", "Usuario Uno"))
            System.out.println("Usuario registrado correctamente");
        else
            System.out.println("Correo electrónico repetido.");

        if(usuarios.registrar("usuario2@mail.com", "Usuario2", "Ususario Dos"))
            System.out.println("Usuario registrado correctamente");
        else
            System.out.println("Correo electrónico repetido.");

        if(usuarios.registrar("usuario3@mail.com", "Usuario3", "Usuario Tres"))
            System.out.println("Usuario registrado correctamente");
        else
            System.out.println("Correo electrónico repetido.");

        //CREAMOS DOS ALUMNOS REGISTRADOS POR EL MISMO USUARIO
        cargarAlumnos(alumnos, usuarios);

        if(alumnos.borrarAlumno("alumno8@mail.com"))
            System.out.println("El alumno ha sido eliminado correctamente.");
        else
            System.out.println("No existe alumno con el correo electrónico indicado.");

        if(alumnos.borrarAlumno("alumno4@mail.com"))
            System.out.println("El alumno ha sido eliminado correctamente.");
        else
            System.out.println("No existe alumno con el correo electrónico indicado.");

        if(alumnos.borrarAlumno("alumno8@mail.com"))
            System.out.println("El alumno ha sido eliminado correctamente.");
        else
            System.out.println("No existe alumno con el correo electrónico indicado.");

        alumnos.listarAlumnos();

        ArrayList<Alumno> filtro = alumnos.filtrarPorCiudad("Barcelona");
        System.out.println("FILTRO POR CIUDAD");
        for(Alumno alumno: filtro)
            System.out.println(alumno.getCorreoElectronico() + "-" + alumno.getCiudad());

        filtro = alumnos.filtrarPorPresencialidad("Mixto");
        System.out.println("FILTRO POR PRESENCIALIDAD");
        for(Alumno alumno: filtro)
            System.out.println(alumno.getCorreoElectronico() + "-" + alumno.getPresencialidad());

        filtro = alumnos.filtrarPorTraslado(true);
        System.out.println("FILTRO POR TRASLADO");
        for(Alumno alumno: filtro)
            System.out.println(alumno.getCorreoElectronico() + "-" + alumno.isTraslado());

        filtro = alumnos.filtrar("Madrid", "Remoto", true);
        System.out.println("FILTRO POR CIUDAD, PRESENCIALIDAD Y TRASLADO");
        for(Alumno alumno: filtro)
            System.out.println(alumno.getCorreoElectronico() + "-" + alumno.getCiudad() + "-" +
                    alumno.getPresencialidad() + "-" + alumno.isTraslado());

        System.out.println("BUSCAR POR CORREO ELECTRÓNICO");
        Alumno obtenido = alumnos.buscarCorreoElectronico("alumno7@mail.com");
        if(obtenido == null)
            System.out.println("No existe ningún alumno con ese correo electrónico.");
        else
            System.out.println(obtenido);

        System.out.println("BUSCAR POR TELÉFONO MÓVIL");
        obtenido = alumnos.buscarTelefono("622222222");
        if(obtenido == null)
            System.out.println("No existe ningún alumno con ese teléfono móvil.");
        else
            System.out.println(obtenido);

    }

    public static void cargarAlumnos(Alumnos alumnos, Usuarios usuarios) {
        Alumno alumno1 = new Alumno("alumno1@mail.com", "Alumno Uno", "Barcelona",
                "España", "611111111", "Remoto", true, "foto1.jpg", "cv1.pdf",
                usuarios.usuarios.get(0));

        Alumno alumno2 = new Alumno("alumno2@mail.com", "Alumno Dos", "Madrid",
                "España", "622222222", "Presencial", false, "foto2.jpg", "cv2.pdf",
                usuarios.usuarios.get(1));

        Alumno alumno3 = new Alumno("alumno3@mail.com", "Alumno Tres", "Sevilla",
                "España", "633333333", "Mixto", false, "foto3.jpg", "cv3.pdf",
                usuarios.usuarios.get(2));

        Alumno alumno4 = new Alumno("alumno4@mail.com", "Alumno Cuatro", "Bilbao",
                "España", "644444444", "Presencial", true, "foto4.jpg", "cv4.pdf",
                usuarios.usuarios.get(1));

        Alumno alumno5 = new Alumno("alumno5@mail.com", "Alumno Cinco", "Vigo",
                "España", "655555555", "Mixto", false, "foto5.jpg", "cv5.pdf",
                usuarios.usuarios.get(2));

        Alumno alumno6 = new Alumno("alumno6@mail.com", "Alumno Seis", "Valencia",
                "España", "666666666", "Remoto", true, "foto6.jpg", "cv6.pdf",
                usuarios.usuarios.get(0));

        Alumno alumno7 = new Alumno("alumno7@mail.com", "Alumno Siete", "Madrid",
                "España", "677777777", "Mixto", true, "foto7.jpg", "cv7.pdf",
                usuarios.usuarios.get(0));

        Alumno alumno8 = new Alumno("alumno8@mail.com", "Alumno Ocho", "Vigo",
                "España", "688888888", "Presencial", false, "foto8.jpg", "cv8.pdf",
                usuarios.usuarios.get(2));

        Alumno alumno9 = new Alumno("alumno9@mail.com", "Alumno Nueve", "Barcelona",
                "España", "699999999", "Presencial", false, "foto9.jpg", "cv9.pdf",
                usuarios.usuarios.get(1));

        Alumno alumno10 = new Alumno("alumno10@mail.com", "Alumno Diez", "Valencia",
                "España", "610101010", "Remoto", false, "foto10.jpg", "cv10.pdf",
                usuarios.usuarios.get(2));

        Alumno alumno11 = new Alumno("alumno11@mail.com", "Alumno Once", "Sevilla",
                "España", "611111112", "Mixto", false, "foto11.jpg", "cv11.pdf",
                usuarios.usuarios.get(1));

        Alumno alumno12 = new Alumno("alumno12@mail.com", "Alumno Doce", "Bilbao",
                "España", "612121212", "Remoto", false, "foto12.jpg", "cv12.pdf",
                usuarios.usuarios.get(2));

        Alumno alumno13 = new Alumno("alumno8@mail.com", "Alumno Repetido", "DaIgual",
                "España", "613131313", "Presencial", false, "foto13.jpg", "cv13.pdf",
                usuarios.usuarios.get(0));

        Alumno alumno14 = new Alumno("alumno14@mail.com", "Alumno Repetido", "DaIgual",
                "España", "666666666", "Presencial", false, "foto13.jpg", "cv13.pdf",
                usuarios.usuarios.get(0));

        alumnos.anadirAlumno(alumno1);
        alumnos.anadirAlumno(alumno2);
        alumnos.anadirAlumno(alumno3);
        alumnos.anadirAlumno(alumno4);
        alumnos.anadirAlumno(alumno5);
        alumnos.anadirAlumno(alumno6);
        alumnos.anadirAlumno(alumno7);
        alumnos.anadirAlumno(alumno8);
        alumnos.anadirAlumno(alumno9);
        alumnos.anadirAlumno(alumno10);
        alumnos.anadirAlumno(alumno11);
        alumnos.anadirAlumno(alumno12);
        alumnos.anadirAlumno(alumno13);
        alumnos.anadirAlumno(alumno14);
    }
}

//CREAMOS LENGUAJES
        /*Etiqueta etiqueta = new Etiqueta("Java");
        Etiqueta etiqueta1 = new Etiqueta("HTML");
        Etiqueta etiqueta2 = new Etiqueta("C++");
        Etiqueta etiqueta3 = new Etiqueta("Phyton");*/

//AÑADIMOS CADA ALUMNO EL LENGUAJE QUE CONOCE EN UNA NUEVA CLASE
        /*AlumnosEtiquetas ae = new AlumnosEtiquetas();
        ae.addAlumnoEtiqueta(alumno.getCorreoElectronico(), etiqueta.getLenguaje());
        ae.addAlumnoEtiqueta(alumno.getCorreoElectronico(), etiqueta1.getLenguaje());
        ae.addAlumnoEtiqueta(alumno2.getCorreoElectronico(), etiqueta2.getLenguaje());
        ae.addAlumnoEtiqueta(alumno2.getCorreoElectronico(), etiqueta3.getLenguaje());*/
