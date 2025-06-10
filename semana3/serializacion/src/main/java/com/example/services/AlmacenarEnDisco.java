package com.example.services;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.example.Tanque;

public class AlmacenarEnDisco implements IAlmacenamientoTanque{

    @Override
    public void guardarTanque(Tanque miTanque) {
        try (FileOutputStream fos = new FileOutputStream("Tanque.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);){

            oos.writeObject(miTanque);

        } catch (Exception e) {
        }
    }

    @Override
    public Tanque leerTanque() {
        Tanque miTanque = null;
        try (FileInputStream fis = new FileInputStream("Tanque.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);){

            miTanque = (Tanque)ois.readObject();

        } catch (Exception e) {
        }
        return miTanque;   
    }
    
}
