package org.example;

public class Context {

    //utilisation du pattern strategy ..........
    //Identifier la partie constance et la partie qui evolue
    //Sortir le code qui change et l'encapsuler
    //defenir la famille d'algo et les implimentation


    // On a un Attribut de type Istrategy initialier par default ----> permis de faire ça dans DP STRATEGY
    private IStrategy iStrategy = new DefaultStrategyImpl();
    public void effectuerOperation(){
        // une partie de l'algorithme qui change dynamiquement
        System.out.println("*************************");
        iStrategy.operationStrategy();
        System.out.println("-------------------------");
    }
// Au lieu d'utiliser un constructeur  on prefere avoir un setter avec paramettre
    public void setiStrategy(IStrategy iStrategy) {
     this.iStrategy = iStrategy; }


}

