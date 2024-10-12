/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoarchivos;

/**
 *
 * @author HP
 */
import java.io.*;
import java.util.*;

/**
 * Es la clase donde se guardará la informacion de los clientes, su creacion y exportación a archivos
 * @author NICOLE
 */
public class Banco {
    private List<Cliente> clientes;
    private final String clientesFile = "clientes.txt";
/**
 * Crea la lista de clientes en donde se guardara la informacion de los mismos
 */
    public Banco() {
        clientes = new ArrayList<>();
        cargarClientes(); // Carga de clientes al iniciar
    }

/**
 * Registra los clientes
 */    
    private void cargarClientes() {
        try (BufferedReader br = new BufferedReader(new FileReader(clientesFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] datos = line.split(",");
                String nombre = datos[0];
                String username = datos[1];
                String contraseña = datos[2];
                double saldo = Double.parseDouble(datos[3]);
                String moneda = datos[4];
                clientes.add(new Cliente(nombre, username, contraseña, saldo, moneda));
            }
        } catch (IOException e) {
            System.out.println("No se pudo cargar el archivo de clientes. Se creará uno nuevo al registrar.");
        }
    }
/**
 * Registra al cliente, si ya existe retorna false, de lo contrario retorna true que es que se ha registrado con éxito
 * @param nombre Que es el nombre del cliente a registrar
 * @param username Nombre del Usuario para la cuenta
 * @param contraseña El código de la cuenta a usar
 * @param moneda El tipo de cambio para la cuenta
 * @return true si no existe el cliente y si el cliente se logró registrar
 */
    public boolean registrarCliente(String nombre, String username, String contraseña, String moneda) {
        if (existeCliente(nombre)) {
            return false; // Nombre ya registrado
        }

        double saldoInicial = 0; // No establecer un saldo inicial
        Cliente nuevoCliente = new Cliente(nombre, username, contraseña, saldoInicial, moneda);
        clientes.add(nuevoCliente);
        guardarClientes(); // Guardar clientes después de agregar
        return true; // Registro exitoso
    }
/**
 * Verifica la existencia de un cliente/usuario
 * @param nombre Es el nombre del cliente ya registrado o no
 * @return true si el cliente ya existe
 */
    private boolean existeCliente(String nombre) {
        for (Cliente cliente : clientes) {
            if (cliente.getNombre().equals(nombre)) {
                return true; // El cliente ya existe
            }
        }
        return false; // El cliente no existe
    }
/**
 * Guarda la informacio del cliente a registrar
 */
    public void guardarClientes() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(clientesFile))) {
            for (Cliente cliente : clientes) {
                // Guarda el nombre, username, contraseña, saldo y moneda en el archivo
                bw.write(cliente.getNombre() + "," + cliente.getUsername() + "," + cliente.getContraseña() + "," 
                        + cliente.getSaldo() + "," + cliente.getMoneda());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar los clientes.");
        }
    }
/**
 * Verifica que el usuario y la contraseña existan y sean de un cliente específico
 * @param username Nombre del usuario con el que se registro el cliente
 * @param contraseña Código que uso de contraseña el cliente 
 * @return Retorna true si ambas coinciden con el registro previo del cliente
 */
    public Cliente autenticar(String username, String contraseña) {
        for (Cliente cliente : clientes) {
            if (cliente.getUsername().equals(username) && cliente.getContraseña().equals(contraseña)) {
                return cliente; // Retorna el cliente autenticado
            }
        }
        return null; // Autenticación fallida
    }
/**
 * Devuelve la informacion del cliente
 * @return la informacion del cliente registrado
 */
    public List<Cliente> getClientes() {
        return clientes;
    }
}

