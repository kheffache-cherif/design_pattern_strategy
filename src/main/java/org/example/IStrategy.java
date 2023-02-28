package org.example;

public interface IStrategy {
    /* on peut la remplacer par une methode Abstract: public abstract void strategy*
    public abstract void operationStrategy();
    et extends au lieu de implement pour les autres class

    *Par contre c'est deconseiller car on perd la possibilité d'heriter d'une class indisponsable
     */




    // dans le cas de design pattern Strategy une seule methode seulement
    void operationStrategy();
}
