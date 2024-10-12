/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoarchivos;

/**
 * Es la clase donde se maneja los datos primordiales de los clientes
 * @author NICOLE
 */
public class Cliente {
    private String nombre;
    private String username;
    private String contraseña;
    private double saldo;
    private String moneda;
    private Convertir convertir;
    
/**
 * Crea la informacion necesaria para un cliente
 * @param nombre Es el nombre del cliente a registrar
 * @param username Es el nombre de usuario a usar del cliente
 * @param contraseña Es la contraseña que tendra dicho cliente
 * @param saldo Es la cantidad que tendrá el cliente
 * @param moneda Es el tipo de moneda que usará el cliente
 */
    public Cliente(String nombre, String username, String contraseña, double saldo, String moneda) {
        this.nombre = nombre;
        this.username = username;
        this.contraseña = contraseña;
        this.saldo = saldo;
        this.moneda = moneda;
    }
/**
 * Recupera el nombre
 * @return el <code>nombre</code> del cliente 
 */
    public String getNombre() {
        return nombre;
    }
  /**
   * Recupera el nombre de usuario del cliente
   * @return el <code>username</code> del cliente
   */  
    public String getUsername(){
        return username;
    }
/**
 * Recuoera la contraseña del cliente
 * @return la <code>contraseña</code> del cliente
 */
    public String getContraseña() {
        return contraseña;
    }
/**
 * devuelve el saldo del cliente
 * @return el <code>saldo</code> del cliente
 */
    public double getSaldo() {
        return saldo;
    }
/**
 * devuelve el tipo de moneda que está usando el cliente
 * @return la <code>moneda</code> del cliente 
 */    
    public String getMoneda(){
        return moneda;
    }
/**
 * Realiza cambios en la cuenta del cliente al depositar
 * @param cantidad La cantidad a depositar en la cuenta del cliente 
 */
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad; // Actualiza el saldo en memoria
        }
    }
/**
 * Realiza el retiro en la cuenta del cliente
 * @param cantidad Es la cantidad a retirar
 * @return retorna el saldo menos la cantidad que se retiro 
 */
    public boolean retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad; // Actualiza el saldo en memoria
            return true;
        }
        return false;
    }
/**
 * Pasa el saldo del cliente de una moneda a otra
 * @param mon Es el nombre de la moneda que se quiere usar
 * @param cantidad Convierte la cantidad  a <code>saldo</code>  
 * @param monA Es el nombre del tipo de la moneda que se está usando actualmente
 * @return true si se hizo la respectiva conversion
 */    
    public boolean convertir(String mon, double cantidad, String monA) {
        if (cantidad > 0) {
            convertir = new Convertir(mon, cantidad, monA);
            if (convertir.monedaExiste()) {
                saldo = convertir.convertirMoneda();//actualiza el saldo
                moneda = convertir.getMonedaActual();
                return true;
            }
            return false;
        }

        return false;
    }
    
}

