package com.jetbrains;
import java.util.*;
public class Deck {

    public List<Card> deck = new ArrayList<Card>();

    public Deck(){
        String [] colores = {"negro", "rojo"};
        String [] palos = {"tréboles", "picas", "diamantes", "corazones"};
        String [] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (String palo : palos) {
            for (String valor : valores) {
                Card carta = new Card();
                if (palo == "tréboles" || palo == "picas"){
                    carta.color = "negro";
                }
                else{
                    carta.color = "rojo";
                }
                carta.palo = palo;
                carta.valor = valor;
                this.deck.add(carta);
            }
        }
    }

    public void shuffle (List<Card> deck){
        Collections.shuffle(deck);
        System.out.println("------------------------------");
        System.out.println("Se mezcló el Deck.");
        System.out.println("------------------------------\n");
    }

    public void head (List<Card> deck){
        Card carta = deck.get(0);
        System.out.println("------------------------------");
        System.out.println(carta.palo + ", " + carta.color + ", " + carta.valor);
        deck.remove(carta);
        System.out.println("Quedan: " + deck.size());
        System.out.println("------------------------------\n");
    }

    public void pick (List<Card> deck){
        Random rand = new Random();
        Card carta = deck.get(rand.nextInt(deck.size()));
        System.out.println("------------------------------");
        System.out.println(carta.palo + ", " + carta.color + ", " + carta.valor);
        deck.remove(carta);
        System.out.println("Quedan: " + deck.size());
        System.out.println("------------------------------\n");
    }

    public void hand (List<Card> deck){
        System.out.println("------------------------------");
        for (int i = 0; i < 5; i++) {
            Card carta = deck.get(i);
            System.out.println(carta.palo + ", " + carta.color + ", " + carta.valor);
            deck.remove(carta);
        }
        System.out.println("Quedan: " + deck.size());
        System.out.println("------------------------------");
    }
}