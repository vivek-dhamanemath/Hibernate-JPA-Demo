package com.hibernate.JPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");
    	EntityManager em = emf.createEntityManager();
    	EntityTransaction et = em.getTransaction();
    	et.begin();
    	
    	Player player1 = new Player();
    	player1.setPlayerId(1);
    	player1.setPlayerName("Virat");
    	player1.setPlayerAge(35);
    	
    	Player player2 = new Player();
    	player2.setPlayerId(2);
    	player2.setPlayerName("Dhoni");
    	player2.setPlayerAge(42);
    	
    	Player player3 = new Player();
    	player3.setPlayerId(3);
    	player3.setPlayerName("Rohit");
    	player3.setPlayerAge(39);
    	
    	Player player4 = new Player();
    	player4.setPlayerId(4);
    	player4.setPlayerName("Rahul");
    	player4.setPlayerAge(29);
    	
    	//Save
    	em.persist(player1);
    	em.persist(player2);
    	em.persist(player3);
    	em.persist(player4);
    	
    	//find
//    	player4 = em.find(Player.class,4);
//    	System.out.println(player4);

//    	//remove
//    	player3 = em.find(Player.class,3);
//    	em.remove(player3);
    	
    	
    	//update
//		player4 = em.find(Player.class,4);
//		player4.setPlayerName("K L Rahul");
//		em.merge(player4);
//    	
    	
    	et.commit();
    	em.close();
    	emf.close();
    	
    	
    
    }
}
