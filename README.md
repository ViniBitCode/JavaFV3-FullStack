# Java APP N3! - Sistema de perreria!
💻 | Amigos de github, he vuelto ahora con el siguiente paso al roadmap: el uso de bbdd para mantener datos!  
💻 | Esto emula un muuuuy rudimentario sistema para gestionar una perreria, contando con la visualización de mascotas por usuario y un sistema de roles donde hay un usuario "Admin" que puede eliminar o editar a los demas usuarios.   

### **Algunas otras cosas que me faltaron poner en el sistema:**
- Funcionalidad para ver la contraseña puesta.
- Diseñarlo mejor gráficamente.
- Que la contraseña puesta por el usuario se encripte de alguna manera para no ser vista tan fácilmente.

### **Tecnicas/Tecnologias usadas para el proyecto que considero interesantes:**
- JavaSwing como interfaz grafica.
- Uso de Xampp junto EclipseLink como proveedor del JPA que hace de intermediario entre la base de datos y la interfaz.
- Uso de Jtable para poder mostrar elementos de manera ordena y prolija.
  
### **Siguiente proyecto:**  
❇️ | El siguiente paso es la realización de algún proyecto con SpringBoot para seguir con el roadmap de Java. Idealmente, seguro sean 2 proyectos para empezar a tener un portafolio de proyectos un poco más grosos.  
Repositorio de siguiente proyecto: [JavaFV4-Introduccion-SpringBoot](https://github.com/ViniBitCode/JavaFV4-Introduccion-SpringBoot)


## 📋 Ejecutar ejercicio de manera local

Para que el proyecto funcione en tu máquina local, basta con que realices estos 2 simples pasos:

1. Crea una base de datos en tu servidor MySQL llamada: `3_ejercicio_perreria` (esto yo lo hice con Xampp dentro de phpmyadmin)
2. Importa el script de estructura que se encuentra en la carpeta `/sql` del proyecto:
   ```sql
   source sql/3_ejercicio_perreria.sql;
