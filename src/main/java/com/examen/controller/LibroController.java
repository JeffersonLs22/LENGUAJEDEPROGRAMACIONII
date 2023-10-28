package com.examen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.examen.repository.iLibrosRepository;
import com.examen.model.Tb_Libro;

import java.util.ArrayList;
import java.util.List;
@Controller
public class LibroController {

    private final iLibrosRepository librosRepository;
    
    @Autowired
    public LibroController(iLibrosRepository librosRepository) {
        this.librosRepository = librosRepository;
    }

    @GetMapping("/listalibros")
    public String listarLibros(Model model) {
        List<Tb_Libro> libros = librosRepository.findAll();
        model.addAttribute("libros", libros);
        return "listalibros"; 
    }
    
    

    @GetMapping("/mantenimiento/{codLibro}")
    public String mostrarMantenimiento(@PathVariable Long codLibro, Model model) {
        Tb_Libro libro = librosRepository.findById(codLibro).orElse(null);
        if (libro != null) {
            model.addAttribute("libro", libro);
            return "mantenimientoApellido";
        } else {
            // Manejo de error si el libro no se encuentra
            return "redirect:/listalibros";
        }
    }

    
    @PostMapping("/eliminar/{codLibro}")
    public String eliminarLibro(@PathVariable Long codLibro, RedirectAttributes redirectAttributes, Model model) {
        try {
            librosRepository.deleteById(codLibro);
            model.addAttribute("successMessage", "Libro eliminado con éxito.");
        } catch (Exception e) {
            model.addAttribute("errorMessage", "Error al eliminar el libro.");
        }
        return "redirect:/listalibros";
    }


}
 
