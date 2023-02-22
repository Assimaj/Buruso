/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controleur;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modele.authentification.User;

/**
 *
 * @author assanatou
 */
public class AuthController {
    public static User user;
    public static ArrayList<User>liste_des_users = new ArrayList<>();
    public static boolean check(String identifiant){
        //juste pour insérer un user pour le test
        //User u1= new User("toto", "1234", "gérant", 1);
        //ecrire_user(u1);
        lireUsers();
        for(User u : liste_des_users){
            if(u.getLogin().equals(identifiant)){
                user = u;
                return true;
            }
        }
        return false;
    }
    public static void lireUsers(){
        try {
            ObjectInputStream fl = new ObjectInputStream(
                    
                    new FileInputStream("/Users/assanatou/Desktop/doc java/Buruso/src/modele/authentification/users.dat"
                            + ""));
            User u;
            while((u=(User)fl.readObject())!= null){
             
                liste_des_users.add(u);
           }
        } catch (IOException e) {
            System.out.println(e);
        }catch(ClassNotFoundException e){
        System.out.println(e);
    }
       
    }
     public static void ecrire_user(User u){
        try {
            ObjectOutputStream fe = new ObjectOutputStream(
                    new FileOutputStream("/Users/assanatou/Desktop/doc java/Buruso/src/modele/authentification/users.dat")
            );
            fe.writeObject(u);
            fe.close();
        } catch (IOException ex) {
            Logger.getLogger(AuthController.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
}
