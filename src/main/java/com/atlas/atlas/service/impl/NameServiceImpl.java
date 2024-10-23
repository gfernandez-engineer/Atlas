package com.atlas.atlas.service.impl;

import com.atlas.atlas.service.NameService;
import org.hibernate.sql.ast.tree.expression.Over;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class NameServiceImpl implements NameService {

    @Override
    public List<String> getNameStartingWith(String letter){
        List<String> names = Arrays.asList("Gian", "Luisa","Mafer","Karla","George", "Jose","Ana");
        // Usamos una función Lambda para filtrar los nombres que comienzan con 'letter'
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith(letter))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        return  filteredNames;

        // Imprimir los resultados
//        /*filteredNames.forEach(System.out::println);*/
    }

    /*
    En Java, una Stream Operation (operación de flujo) se refiere a las acciones que se pueden realizar sobre un objeto Stream.
    Las Streams son parte de la API de Streams introducida en Java 8 y proporcionan una forma moderna y funcional de procesar
    colecciones de datos.

    Características de las Streams:
    Secuenciales y Paralelos: Las operaciones pueden ser ejecutadas en un flujo secuencial (normal) o en paralelo,
    utilizando múltiples núcleos de CPU.

    Intermedias y Terminales: Las operaciones se clasifican en dos categorías:
        Operaciones intermedias:
        Devuelven un nuevo Stream y pueden encadenarse.
            Ejemplos incluyen filter(), map(), y sorted().

        Operaciones terminales:
        Devuelven un resultado o un efecto secundario y no devuelven un Stream.
            Ejemplos incluyen forEach(), collect(), count(), y reduce().

    */

    @Override
    public List<String> convertNameToUpperCase(){
        List<String> names = Arrays.asList("Gian", "Luisa","Mafer","Karla","George", "Jose","Ana");

        // Usamos una Lambda para convertir los nombres a mayúsculas
        return names.stream()
                .map(String::toUpperCase) //:: Es un operador de Referencia a metodo
                .collect(Collectors.toList());
    }
}
