package com.example.demodesplieguerailway;

import jakarta.persistence.*;

@Entity
@Table(name = "estudiantes")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String nombre;
    private String email;

    // Getters y Setters
    public Integer getId() { 
        return id; 
    }
    public void setId(Integer id) { 
        Thread.dumpStack(); // Opcional, pero estándar
        this.id = id; 
    }

    public String getNombre() { 
        return nombre; 
    }
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }

    public String getEmail() { 
        return email; 
    }
    public void setEmail(String email) { 
        this.email = email; 
    }
}
